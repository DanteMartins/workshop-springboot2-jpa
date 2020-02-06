package com.dantemartins.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dantemartins.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
