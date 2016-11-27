package com.coreKL.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.coreKL.controller.vo.UserVO;
import com.coreKL.entities.User;
import com.coreKL.repository.UserReposiroty;

@RestController
@RequestMapping("/users")
public class UserController {

	
	@Autowired
	private UserReposiroty userReposiroty;
	
	
	public UserController(UserReposiroty userReposiroty) {
		this.userReposiroty= userReposiroty;
	}
	
	@RequestMapping(method=RequestMethod.GET )
	public List<User> findAllUsers(){
		return userReposiroty.findAll();
	}
	
	 @RequestMapping(method = RequestMethod.POST )
	    public void addUser(@RequestBody UserVO userVo){
	        User user = new User();
	        user.setName(userVo.getName());
	        user.setPasswd(userVo.getPasswd());
	        userReposiroty.save(user);
	    }
}
