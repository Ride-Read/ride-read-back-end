package com.rideread.login.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rideread.login.dto.LoginDTO;

@Controller
@RequestMapping("/users")
public class LoginController {

	@RequestMapping("/hello")
    public @ResponseBody String test() {
        return "index.jsp";
    }
	
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public @ResponseBody Map<String, Object> login(@RequestParam("username") String username,  
            @RequestParam("password") String password,
            Model param) {
		
		Map<String, Object> result = new HashMap<String, Object>();
		
		result.put("token", "token001");
		result.put("userName", username);
		result.put("status", "0");
		
		return result;
	}
	
	@RequestMapping(value = "/verify_code", method = RequestMethod.GET)
	public @ResponseBody Map<String, Object> verify(@RequestParam("code") String code,  
            Model param) {
		
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("status","0");
		
		return result;
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public @ResponseBody Map<String, Object> register(@RequestParam("nickname") String nickname, 
			@RequestParam("face_url") String face_url,
			@RequestParam("password") String password,
			@RequestParam("phonenumber") String phonenumber,
            Model param) {
		
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("token", "token001");
		result.put("status", "0");
		result.put("phonenumber", "135791113");
		return result;
	}
	
	@RequestMapping(value = "/me", method = RequestMethod.GET)
	public @ResponseBody Map<String, Object> me(@RequestParam("token") String token, 
			@RequestParam("uid") String uid,
            Model param) {
		
		Map<String, Object> result = new HashMap<String, Object>();	
		result.put("face_url", "www.baidu.com/1.jpg");
		result.put("nickname", "Monkey");
		result.put("status", "0");
		result.put("following", "20");
		result.put("follower", "300");
		return result;
	}
	
	@RequestMapping(value = "/follower", method = RequestMethod.GET)
	public @ResponseBody Map<String, Object> follower(@RequestParam("token") String token, 
			@RequestParam("uid") String uid,
            Model param) {
		
		Map<String, Object> result = new HashMap<String, Object>();		
		Map<String, Object> follower = new HashMap<String, Object>();	
		follower.put("face_url", "www.face.com/1.jpg");
		follower.put("uid", "uid123456");
		follower.put("signature", "Sherlock");
		follower.put("nickname", "SH");
		result.put("follower", follower);
		result.put("status", "0");
		return result;
	}
	
	@RequestMapping(value = "/following", method = RequestMethod.GET)
	public @ResponseBody Map<String, Object> following(@RequestParam("token") String token, 
			@RequestParam("uid") String uid,
            Model param) {
		
		Map<String, Object> result = new HashMap<String, Object>();	
		Map<String, Object> following = new HashMap<String, Object>();	
		following.put("face_url", "www.face.com/1.jpg");
		following.put("uid", "uid123456");
		following.put("signature", "Sherlock");
		following.put("nickname", "SH");
		result.put("following", following);
		result.put("status", "0");
		return result;
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public @ResponseBody Map<String, Object> update(@RequestParam("birthday") String birthday, 
			@RequestParam("location") String location,
			@RequestParam("signature") String signature,
			@RequestParam("school") String school,
			@RequestParam("sex") String sex,
			@RequestParam("nickname") String nickname,
			@RequestParam("phonenumber") String phonenumber,
			@RequestParam("hometown") String hometown,
			@RequestParam("career") String career,
			@RequestParam("face_url") String face_url,
            Model param) {
		
		Map<String, Object> result = new HashMap<String, Object>();	
		result.put("status", "0");
		return result;
	}
}
