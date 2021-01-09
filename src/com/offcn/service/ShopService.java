package com.offcn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.offcn.bean.Shop;
import com.offcn.mapper.ShopMapper;

@Service
public class ShopService {
	
	@Autowired
	private ShopMapper shopMapper;
    
	public List<Shop> getShopList() {

		return shopMapper.getShopList();
	}

	public void saveInfo(Shop shop) {
		shopMapper.saveInfo(shop);
	}

	public void delectItem(Integer id) {
		// TODO Auto-generated method stub
		shopMapper.delectItem(id);
	}

	public Shop updateItem(Integer id) {
		// TODO Auto-generated method stub
		return shopMapper.updateItem(id);
	}

	public void updateInfo(Shop shop) {
		// TODO Auto-generated method stub
		shopMapper.updateInfo(shop);
	}
	

}
