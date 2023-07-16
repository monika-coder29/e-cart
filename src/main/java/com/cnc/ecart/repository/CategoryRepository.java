package com.cnc.ecart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cnc.ecart.model.Category;
@Repository
public interface CategoryRepository extends JpaRepository<Category,Integer>{

}
