package com.firemans.web.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.firemans.web.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
