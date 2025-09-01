package com.firemans.web.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.firemans.web.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
