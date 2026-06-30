import bankTransfer.model.bankTransfer.BankAccount;
import bankTransfer.model.bankTransfer.BankTransferFactory;

public class Main {

	public static void main(String[] args) {
		
		BankTransferFactory factory = BankTransferFactory.eINSTANCE;
		BankAccount kontoA = factory.createBankAccount();
		
		kontoA.setIban("DE1578");
		System.out.print(kontoA.getIban());

	}

}
