package com.amani;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
public interface IHelloService {
 
		@WebMethod(operationName="sayHello")
		@WebResult(name = "result")
		public String sayHello(String name);  

}
