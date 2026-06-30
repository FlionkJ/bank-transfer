/**
 */
package bankTransfer.model.bankTransfer;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Konto</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bankTransfer.model.bankTransfer.Konto#getIban <em>Iban</em>}</li>
 *   <li>{@link bankTransfer.model.bankTransfer.Konto#getBic <em>Bic</em>}</li>
 *   <li>{@link bankTransfer.model.bankTransfer.Konto#getKontostand <em>Kontostand</em>}</li>
 *   <li>{@link bankTransfer.model.bankTransfer.Konto#getInhaber <em>Inhaber</em>}</li>
 *   <li>{@link bankTransfer.model.bankTransfer.Konto#getWaehrung <em>Waehrung</em>}</li>
 * </ul>
 *
 * @see bankTransfer.model.bankTransfer.BankTransferPackage#getKonto()
 * @model
 * @generated
 */
public interface Konto extends EObject {
	/**
	 * Returns the value of the '<em><b>Iban</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iban</em>' attribute.
	 * @see #setIban(String)
	 * @see bankTransfer.model.bankTransfer.BankTransferPackage#getKonto_Iban()
	 * @model
	 * @generated
	 */
	String getIban();

	/**
	 * Sets the value of the '{@link bankTransfer.model.bankTransfer.Konto#getIban <em>Iban</em>}' attribute.
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
	 * @see bankTransfer.model.bankTransfer.BankTransferPackage#getKonto_Bic()
	 * @model
	 * @generated
	 */
	String getBic();

	/**
	 * Sets the value of the '{@link bankTransfer.model.bankTransfer.Konto#getBic <em>Bic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bic</em>' attribute.
	 * @see #getBic()
	 * @generated
	 */
	void setBic(String value);

	/**
	 * Returns the value of the '<em><b>Kontostand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kontostand</em>' attribute.
	 * @see #setKontostand(int)
	 * @see bankTransfer.model.bankTransfer.BankTransferPackage#getKonto_Kontostand()
	 * @model
	 * @generated
	 */
	int getKontostand();

	/**
	 * Sets the value of the '{@link bankTransfer.model.bankTransfer.Konto#getKontostand <em>Kontostand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kontostand</em>' attribute.
	 * @see #getKontostand()
	 * @generated
	 */
	void setKontostand(int value);

	/**
	 * Returns the value of the '<em><b>Inhaber</b></em>' reference list.
	 * The list contents are of type {@link bankTransfer.model.bankTransfer.Inhaber}.
	 * It is bidirectional and its opposite is '{@link bankTransfer.model.bankTransfer.Inhaber#getKonto <em>Konto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inhaber</em>' reference list.
	 * @see bankTransfer.model.bankTransfer.BankTransferPackage#getKonto_Inhaber()
	 * @see bankTransfer.model.bankTransfer.Inhaber#getKonto
	 * @model opposite="konto" upper="3"
	 * @generated
	 */
	EList<Inhaber> getInhaber();

	/**
	 * Returns the value of the '<em><b>Waehrung</b></em>' attribute.
	 * The literals are from the enumeration {@link bankTransfer.model.bankTransfer.Waehrung}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Waehrung</em>' attribute.
	 * @see bankTransfer.model.bankTransfer.Waehrung
	 * @see #setWaehrung(Waehrung)
	 * @see bankTransfer.model.bankTransfer.BankTransferPackage#getKonto_Waehrung()
	 * @model
	 * @generated
	 */
	Waehrung getWaehrung();

	/**
	 * Sets the value of the '{@link bankTransfer.model.bankTransfer.Konto#getWaehrung <em>Waehrung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Waehrung</em>' attribute.
	 * @see bankTransfer.model.bankTransfer.Waehrung
	 * @see #getWaehrung()
	 * @generated
	 */
	void setWaehrung(Waehrung value);

} // Konto
