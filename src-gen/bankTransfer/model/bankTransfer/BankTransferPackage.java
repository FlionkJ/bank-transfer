/**
 */
package bankTransfer.model.bankTransfer;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see bankTransfer.model.bankTransfer.BankTransferFactory
 * @model kind="package"
 * @generated
 */
public interface BankTransferPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "bankTransfer";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/bankTransfer";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "bankTransfer";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BankTransferPackage eINSTANCE = bankTransfer.model.bankTransfer.impl.BankTransferPackageImpl.init();

	/**
	 * The meta object id for the '{@link bankTransfer.model.bankTransfer.impl.KontoImpl <em>Konto</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bankTransfer.model.bankTransfer.impl.KontoImpl
	 * @see bankTransfer.model.bankTransfer.impl.BankTransferPackageImpl#getKonto()
	 * @generated
	 */
	int KONTO = 0;

	/**
	 * The feature id for the '<em><b>Iban</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KONTO__IBAN = 0;

	/**
	 * The feature id for the '<em><b>Bic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KONTO__BIC = 1;

	/**
	 * The feature id for the '<em><b>Kontostand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KONTO__KONTOSTAND = 2;

	/**
	 * The feature id for the '<em><b>Inhaber</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KONTO__INHABER = 3;

	/**
	 * The feature id for the '<em><b>Waehrung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KONTO__WAEHRUNG = 4;

	/**
	 * The number of structural features of the '<em>Konto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KONTO_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Konto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KONTO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bankTransfer.model.bankTransfer.impl.InhaberImpl <em>Inhaber</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bankTransfer.model.bankTransfer.impl.InhaberImpl
	 * @see bankTransfer.model.bankTransfer.impl.BankTransferPackageImpl#getInhaber()
	 * @generated
	 */
	int INHABER = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHABER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Anschrift</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHABER__ANSCHRIFT = 1;

	/**
	 * The feature id for the '<em><b>Telefonnummer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHABER__TELEFONNUMMER = 2;

	/**
	 * The feature id for the '<em><b>Konto</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHABER__KONTO = 3;

	/**
	 * The number of structural features of the '<em>Inhaber</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHABER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Inhaber</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHABER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bankTransfer.model.bankTransfer.Waehrung <em>Waehrung</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bankTransfer.model.bankTransfer.Waehrung
	 * @see bankTransfer.model.bankTransfer.impl.BankTransferPackageImpl#getWaehrung()
	 * @generated
	 */
	int WAEHRUNG = 2;

	/**
	 * Returns the meta object for class '{@link bankTransfer.model.bankTransfer.Konto <em>Konto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Konto</em>'.
	 * @see bankTransfer.model.bankTransfer.Konto
	 * @generated
	 */
	EClass getKonto();

	/**
	 * Returns the meta object for the attribute '{@link bankTransfer.model.bankTransfer.Konto#getIban <em>Iban</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Iban</em>'.
	 * @see bankTransfer.model.bankTransfer.Konto#getIban()
	 * @see #getKonto()
	 * @generated
	 */
	EAttribute getKonto_Iban();

	/**
	 * Returns the meta object for the attribute '{@link bankTransfer.model.bankTransfer.Konto#getBic <em>Bic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bic</em>'.
	 * @see bankTransfer.model.bankTransfer.Konto#getBic()
	 * @see #getKonto()
	 * @generated
	 */
	EAttribute getKonto_Bic();

	/**
	 * Returns the meta object for the attribute '{@link bankTransfer.model.bankTransfer.Konto#getKontostand <em>Kontostand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kontostand</em>'.
	 * @see bankTransfer.model.bankTransfer.Konto#getKontostand()
	 * @see #getKonto()
	 * @generated
	 */
	EAttribute getKonto_Kontostand();

	/**
	 * Returns the meta object for the reference list '{@link bankTransfer.model.bankTransfer.Konto#getInhaber <em>Inhaber</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inhaber</em>'.
	 * @see bankTransfer.model.bankTransfer.Konto#getInhaber()
	 * @see #getKonto()
	 * @generated
	 */
	EReference getKonto_Inhaber();

	/**
	 * Returns the meta object for the attribute '{@link bankTransfer.model.bankTransfer.Konto#getWaehrung <em>Waehrung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Waehrung</em>'.
	 * @see bankTransfer.model.bankTransfer.Konto#getWaehrung()
	 * @see #getKonto()
	 * @generated
	 */
	EAttribute getKonto_Waehrung();

	/**
	 * Returns the meta object for class '{@link bankTransfer.model.bankTransfer.Inhaber <em>Inhaber</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inhaber</em>'.
	 * @see bankTransfer.model.bankTransfer.Inhaber
	 * @generated
	 */
	EClass getInhaber();

	/**
	 * Returns the meta object for the attribute '{@link bankTransfer.model.bankTransfer.Inhaber#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see bankTransfer.model.bankTransfer.Inhaber#getName()
	 * @see #getInhaber()
	 * @generated
	 */
	EAttribute getInhaber_Name();

	/**
	 * Returns the meta object for the attribute '{@link bankTransfer.model.bankTransfer.Inhaber#getAnschrift <em>Anschrift</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anschrift</em>'.
	 * @see bankTransfer.model.bankTransfer.Inhaber#getAnschrift()
	 * @see #getInhaber()
	 * @generated
	 */
	EAttribute getInhaber_Anschrift();

	/**
	 * Returns the meta object for the attribute '{@link bankTransfer.model.bankTransfer.Inhaber#getTelefonnummer <em>Telefonnummer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Telefonnummer</em>'.
	 * @see bankTransfer.model.bankTransfer.Inhaber#getTelefonnummer()
	 * @see #getInhaber()
	 * @generated
	 */
	EAttribute getInhaber_Telefonnummer();

	/**
	 * Returns the meta object for the reference list '{@link bankTransfer.model.bankTransfer.Inhaber#getKonto <em>Konto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Konto</em>'.
	 * @see bankTransfer.model.bankTransfer.Inhaber#getKonto()
	 * @see #getInhaber()
	 * @generated
	 */
	EReference getInhaber_Konto();

	/**
	 * Returns the meta object for enum '{@link bankTransfer.model.bankTransfer.Waehrung <em>Waehrung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Waehrung</em>'.
	 * @see bankTransfer.model.bankTransfer.Waehrung
	 * @generated
	 */
	EEnum getWaehrung();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BankTransferFactory getBankTransferFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link bankTransfer.model.bankTransfer.impl.KontoImpl <em>Konto</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bankTransfer.model.bankTransfer.impl.KontoImpl
		 * @see bankTransfer.model.bankTransfer.impl.BankTransferPackageImpl#getKonto()
		 * @generated
		 */
		EClass KONTO = eINSTANCE.getKonto();

		/**
		 * The meta object literal for the '<em><b>Iban</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KONTO__IBAN = eINSTANCE.getKonto_Iban();

		/**
		 * The meta object literal for the '<em><b>Bic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KONTO__BIC = eINSTANCE.getKonto_Bic();

		/**
		 * The meta object literal for the '<em><b>Kontostand</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KONTO__KONTOSTAND = eINSTANCE.getKonto_Kontostand();

		/**
		 * The meta object literal for the '<em><b>Inhaber</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KONTO__INHABER = eINSTANCE.getKonto_Inhaber();

		/**
		 * The meta object literal for the '<em><b>Waehrung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KONTO__WAEHRUNG = eINSTANCE.getKonto_Waehrung();

		/**
		 * The meta object literal for the '{@link bankTransfer.model.bankTransfer.impl.InhaberImpl <em>Inhaber</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bankTransfer.model.bankTransfer.impl.InhaberImpl
		 * @see bankTransfer.model.bankTransfer.impl.BankTransferPackageImpl#getInhaber()
		 * @generated
		 */
		EClass INHABER = eINSTANCE.getInhaber();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INHABER__NAME = eINSTANCE.getInhaber_Name();

		/**
		 * The meta object literal for the '<em><b>Anschrift</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INHABER__ANSCHRIFT = eINSTANCE.getInhaber_Anschrift();

		/**
		 * The meta object literal for the '<em><b>Telefonnummer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INHABER__TELEFONNUMMER = eINSTANCE.getInhaber_Telefonnummer();

		/**
		 * The meta object literal for the '<em><b>Konto</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INHABER__KONTO = eINSTANCE.getInhaber_Konto();

		/**
		 * The meta object literal for the '{@link bankTransfer.model.bankTransfer.Waehrung <em>Waehrung</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bankTransfer.model.bankTransfer.Waehrung
		 * @see bankTransfer.model.bankTransfer.impl.BankTransferPackageImpl#getWaehrung()
		 * @generated
		 */
		EEnum WAEHRUNG = eINSTANCE.getWaehrung();

	}

} //BankTransferPackage
