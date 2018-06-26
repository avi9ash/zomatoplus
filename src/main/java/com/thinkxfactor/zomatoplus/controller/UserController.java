package com.thinkxfactor.zomatoplus.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.thinkxfactor.zomatoplus.models.User;
import com.thinkxfactor.zomatoplus.repo.RestaurantRepository;
import com.thinkxfactor.zomatoplus.repo.UserRepository;




@RestController
@RequestMapping("/user")
public class UserController 
{
	@Autowired
	private UserRepository urepo;
	@GetMapping("/all")
	public List<User> userList()
	{
		
		return urepo.findAll();

	}

	@PostMapping("/create")
	public User userRegistration(@RequestBody User user)
	{
		urepo.saveAndFlush(user);
		System.out.println(user.toString());
		return user;
	}
	@PostMapping("/login")
	public User userLogin(@RequestBody User user)
	{
		System.out.println(user.toString());
		return user;
	}

}
