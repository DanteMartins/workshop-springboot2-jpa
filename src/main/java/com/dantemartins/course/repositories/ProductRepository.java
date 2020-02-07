package com.dantemartins.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dantemartins.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}