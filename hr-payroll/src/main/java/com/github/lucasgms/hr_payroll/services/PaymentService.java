package com.github.lucasgms.hr_payroll.services;

import com.github.lucasgms.hr_payroll.entities.Payment;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    public Payment getPayment(long workerId, int days) {

        return new Payment(
            "Lucas", 100.0, days
        );
    }
}
