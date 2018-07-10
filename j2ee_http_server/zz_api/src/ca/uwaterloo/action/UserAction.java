package ca.uwaterloo.action;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.google.gson.Gson;

import ca.uwaterloo.entity.User;
import ca.uwaterloo.service.UserService;
import ca.uwaterloo.utils.StrutsUtil;

public class UserAction {

	UserService userService = null;
	
	String username;
	String password;
	
	

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	public void execute() {
		User inputUser = new User();
		inputUser.setPassword(password);
		inputUser.setUsername(username);
		HttpServletResponse response = ServletActionContext.getResponse();
		ResultBody<String> res = new ResultBody<String>();
		User user = userService.login(inputUser);
		if(user != null){
			res.setStatusCode(1);
			res.setBody("");
		} else {
			res.setStatusCode(-1);
			res.setBody("");
		}
		
		try {
			StrutsUtil.write(response, new Gson().toJson(res));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
