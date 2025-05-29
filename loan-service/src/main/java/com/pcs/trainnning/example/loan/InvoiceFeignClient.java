package com.pcs.trainnning.example.loan;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("INVOICE-SERVICE")//http://192.168.1.8:56771/
public interface InvoiceFeignClient {

    //http://192.168.1.8:56771/invoice
    @RequestMapping(method = RequestMethod.GET, value = "/invoice")
    String getInvoicesForLoan();
}
