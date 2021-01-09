package com.offcn.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.offcn.bean.Shop;

@Repository
public interface ShopMapper {

	public List<Shop> getShopList();

	public void saveInfo(Shop shop);

	public void delectItem(Integer id);

	public Shop updateItem(Integer id);

	public void updateInfo(Shop shop);


}
