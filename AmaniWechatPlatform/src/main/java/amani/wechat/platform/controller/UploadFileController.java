package amani.wechat.platform.controller;

import java.io.IOException;
import java.net.MalformedURLException;
 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;  

import com.amani.services.IImageCloudService;
import com.amani.services.ImageCloudService;
import com.amani.services.QiniuConfig;

@Controller
@RequestMapping(value="/imagecloud")
public class UploadFileController { 
	@RequestMapping(value = "/upload", method = RequestMethod.POST)  
	  public String handleFormUpload(@RequestParam("foldername") String foldername,  @RequestParam("filename") String filename) {  
	        //MultipartFile是对当前上传的文件的封装，当要同时上传多个文件时，可以给定多个MultipartFile参数  
//	        if (!file.isEmpty()) {    
					try {
//						byte[] bytes = file.getBytes();  
//					    IImageCloudService client= ImageCloudService.getInstance(); 
//					    client.uploadFile(bytes, QiniuConfig.getDefaultBucket(), foldername+"/"+filename);		
					    return "redirect:uploadSuccess";  
					}
					catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();		 
					}   
//	       }
	      return "redirect:uploadFailure";     
	 }
	@RequestMapping("/uploadfile")
	 public void uploadfile(){
			
    }
}
