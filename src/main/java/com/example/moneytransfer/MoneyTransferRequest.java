
package com.example.moneytransfer;

import javax.money.MonetaryAmount;

public class MoneyTransferRequest {

    private double amount;
    private String currency;
    private String targetCurrency;
    private MonetaryAmount fee;

    // Getters and Setters
    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getTargetCurrency() {
        return targetCurrency;
    }

    public void setTargetCurrency(String targetCurrency) {
        this.targetCurrency = targetCurrency;
    }

    public MonetaryAmount getFee() {
        return fee;
    }

    public void setFee(MonetaryAmount fee) {
        this.fee = fee;
    }
}
