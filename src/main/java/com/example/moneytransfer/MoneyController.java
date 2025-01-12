
package com.example.moneytransfer;

import org.springframework.web.bind.annotation.*;

import javax.money.MonetaryAmount;

@RestController
@RequestMapping("/api/money")
public class MoneyController {

    private final MoneyTransferService moneyTransferService;

    public MoneyController(MoneyTransferService moneyTransferService) {
        this.moneyTransferService = moneyTransferService;
    }

    @PostMapping("/transfer")
    public MonetaryAmount transferMoney(@RequestBody MoneyTransferRequest request) {
        MonetaryAmount transferredAmount = moneyTransferService.transferMoney(request.getAmount(), request.getCurrency());
        MonetaryAmount convertedAmount = moneyTransferService.convertCurrency(transferredAmount, request.getTargetCurrency());
        MonetaryAmount finalAmount = moneyTransferService.calculateFinalAmount(convertedAmount, request.getFee());

        return finalAmount;
    }
}
