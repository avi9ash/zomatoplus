package com.thinkxfactor.zomatoplus.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.thinkxfactor.zomatoplus.models.Items;
import com.thinkxfactor.zomatoplus.models.Restaurant;
import com.thinkxfactor.zomatoplus.repo.ItemRepository;
import com.thinkxfactor.zomatoplus.repo.RestaurantRepository;
@RestController
@RequestMapping("/restaurant")
public class RestaurantController 
{
	@Autowired
	private RestaurantRepository rrepo;
	@Autowired
	private ItemRepository irepo;
	
	@PostMapping("/create")
	public Restaurant restaurantCreate(@RequestBody Restaurant rst)
	{
		rrepo.saveAndFlush(rst);
		System.out.println(rst.toString());
	 	return rst;
	}
	@GetMapping("/listall")
	public List<Restaurant> restaurantList()
	{
		
		return rrepo.findAll();
	}
	@PostMapping("/addItems")
	public Items addItems(@RequestBody Items itm)
	{	
		irepo.saveAndFlush(itm);
		return itm;
	}
}
