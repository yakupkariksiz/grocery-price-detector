package com.kariksiz.product.grocerypricedetector.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.kariksiz.product.grocerypricedetector.entity.ProductPrice;

public interface ProductPriceRepository extends JpaRepository<ProductPrice, Long> {
}
