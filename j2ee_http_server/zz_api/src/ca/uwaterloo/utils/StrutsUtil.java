package ca.uwaterloo.utils;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

public class StrutsUtil {
	public static void write(HttpServletResponse response,String jsonString) throws IOException{
	    response.setContentType("text/json;charset=utf-8");  
	    //response.setCharacterEncoding("UTF-8");  
	    PrintWriter out = response.getWriter();  
	    out.println(jsonString);  
	    out.flush();  
	    out.close(); 
	}
}
