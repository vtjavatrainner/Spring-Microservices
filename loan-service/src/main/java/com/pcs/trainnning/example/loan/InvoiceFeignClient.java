package com.pcs.trainnning.example.loan;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("INVOICE-SERVICE")
public interface InvoiceFeignClient {

    @RequestMapping(method = RequestMethod.GET, value = "/invoice")
    String getInvoicesForLoan();
}
