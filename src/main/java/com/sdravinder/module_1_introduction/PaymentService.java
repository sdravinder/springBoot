package com.sdravinder.module_1_introduction;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

@Component
//@Service
//@Controller
// @RestController
public class PaymentService {

    public void pay() {
        System.out.println("Paying..");
    }

    @PostConstruct
    public void afterInit() {
        System.out.println("After init method called..");
    }

    @PreDestroy
     public void beforeDestroy() {
        System.out.println("Before destroy method called..");
    }
}

