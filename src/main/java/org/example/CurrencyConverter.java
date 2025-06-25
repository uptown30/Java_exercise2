package org.example;

public class CurrencyConverter {

    private static final double[] exchangeRates = {
            //sek  usd  euro
            104, 89, 10
    };

    public static double convert(double amount, String sourceCurrency, String targetCurrency) {
        int sourceIndex = getCurrencyIndex(sourceCurrency);
        int targetIndex = getCurrencyIndex(targetCurrency);
        return amount = exchangeRates[sourceIndex];

    }

    public static int getCurrencyIndex(String currency) {
        switch (currency) {
            case "usd":
                return 0;

            case "Euro":
                return 1;

            case "sek":
                return 2;

            default:
                throw new IllegalArgumentException("unknown currency" + currency);
        }
    }

    public static void main(String[] arg) {


        double amount = 100000.0;
        String sourceCurrency = "USD";
        String targetCurrency = "Euro";
        double convertedAmount = convert( amount, sourceCurrency, targetCurrency);
        System.out.println(amount + sourceCurrency + convertedAmount + targetCurrency);

    }

}