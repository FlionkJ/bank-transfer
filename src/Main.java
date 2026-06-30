import bankTransfer.model.bankTransfer.BankTransferFactory;
import bankTransfer.model.bankTransfer.Konto;

public class Main {

	public static void main(String[] args) {
		
		BankTransferFactory factory = BankTransferFactory.eINSTANCE;
		Konto kontoA = factory.createKonto();
		
		kontoA.setIban("DE1578");
		System.out.print(kontoA.getIban());

	}

}
