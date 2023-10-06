package com.kariksiz.product.grocerypricedetector.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.kariksiz.product.grocerypricedetector.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
