package com.cnc.ecart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cnc.ecart.model.Category;
import com.cnc.ecart.repository.CategoryRepository;

@Service
public class CategoryService {
       @Autowired
       private CategoryRepository categoryRepository;
    	     
//       it will work for insert and update//
             
       public Category addCategory(Category category) {
    	   try {
    		   return categoryRepository.save(category);
    	   }
    	   catch(Exception ex)
    	   {
    		   System.err.println("Exception occured in addCategory:"+ex.getMessage()+"cause:"+ex.getCause());
    	   }
    	   return null;
       }
       public boolean removeCategory(int categoryId) {
    	   try {
    		    categoryRepository.deleteById(categoryId);
    		    return true;
    	   }
    	   catch(Exception ex)
    	   {
    		   System.err.println("exception occured in addCategory:"+ex.getMessage()+"cause:"+ex.getCause());
    	   }
    	   return false;
       }
       public List<Category> getCategories() {
    	   try {
    		    return categoryRepository.findAll();
    		    
    	   }
    	   catch(Exception ex)
    	   {
    		   System.err.println("exception occured in getCategories:"+ex.getMessage()+"cause:"+ex.getCause());
    	   }
    	   return null;
       }
       public Category getCategory(int categoryId) {
    	   try {
    		    return categoryRepository.findById(categoryId).get();
    		    
    	   }
    	   catch(Exception ex)
    	   {
    		   System.err.println("exception occured in getCategory:"+ex.getMessage()+"cause:"+ex.getCause());
    	   }
    	   return null;
       }
}
