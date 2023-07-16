package com.cnc.ecart.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cnc.ecart.model.Orders;
import com.cnc.ecart.repository.OrderRepository;

@Service
public class OrderService {
    @Autowired
	private OrderRepository orderRepository;
    
    public Orders addOrder(Orders order) {
    	try {
    		//LocalDateTime date=LocalDateTime.now();
    		//order.setOrderDate(date.toString());
    		orderRepository.save(order);
    	}
    	catch(Exception ex) {
    		System.err.println("exception occured in addOrders"+ex.getMessage()+"cause:"+ex.getCause());
    	}
    	return null;
    }
    public boolean cancelOrder( int orderId) {
    	try {
    		if(orderRepository.cancelOrder(orderId)>0) {
    			return true;
    		}
    		else {
    			return false;
    		}
    	}
    	catch(Exception ex) {
    		System.err.println("exception occured in:"+ex.getMessage()+"cause:"+ex.getCause());
    	}
    	return false;
    }
    public List<Orders> getOrders(){
    	try {
    	return orderRepository.findAll();
    	}
    	catch(Exception ex) {
    		System.err.println("exception occured in getOrders:"+ex.getMessage()+"cause:"+ex.getCause());
    	}
    	return null;
    }
    public Orders getOrders(int orderId){
    	try {
    	if(orderId!=0) {
    	return orderRepository.findById(orderId).get();
    	}
    }
    	catch(Exception ex){
    		System.err.println("exception occured in getOrder :"+ex.getMessage()+"cause:"+ex.getCause());
    	}
    	return null;
    }
}