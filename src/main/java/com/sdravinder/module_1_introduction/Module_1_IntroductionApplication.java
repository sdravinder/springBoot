package com.sdravinder.module_1_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class Module_1_IntroductionApplication implements CommandLineRunner {

//    @Autowired
//    PaymentService paymentService;
//
//    //@Autowired
//    final NotificationService notificationService; //dependency injection

//    @Autowired
//    private SmsNotificationService smsNotificationService;

    @Autowired
    Map<String, NotificationService> notificationServicesMap = new HashMap<>();

//    public Module1IntroductionApplication(NotificationService notificationService) {
//                this.notificationService = notificationService; // constructor injection // Preferred way of doing dependency injection
//    }

    public static void main(String[] args) {
        SpringApplication.run(Module_1_IntroductionApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
       /* notificationService = new EmailNotificationService();
       notificationService.send("Payment successful");
       notificationService = new SmsNotificationService();
       notificationService.send("Payment successful"); */

//       notificationService.send( "Hello, this is a notification from the payment service!" );

        for(var notificationService : notificationServicesMap.entrySet()) {
            System.out.println(notificationService.getKey());
            notificationService.getValue().send("Hello, this is a notification from the payment service!");
        }
    }
}
