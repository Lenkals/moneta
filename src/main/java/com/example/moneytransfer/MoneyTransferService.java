
package com.example.moneytransfer;

import javax.money.Monetary;
import javax.money.MonetaryAmount;
import org.javamoney.moneta.Money;
import javax.money.convert.MonetaryConversions;

public class MoneyTransferService {

    public MonetaryAmount transferMoney(double amount, String currency) {
        var currencyUnit = Monetary.getCurrency(currency);
        return Money.of(amount, currencyUnit);
    }

    public MonetaryAmount convertCurrency(MonetaryAmount amount, String targetCurrency) {
        var conversion = MonetaryConversions.getConversion(targetCurrency);
        return amount.with(conversion);
    }

    public MonetaryAmount calculateFinalAmount(MonetaryAmount amount, MonetaryAmount fee) {
        return amount.subtract(fee);
    }
}
