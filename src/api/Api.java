package api;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import bankTransfer.model.bankTransfer.Currency;

public class Api {
	private static Map<Currency, JsonObject> exchangeData = new HashMap<>();

	public enum Environment {
		DEV, // Uses local test data (saves on API limits)
		PROD // Executes real live API calls
	}

	/**
	 * <b>IMPORTANT:</b> This method must be called exactly once immediately when
	 * the application starts!
	 * <p>
	 * It sets up the required environment and loads the initial exchange rate data.
	 * Failing to call this method will result in NullPointerExceptions during
	 * currency conversion.
	 * </p>
	 *
	 * @param environment The target execution environment (e.g., DEV, PROD) used to
	 *                    determine whether to load local or live data.
	 */
	public static void init(Environment environment) {
		String APIKEY = "2cc90ba0ca2e728914feb77a";
		if (environment == Environment.PROD) {
			for (Currency current : Currency.VALUES) {
				getExchangeRateApi(APIKEY, current);
			}
		}
		System.out.println(String.format("Tool runs in: %s", environment));

		setupData();
	}

	public static double getExchangeRate(Currency currentCurrency, Currency targetCurrency) {
		// Extract the entire JSON object for `currentCurrency` from the map
		JsonObject currencyJsonObject = exchangeData.get(currentCurrency);

		if (currencyJsonObject != null) { // Extract the conversion_rates
			JsonObject conversion_rates = currencyJsonObject.getAsJsonObject("conversion_rates");
			double course = conversion_rates.get(targetCurrency.getLiteral()).getAsDouble();
			System.out.println(String.format("The exchange rate is: %.4f", course));
			return course;
		} else {
			System.out.println(String.format("No data found for %s in storage.", currentCurrency));
		}
		return 0.0;
	}

	private static void getExchangeRateApi(String key, Currency currency) {
		try {
			// Setting URL
			String url_str = String.format("https://v6.exchangerate-api.com/v6/%s/latest/%s", key, currency);

			// Making Request
			URL url = URI.create(url_str).toURL();
			HttpURLConnection request = (HttpURLConnection) url.openConnection();
			request.connect();

			// Convert to JSON
			JsonElement root = JsonParser.parseReader(new InputStreamReader((InputStream) request.getContent()));
			JsonObject jsonobj = root.getAsJsonObject();

			// Accessing object
			String req_result = jsonobj.get("result").getAsString();

			// Test-Printout
			System.out.println("Result: " + req_result);
			System.out.println("Komplettes JSON: " + jsonobj.toString());

			// Save to file
			utils.Io.saveJsonFile(jsonobj, getFilePath(currency));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static String getFilePath(Currency fileName) {
		// Set file path
		return String.format("test-data/%s.json", fileName);
	}

	private static void setupData() {
		for (Currency current : Currency.VALUES) {
			exchangeData.put(current, utils.Io.loadJsonFile(getFilePath(current)));
			System.out.println(String.format("Data successfully loaded: %s", current));
		}
	}
}