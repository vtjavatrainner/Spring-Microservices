package com.pcs.trainnning.example.loan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanController {

    @Autowired
    InvoiceFeignClient invoiceFeignClient;

    @GetMapping("/loan/invoice")
    public String getInvoiceForLoan(){
        return invoiceFeignClient.getInvoicesForLoan();
    }
}
