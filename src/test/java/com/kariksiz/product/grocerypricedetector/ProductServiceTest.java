package com.kariksiz.product.grocerypricedetector;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.kariksiz.product.grocerypricedetector.entity.Product;
import com.kariksiz.product.grocerypricedetector.repository.ProductRepository;

@SpringBootTest
public class ProductServiceTest {

    @Autowired
    private ProductService productService;

    @MockBean
    private ProductRepository productRepository;

    @Test
    public void testGetAllProducts() {
        // Arrange

        Product bread = new Product();
        bread.setId(1L);
        bread.setName("bio bread");
        bread.setOwner("LIDL");
        bread.setCreatedAt(Date.from(LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant()));

        List<Product> mockProducts = List.of(bread);
        when(productRepository.findAll()).thenReturn(mockProducts);

        // Act
        List<Product> result = productService.getAllProducts();

        // Assert
        assertEquals(mockProducts, result);
    }
}

