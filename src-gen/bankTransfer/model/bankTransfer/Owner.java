/**
 */
package bankTransfer.model.bankTransfer;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Owner</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bankTransfer.model.bankTransfer.Owner#getName <em>Name</em>}</li>
 *   <li>{@link bankTransfer.model.bankTransfer.Owner#getAdress <em>Adress</em>}</li>
 *   <li>{@link bankTransfer.model.bankTransfer.Owner#getPhoneNumber <em>Phone Number</em>}</li>
 *   <li>{@link bankTransfer.model.bankTransfer.Owner#getBankAccount <em>Bank Account</em>}</li>
 * </ul>
 *
 * @see bankTransfer.model.bankTransfer.BankTransferPackage#getOwner()
 * @model
 * @generated
 */
public interface Owner extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see bankTransfer.model.bankTransfer.BankTransferPackage#getOwner_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link bankTransfer.model.bankTransfer.Owner#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Adress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adress</em>' attribute.
	 * @see #setAdress(String)
	 * @see bankTransfer.model.bankTransfer.BankTransferPackage#getOwner_Adress()
	 * @model required="true"
	 * @generated
	 */
	String getAdress();

	/**
	 * Sets the value of the '{@link bankTransfer.model.bankTransfer.Owner#getAdress <em>Adress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adress</em>' attribute.
	 * @see #getAdress()
	 * @generated
	 */
	void setAdress(String value);

	/**
	 * Returns the value of the '<em><b>Phone Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phone Number</em>' attribute.
	 * @see #setPhoneNumber(int)
	 * @see bankTransfer.model.bankTransfer.BankTransferPackage#getOwner_PhoneNumber()
	 * @model required="true"
	 * @generated
	 */
	int getPhoneNumber();

	/**
	 * Sets the value of the '{@link bankTransfer.model.bankTransfer.Owner#getPhoneNumber <em>Phone Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phone Number</em>' attribute.
	 * @see #getPhoneNumber()
	 * @generated
	 */
	void setPhoneNumber(int value);

	/**
	 * Returns the value of the '<em><b>Bank Account</b></em>' reference list.
	 * The list contents are of type {@link bankTransfer.model.bankTransfer.BankAccount}.
	 * It is bidirectional and its opposite is '{@link bankTransfer.model.bankTransfer.BankAccount#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bank Account</em>' reference list.
	 * @see bankTransfer.model.bankTransfer.BankTransferPackage#getOwner_BankAccount()
	 * @see bankTransfer.model.bankTransfer.BankAccount#getOwner
	 * @model opposite="owner"
	 * @generated
	 */
	EList<BankAccount> getBankAccount();

} // Owner
