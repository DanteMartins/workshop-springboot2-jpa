package com.dantemartins.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dantemartins.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
