package com.amr.journey.StoreCrudOperations.services;

import com.amr.journey.StoreCrudOperations.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductsRepository extends JpaRepository<Product, Integer> {
}
