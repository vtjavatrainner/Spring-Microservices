package com.pcs.trainnning.example.invoice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InvoiceController {

    @GetMapping("/invoice")
    public String getAllInvoices(){
        System.out.println("Received request for invoices");
        return "all invoices";
    }
}
