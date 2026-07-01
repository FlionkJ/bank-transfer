import api.Api;
import bankTransfer.model.bankTransfer.BankAccount;
import bankTransfer.model.bankTransfer.BankTransferFactory;
import bankTransfer.model.bankTransfer.Currency;

public class Main {

	public static void main(String[] args) {

		BankTransferFactory factory = BankTransferFactory.eINSTANCE;
		BankAccount kontoA = factory.createBankAccount();

		kontoA.setIban("DE1578");
		System.out.println(kontoA.getIban());

		// Example Test Call
		System.out.println("=== STARTING API EXCHANGE RATE TEST ===");

		// 1. Initialize the API (Crucial for the environment guard check!)
		Api.init(Api.Environment.DEV); // 'dev' for local test data (saves API quota) | 'prod' for live queries

		// 2. Define the base and target currencies using `Currency`
		Currency sourceCurrency = Currency.EUR;
		Currency targetCurrency = Currency.USD;

		System.out.println(String.format("Fetching exchange rate from %s to %s...", sourceCurrency, targetCurrency));

		// 3. Call the method to retrieve the current exchange rate
		double exchangeRate = Api.getExchangeRate(sourceCurrency, targetCurrency);

		// 4. Output the results cleanly to the console
		System.out.println("----------------------------------------");
		System.out.println(String.format("Result: 1 %s equals %f %s", sourceCurrency, exchangeRate, targetCurrency));
		System.out.println("----------------------------------------");

		System.out.println("=== TEST COMPLETED SUCCESSFULLY ===");
	}

}
