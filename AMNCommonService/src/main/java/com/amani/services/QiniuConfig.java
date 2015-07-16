package com.amani.services;
 
import java.io.InputStream;
import java.util.Properties;
import com.qiniu.storage.BucketManager;
import com.qiniu.storage.UploadManager;
import com.qiniu.util.Auth;
import com.qiniu.util.StringMap; 

public final class QiniuConfig {
		static String  AK="O851XHQMOevjEJvCBw7rABg_bMvyoxNiLIs-LqnT";
		static String  SK="32Bf79AkDqxqwegqpgeW7QSDklPRph4xU-mq9Hl1"; 
		// 重用 uploadManager。一般地，只需要创建一个 uploadManager 对象
		static UploadManager uploadManager;
	    static BucketManager bucketManager;
	    static  Auth auth = Auth.create(AK,SK); 
	    static String domain = "http://7xkb2m.com1.z0.glb.clouddn.com";
	    static String  bucket="";
	    private static final Object _lockObject= new Object();
	    private QiniuConfig() {
	    }
	    static {
	    	Properties prop = new Properties(); 
	    	try{
	    		 //读取属性文件a.properties
	    		InputStream stream = QiniuConfig.class.getResourceAsStream("qiniuconfig.properties");
	    	    //InputStream in = new BufferedInputStream (new FileInputStream("qiniuserverconfig.properties"));
	    	    prop.load(stream);     ///加载属性列表
	    	    AK=prop.getProperty("ak");
	    	    SK=prop.getProperty("sk");
	    	    domain= prop.getProperty("domain");
	    	    auth = Auth.create(AK,SK);
	    	    
	    	    stream.close();
	    	}catch( Exception e){
	    		
	    	}
		}
	    public static String getDomain() {
			return domain; 
		}
	    public static String getDefaultBucket() {
			return bucket; 
		}
	    
	    
	    public static UploadManager getUploadManager(){
	    	if (uploadManager==null) {
	    		synchronized (_lockObject) {
	    			if (uploadManager==null) {
	    				uploadManager= new UploadManager();
					}
	    		}
			}
	    	return uploadManager;
	    }
	  
	    
	    public static BucketManager getBucketManager(){
	    	if (bucketManager==null) {
	    		synchronized (_lockObject) {
	    			if (bucketManager==null) {
	    				bucketManager=new BucketManager(QiniuConfig.auth);
					}
	    		}
			}
	    	return bucketManager;
	    }

	    // 设置指定上传策略
	    public static  String getUpToken(String bucket,String key,StringMap policy){
	        return auth.uploadToken(bucket, key, 3600, policy);
	    }

	    public static boolean isTravis() {
	        return "travis".equals(System.getenv("QINIU_TEST_ENV"));
	    }
}
