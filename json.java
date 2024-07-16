import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class CurrencyConverter {
    // Código anterior...

    public static void main(String[] args) {
        // Código anterior...

        JsonObject jsonObject = JsonParser.parseString(content.toString()).getAsJsonObject();
        JsonObject rates = jsonObject.getAsJsonObject("conversion_rates");
        
        System.out.println("Tasas de cambio: " + rates);
    }
}
