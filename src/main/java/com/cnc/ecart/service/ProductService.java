package com.cnc.ecart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cnc.ecart.model.Products;
import com.cnc.ecart.repository.ProductsRepository;

@Service
public class ProductService {
    @Autowired
    private ProductsRepository productRepository;
    
    
//    insert & update//
    
    public Products addProduct(Products products) {
    	try {
    	return productRepository.save(products);
    	}
    	catch(Exception ex) {
    		System.err.println("exception occured in add product"+ex.getMessage()+"cause:"+ex.getCause());
    	}
    	return null;
    }
    public boolean removeProduct(int productId) {
    	try {
    	productRepository.deleteById(productId);
    	return true;
    	}
    	catch(Exception ex) {
    		System.err.println("Exception occured in removeProduct:"+ex.getMessage()+"cause:"+ex.getCause());
    	}
    	return false;
    }
    public List<Products> getProducts(){
    	try {
    		return productRepository.findAll();
    	}
    	catch(Exception ex){
    		System.err.println("Exception occured in getProducts:"+ex.getMessage()+"cause:"+ex.getCause());
    	}
    	return null;
    }
    public Products getProduct(int productId) {
    	try {
    		return productRepository.findById(productId).get();
    	}
    	catch(Exception ex) {
    		System.err.println("exception occured in getProduct:"+ex.getMessage()+"cause:"+ex.getCause());
    	}
    	return null;
    }
    public List<Products> getProductsByCat(int catId){
    	return productRepository.findByCatId(catId);
    }
}
