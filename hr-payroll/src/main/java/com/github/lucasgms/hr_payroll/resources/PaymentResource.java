package com.github.lucasgms.hr_payroll.resources;

import com.github.lucasgms.hr_payroll.entities.Payment;
import com.github.lucasgms.hr_payroll.services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/payments")
public class PaymentResource {
    @Autowired
    private PaymentService service;

    @GetMapping(value = "/{workerId}/days/{days}")
    public ResponseEntity<Payment> getPayment(
            @PathVariable Long workerId,
            @PathVariable int days
    ) {
        Payment payment = service.getPayment(workerId, days);

        return ResponseEntity.ok(payment);
    }

}
