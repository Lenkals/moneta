import javax.money.Monetary;
import javax.money.CurrencyUnit;
import javax.money.MonetaryAmount;
import org.javamoney.moneta.Money;

public class CurrencyOperations {

    public static void main(String[] args) {
        // Define currency units
        CurrencyUnit usd = Monetary.getCurrency("USD");
        CurrencyUnit eur = Monetary.getCurrency("EUR");

        // Create monetary amounts
        MonetaryAmount amountInUSD1 = Money.of(100.00, usd);
        MonetaryAmount amountInUSD2 = Money.of(50.00, usd);
        MonetaryAmount amountInEUR = Money.of(75.00, eur);

        // Add two USD amounts
        MonetaryAmount totalUSD = amountInUSD1.add(amountInUSD2);
        System.out.println("Total in USD: " + totalUSD);

        // Multiply a USD amount
        MonetaryAmount multipliedUSD = amountInUSD1.multiply(2);
        System.out.println("Multiplied Amount in USD: " + multipliedUSD);

        // Attempting to add different currencies (will throw an exception)
        try {
            MonetaryAmount result = amountInUSD1.add(amountInEUR);
            System.out.println("This won't print: " + result);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
