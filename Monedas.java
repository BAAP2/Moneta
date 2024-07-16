public class CurrencyConverter {
    // Código anterior...

    public static void main(String[] args) {
        // Código anterior...

        double eurRate = rates.get("EUR").getAsDouble();
        double gbpRate = rates.get("GBP").getAsDouble();

        System.out.println("Tasa de cambio USD a EUR: " + eurRate);
        System.out.println("Tasa de cambio USD a GBP: " + gbpRate);
    }
}
