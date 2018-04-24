package com.kodilla.patterns2.facade;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Random;

@Service
public class ProductService {
    public BigDecimal getPrice(Long productId) {
        Random genarator = new Random();
        return new BigDecimal(genarator.nextInt(100000) / 100);
    }
}
