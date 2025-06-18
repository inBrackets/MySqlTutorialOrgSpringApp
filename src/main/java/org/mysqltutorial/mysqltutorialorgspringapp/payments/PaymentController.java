package org.mysqltutorial.mysqltutorialorgspringapp.payments;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/payments")
public class PaymentController {

    private final PaymentService paymentService;

    @GetMapping
    public List<PaymentDto> getAllPayments() {
        return paymentService.getAllPayments();
    }

    @GetMapping("/AmountByDate")
    public List<PaymentAmountsByDateDto> getAmountByDate() {
        return paymentService.getSumOfAllPaymentsAmountsGroupedByDate();
    }
}
