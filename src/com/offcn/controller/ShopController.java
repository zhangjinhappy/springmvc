package com.offcn.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.offcn.bean.Shop;
import com.offcn.service.ShopService;

@Controller
@RequestMapping("/shop")
public class ShopController {
	@Autowired
	private ShopService shopService;
	
	@RequestMapping("/list")
	public ModelAndView getShopList(){
		System.out.println("111111111");
		ModelAndView mv = new ModelAndView("list");
		List<Shop> list = shopService.getShopList();
		mv.addObject("studentlist", list);
		return mv;
	}
	
	
	
	@RequestMapping(value = "/saveInfo",method =RequestMethod.POST)
	public String saveInfo(Shop shop){
		shopService.saveInfo(shop);
		return "redirect:/shop/list";
	}
     
	@RequestMapping("/del/{id}")
	public String delectItem(@PathVariable("id") Integer id){
		shopService.delectItem(id);
		return "redirect:/shop/list";
	}
	
	@RequestMapping("/update/{id}")
	public String updateItem(@PathVariable("id") Integer id , Map<String,Object> map){
		Shop sp = shopService.updateItem(id);
		map.put("spList", sp);
		return "update";
	}
	
	@RequestMapping(value = "/updateInfo",method =RequestMethod.POST)
	public String updateInfo(Shop shop){
		shopService.updateInfo(shop);
		return "redirect:/shop/list";
	}
}
