package com.pcs.trainnning.example.loan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanController {

    @Autowired
    InvoiceFeignClient invoiceFeignClient;

    @GetMapping("/loan")
    public String getAllLoans(){
        System.out.println("Received request for all loans");
        return "all loans";
    }

    //@GetMapping("/loan/{loanId}/invoice")
    /*
        loanid:
        loanBuyer:
        invoices:{
            {
            invid:1,
            ...
            },
            {
            invId2;
            }
        }
     */
    @GetMapping("/loan/invoice")
    public String getInvoiceForLoan(){
        System.out.println("Received request for loan and its invoices");
        return invoiceFeignClient.getInvoicesForLoan();
    }


}
