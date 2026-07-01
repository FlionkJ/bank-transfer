/**
 */
package bankTransfer.model.bankTransfer;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bank Account</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bankTransfer.model.bankTransfer.BankAccount#getIban <em>Iban</em>}</li>
 *   <li>{@link bankTransfer.model.bankTransfer.BankAccount#getBic <em>Bic</em>}</li>
 *   <li>{@link bankTransfer.model.bankTransfer.BankAccount#getAccountBalance <em>Account Balance</em>}</li>
 *   <li>{@link bankTransfer.model.bankTransfer.BankAccount#getOwner <em>Owner</em>}</li>
 *   <li>{@link bankTransfer.model.bankTransfer.BankAccount#getCurrency <em>Currency</em>}</li>
 * </ul>
 *
 * @see bankTransfer.model.bankTransfer.BankTransferPackage#getBankAccount()
 * @model
 * @generated
 */
public interface BankAccount extends EObject {
	/**
	 * Returns the value of the '<em><b>Iban</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iban</em>' attribute.
	 * @see #setIban(String)
	 * @see bankTransfer.model.bankTransfer.BankTransferPackage#getBankAccount_Iban()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getIban();

	/**
	 * Sets the value of the '{@link bankTransfer.model.bankTransfer.BankAccount#getIban <em>Iban</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iban</em>' attribute.
	 * @see #getIban()
	 * @generated
	 */
	void setIban(String value);

	/**
	 * Returns the value of the '<em><b>Bic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bic</em>' attribute.
	 * @see #setBic(String)
	 * @see bankTransfer.model.bankTransfer.BankTransferPackage#getBankAccount_Bic()
	 * @model required="true"
	 * @generated
	 */
	String getBic();

	/**
	 * Sets the value of the '{@link bankTransfer.model.bankTransfer.BankAccount#getBic <em>Bic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bic</em>' attribute.
	 * @see #getBic()
	 * @generated
	 */
	void setBic(String value);

	/**
	 * Returns the value of the '<em><b>Account Balance</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Account Balance</em>' attribute.
	 * @see #setAccountBalance(int)
	 * @see bankTransfer.model.bankTransfer.BankTransferPackage#getBankAccount_AccountBalance()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getAccountBalance();

	/**
	 * Sets the value of the '{@link bankTransfer.model.bankTransfer.BankAccount#getAccountBalance <em>Account Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Account Balance</em>' attribute.
	 * @see #getAccountBalance()
	 * @generated
	 */
	void setAccountBalance(int value);

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' reference list.
	 * The list contents are of type {@link bankTransfer.model.bankTransfer.Owner}.
	 * It is bidirectional and its opposite is '{@link bankTransfer.model.bankTransfer.Owner#getBankAccount <em>Bank Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' reference list.
	 * @see bankTransfer.model.bankTransfer.BankTransferPackage#getBankAccount_Owner()
	 * @see bankTransfer.model.bankTransfer.Owner#getBankAccount
	 * @model opposite="bankAccount" upper="3"
	 * @generated
	 */
	EList<Owner> getOwner();

	/**
	 * Returns the value of the '<em><b>Currency</b></em>' attribute.
	 * The literals are from the enumeration {@link bankTransfer.model.bankTransfer.Currency}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currency</em>' attribute.
	 * @see bankTransfer.model.bankTransfer.Currency
	 * @see #setCurrency(Currency)
	 * @see bankTransfer.model.bankTransfer.BankTransferPackage#getBankAccount_Currency()
	 * @model required="true"
	 * @generated
	 */
	Currency getCurrency();

	/**
	 * Sets the value of the '{@link bankTransfer.model.bankTransfer.BankAccount#getCurrency <em>Currency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency</em>' attribute.
	 * @see bankTransfer.model.bankTransfer.Currency
	 * @see #getCurrency()
	 * @generated
	 */
	void setCurrency(Currency value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void sendMoney(String recipientIban, int sum, Currency currency);

} // BankAccount
