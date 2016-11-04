package com.yy.gposc.exception.handler;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller  
public class ErrorPageController implements ErrorController {  
  
 @Value("${error.path:/error}")
 private String errorPath;
 
 @RequestMapping(value="${error.path:/error}")  
    public String handleError(){
	 System.out.println("handleError.....handleError.......");
        return "error/404";  
    }  
   
 @Override  
 public String getErrorPath() {  
  return errorPath;
 }  
  
}