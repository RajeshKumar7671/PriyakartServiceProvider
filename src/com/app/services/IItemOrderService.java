package com.app.services;

import java.util.List;

import com.app.model.ItemOrder;

public interface IItemOrderService {
	   
	    public int saveItemOrder(ItemOrder itemOrder);
		
		public List<ItemOrder> getAllOrderItem();
		
		public List<ItemOrder> getAllOrderItemByConsId(int consId);
		
	    public void deleteOrderItemByOrderId(int orderId);
		
		public ItemOrder getOderItemByOrderId(int orderId);
		
		public void updateOrderItem(ItemOrder orderItem);
		
		public boolean isOrderItemExist(String itemName);
		
 }
