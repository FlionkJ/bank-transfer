/**
 */
package bankTransfer.model.bankTransfer;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inhaber</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bankTransfer.model.bankTransfer.Inhaber#getName <em>Name</em>}</li>
 *   <li>{@link bankTransfer.model.bankTransfer.Inhaber#getAnschrift <em>Anschrift</em>}</li>
 *   <li>{@link bankTransfer.model.bankTransfer.Inhaber#getTelefonnummer <em>Telefonnummer</em>}</li>
 *   <li>{@link bankTransfer.model.bankTransfer.Inhaber#getKonto <em>Konto</em>}</li>
 * </ul>
 *
 * @see bankTransfer.model.bankTransfer.BankTransferPackage#getInhaber()
 * @model
 * @generated
 */
public interface Inhaber extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see bankTransfer.model.bankTransfer.BankTransferPackage#getInhaber_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link bankTransfer.model.bankTransfer.Inhaber#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Anschrift</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anschrift</em>' attribute.
	 * @see #setAnschrift(String)
	 * @see bankTransfer.model.bankTransfer.BankTransferPackage#getInhaber_Anschrift()
	 * @model
	 * @generated
	 */
	String getAnschrift();

	/**
	 * Sets the value of the '{@link bankTransfer.model.bankTransfer.Inhaber#getAnschrift <em>Anschrift</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anschrift</em>' attribute.
	 * @see #getAnschrift()
	 * @generated
	 */
	void setAnschrift(String value);

	/**
	 * Returns the value of the '<em><b>Telefonnummer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Telefonnummer</em>' attribute.
	 * @see #setTelefonnummer(int)
	 * @see bankTransfer.model.bankTransfer.BankTransferPackage#getInhaber_Telefonnummer()
	 * @model
	 * @generated
	 */
	int getTelefonnummer();

	/**
	 * Sets the value of the '{@link bankTransfer.model.bankTransfer.Inhaber#getTelefonnummer <em>Telefonnummer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Telefonnummer</em>' attribute.
	 * @see #getTelefonnummer()
	 * @generated
	 */
	void setTelefonnummer(int value);

	/**
	 * Returns the value of the '<em><b>Konto</b></em>' reference list.
	 * The list contents are of type {@link bankTransfer.model.bankTransfer.Konto}.
	 * It is bidirectional and its opposite is '{@link bankTransfer.model.bankTransfer.Konto#getInhaber <em>Inhaber</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Konto</em>' reference list.
	 * @see bankTransfer.model.bankTransfer.BankTransferPackage#getInhaber_Konto()
	 * @see bankTransfer.model.bankTransfer.Konto#getInhaber
	 * @model opposite="inhaber"
	 * @generated
	 */
	EList<Konto> getKonto();

} // Inhaber
