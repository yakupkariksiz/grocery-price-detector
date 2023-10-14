package com.kariksiz.product.grocerypricedetector;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GroceryPriceDetectorApplication {

    private static final Logger logger = LoggerFactory.getLogger(GroceryPriceDetectorApplication.class);

	public static void main(String[] args) {
		logger.info("GroceryPriceDetector application has been started!");
		SpringApplication.run(GroceryPriceDetectorApplication.class, args);
		logger.info("Already started");
	}

}
