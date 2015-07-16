package com.amani.services;
 
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;  

import com.amani.model.WeiXin.UploadedFileItem;
import com.qiniu.util.StringMap;

@WebService
public interface IImageCloudService {
	@WebMethod(operationName="uploadFile")
	@WebResult(name = "result")
	UploadedFileItem uploadFile(byte[] file, String bucket, String key)
			throws Exception;
	
	@WebMethod(operationName="containsFile")
	@WebResult(name = "result")
	Boolean containsFile(String bucket, String key) throws Exception;

	@WebMethod(operationName="getFiles")
	@WebResult(name = "result")
	String[] getFiles(String bucket) throws Exception;
	

	@WebMethod(operationName="getFileUrl")
	@WebResult(name = "result")
	String getFileUrl(String bucket,String key) throws Exception;
	
	@WebMethod(operationName="getFileUrl")
	@WebResult(name = "result")
	String getFileUrl(String bucket,String key,int w,int h) throws Exception;

	@WebMethod(operationName="getBuckets")
	@WebResult(name = "result")
	String[] getBuckets();

}
