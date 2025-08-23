package com.firemans.web.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.firemans.web.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
