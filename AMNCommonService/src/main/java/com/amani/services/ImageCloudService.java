package com.amani.services;

import java.util.ArrayList;
import java.util.Date; 

import javax.jws.WebService;  
import org.apache.log4j.Logger; 
import com.amani.model.WeiXin.UploadedFileItem;
import com.qiniu.common.QiniuException;
import com.qiniu.http.Response;
import com.qiniu.storage.BucketManager; 
import com.qiniu.storage.model.FileInfo;
import com.qiniu.util.StringMap;
 
@WebService(endpointInterface="com.amani.services.IImageCloudService")
public class ImageCloudService implements IImageCloudService{
	
	private static Logger logger = Logger.getLogger(ImageCloudService.class);

	//单例
			private static  IImageCloudService _instance=new ImageCloudService();
			public static IImageCloudService getInstance() {
				return _instance;
			}
			
	/**
	 * 获取图片服务器上的所有空间
	 * 
	 * @return
	 */
	public String[] getBuckets() {
		// BucketManager bucketManager = new BucketManager(QiniuConfig.auth);
		try {
			return QiniuConfig.getBucketManager().buckets();
		} catch (Exception e) {
			// 请求失败时简单状态信息
			logger.error(String.format("%s getBuckets failed:%s", new Date(),
					e.toString()));

		}
		return null;
	}
	
	/**
	 * 根据指定空间和key获取文件路径
	 *
	 * @param bucket
	 *            空间名
	 * @throws Exception 
	 */
	public String getFileUrl(String bucket,String key) throws Exception{
		if (containsFile(bucket, key)) {
			return String.format("%s/%s",QiniuConfig.getDomain(),key);
		}
		return null;
	}
	
	/**
	 * 根据指定空间和key获取文件路径
	 *
	 * @param bucket
	 *            空间名
	 * @throws Exception 
	 */
	public String getFileUrl(String bucket,String key,int w,int h) throws Exception{
		if (containsFile(bucket, key)) {
			return String.format("%s/%s?imageView2/w%h%s",QiniuConfig.getDomain(),key,w,h);
		}
		return null;
	}
	
	/**
	 * 根据指定空间获取所有文件
	 *
	 * @param bucket
	 *            空间名
	 * @throws Exception 
	 */
	public String[] getFiles(String bucket) throws Exception {
		if (bucket==null || "".equals(bucket)) {
			throw new Exception("bucket 不能为空");
		}
		try {
			logger.debug(String.format("[%s] get space [%s]  file list",
					new Date(), bucket));
			BucketManager.FileListIterator it = QiniuConfig.getBucketManager()
					.createFileListIterator(bucket, null, 100, null);
			ArrayList<String> files = new ArrayList<String>();
			while (it.hasNext()) {
				FileInfo[] items = it.next();

				for (int i = 0; i < items.length; i++) {
					FileInfo fileInfo = items[i];
					files.add(fileInfo.key);
				}

			}
			logger.debug(String.format(
					"[%s] get space [%s]  file list success ", new Date(),
					bucket));
			if (files.size() > 0) {
				String[] result = new String[files.size()];
				return files.toArray(result);
			} else {
				return null;
			}
		} catch (Exception e) {
			logger.debug(String.format(
					"[%s] get space[ %s]  file list failed ,error:%s",
					new Date(), bucket, e.toString()));
		}
		return null;
	}

	/**
	 * 根据空间和资源判断是否重复
	 *
	 * @param bucket
	 *            空间名
	 * @param key
	 *            资源名
	 * @throws Exception 
	 */
	public Boolean containsFile(String bucket, String key) throws Exception {
		if (bucket==null || "".equals(bucket)) {
			throw new Exception("bucket 不能为空");
		}
		if (key==null || "".equals(key)) {
			throw new Exception("key 文件名不能为空");
		}
		String[] buckets = this.getBuckets();
		if (buckets != null && buckets.length > 0) {
			for (int i = 0; i < buckets.length; i++) {
				if (bucket.equals(buckets[i])) {
					String[] files = this.getFiles(bucket);
					if (files != null) {
						for (int j = 0; j < files.length; j++) {
							if (key.equals(files[j])) {
								return true;
							}
						}
					}
				}
			}
		}
		return false;
	}

//	/**
//	 * 文件上传
//	 *
//	 * @param file
//	 *            文件流
//	 * @param bucket
//	 *            空间名
//	 * @param key
//	 *            key，可为 null,如果不为null，作为图片服务上图片的名字
//	 * @param policy
//	 *            上传策略的其它参数，如 new StringMap().put("endUser",
//	 *            "uid").putNotEmpty("returnBody", "")。 scope通过
//	 *            bucket、key间接设置，deadline 通过 expires 间接设置
//	 * @return
//	 */
//	@Override
//	public Boolean uploadFile(File file, String bucket, String key, StringMap policy)
//			throws Exception {
//		if (file == null) {
//			throw new Exception("file 为null");
//		}
//		return this.uploadFile(getFileToByte(file), bucket, key, policy);
//	}


	/**
	 * 文件上传
	 *
	 * @param file
	 *            文件的二进制流
	 * @param bucket
	 *            空间名
	 * @param key
	 *            key，可为 null,如果不为null，作为图片服务上图片的名字
	 * @param policy
	 *            上传策略的其它参数，如 new StringMap().put("endUser",
	 *            "uid").putNotEmpty("returnBody", "")。 scope通过
	 *            bucket、key间接设置，deadline 通过 expires 间接设置
	 * @return
	 */
	public UploadedFileItem uploadFile(byte[] file, String bucket, String key) throws Exception {
		if (file == null) {
			throw new Exception("file 为null");
		}
		if (bucket==null || "".equals(bucket)) {
			throw new Exception("bucket 不能为空");
		}
		if (key==null || "".equals(key)) {
			throw new Exception("key 文件名不能为空");
		}
		UploadedFileItem result = new UploadedFileItem();
		String token = QiniuConfig.getUpToken(bucket, key, null);
		logger.debug(String.format("%s:generate token %s", new Date(), token));
		try {
			logger.debug(String.format(
					"%s:begin updaload file to server space %s name %s",
					new Date(), bucket, key));
		 
			Response res = QiniuConfig.getUploadManager().put(file, key, token);
			if (res.isOK()) {
				logger.debug(String.format("%s:end updaload %s", new Date(),
						res.toString()));
				
				result.setIsOk(true);
				result.setUrl(String.format("%s/%s",QiniuConfig.getDomain(),key)); 
			} else {
				result.setIsOk(false);
				result.setErrorMsg( res.error);
				
				logger.error(String.format("%s:updaload failed:%s,detail:%s",
						new Date(), res.error, res.toString()));
			}
		} catch (QiniuException e) {
			Response r = e.response;
			// 请求失败时简单状态信息
			logger.error(String.format("%s:updaload failed:%s,detail:%s",
					new Date(), r.error, r.toString()));
			result.setIsOk(false);
			result.setErrorMsg( r.error);
		} catch (Exception e) {
			// 请求失败时简单状态信息
			logger.error(String.format("%s:updaload failed,detail:%s",
					new Date(), e.toString()));
			result.setIsOk(false);
			result.setErrorMsg( e.toString());
		}
		 
		return  result;
	}

}
