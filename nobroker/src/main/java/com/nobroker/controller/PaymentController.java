package com.nobroker.controller;

import com.nobroker.entity.Product;
import com.nobroker.exception.EntityNotFoundException;
import com.nobroker.repository.ProductRepository;
import com.nobroker.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class PaymentController {

    @Value("${stripe.api.key}")
    private String stripeApiKey;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private PaymentService paymentService;

    @PostMapping("/initiate")
    public ResponseEntity<String> initiatePayment(@RequestParam Long productId){

    Product product = productRepository.findById(productId).orElseThrow(()-> new EntityNotFoundException("Product not found"));

    String paymentIntentId = paymentService.createPaymentIntent(product.getPrice());
            return ResponseEntity.ok(paymentIntentId);
}


}

