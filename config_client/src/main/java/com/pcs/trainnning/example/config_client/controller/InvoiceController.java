package com.pcs.trainnning.example.config_client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InvoiceController {
    @Value("${invoice-service.message}")
    private String message;

    @GetMapping("/message")
    public String getMessage(){
        return this.message;
    }

}
