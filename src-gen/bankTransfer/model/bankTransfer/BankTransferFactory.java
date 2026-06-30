/**
 */
package bankTransfer.model.bankTransfer;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see bankTransfer.model.bankTransfer.BankTransferPackage
 * @generated
 */
public interface BankTransferFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BankTransferFactory eINSTANCE = bankTransfer.model.bankTransfer.impl.BankTransferFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Bank Account</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bank Account</em>'.
	 * @generated
	 */
	BankAccount createBankAccount();

	/**
	 * Returns a new object of class '<em>Owner</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Owner</em>'.
	 * @generated
	 */
	Owner createOwner();

	/**
	 * Returns a new object of class '<em>Exchange Rate API</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exchange Rate API</em>'.
	 * @generated
	 */
	ExchangeRateAPI createExchangeRateAPI();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BankTransferPackage getBankTransferPackage();

} //BankTransferFactory
