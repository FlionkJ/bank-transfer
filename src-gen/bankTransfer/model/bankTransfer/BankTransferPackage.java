/**
 */
package bankTransfer.model.bankTransfer;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
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
	 * The meta object id for the '{@link bankTransfer.model.bankTransfer.impl.BankAccountImpl <em>Bank Account</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bankTransfer.model.bankTransfer.impl.BankAccountImpl
	 * @see bankTransfer.model.bankTransfer.impl.BankTransferPackageImpl#getBankAccount()
	 * @generated
	 */
	int BANK_ACCOUNT = 0;

	/**
	 * The feature id for the '<em><b>Iban</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_ACCOUNT__IBAN = 0;

	/**
	 * The feature id for the '<em><b>Bic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_ACCOUNT__BIC = 1;

	/**
	 * The feature id for the '<em><b>Account Balance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_ACCOUNT__ACCOUNT_BALANCE = 2;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_ACCOUNT__OWNER = 3;

	/**
	 * The feature id for the '<em><b>Currency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_ACCOUNT__CURRENCY = 4;

	/**
	 * The number of structural features of the '<em>Bank Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_ACCOUNT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Bank Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_ACCOUNT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bankTransfer.model.bankTransfer.impl.OwnerImpl <em>Owner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bankTransfer.model.bankTransfer.impl.OwnerImpl
	 * @see bankTransfer.model.bankTransfer.impl.BankTransferPackageImpl#getOwner()
	 * @generated
	 */
	int OWNER = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Adress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNER__ADRESS = 1;

	/**
	 * The feature id for the '<em><b>Phone Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNER__PHONE_NUMBER = 2;

	/**
	 * The feature id for the '<em><b>Bank Account</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNER__BANK_ACCOUNT = 3;

	/**
	 * The number of structural features of the '<em>Owner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Owner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bankTransfer.model.bankTransfer.impl.ExchangeRateAPIImpl <em>Exchange Rate API</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bankTransfer.model.bankTransfer.impl.ExchangeRateAPIImpl
	 * @see bankTransfer.model.bankTransfer.impl.BankTransferPackageImpl#getExchangeRateAPI()
	 * @generated
	 */
	int EXCHANGE_RATE_API = 2;

	/**
	 * The number of structural features of the '<em>Exchange Rate API</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_RATE_API_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get exchangerate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_RATE_API___GET_EXCHANGERATE = 0;

	/**
	 * The number of operations of the '<em>Exchange Rate API</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_RATE_API_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link bankTransfer.model.bankTransfer.Currency <em>Currency</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bankTransfer.model.bankTransfer.Currency
	 * @see bankTransfer.model.bankTransfer.impl.BankTransferPackageImpl#getCurrency()
	 * @generated
	 */
	int CURRENCY = 3;

	/**
	 * Returns the meta object for class '{@link bankTransfer.model.bankTransfer.BankAccount <em>Bank Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bank Account</em>'.
	 * @see bankTransfer.model.bankTransfer.BankAccount
	 * @generated
	 */
	EClass getBankAccount();

	/**
	 * Returns the meta object for the attribute '{@link bankTransfer.model.bankTransfer.BankAccount#getIban <em>Iban</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Iban</em>'.
	 * @see bankTransfer.model.bankTransfer.BankAccount#getIban()
	 * @see #getBankAccount()
	 * @generated
	 */
	EAttribute getBankAccount_Iban();

	/**
	 * Returns the meta object for the attribute '{@link bankTransfer.model.bankTransfer.BankAccount#getBic <em>Bic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bic</em>'.
	 * @see bankTransfer.model.bankTransfer.BankAccount#getBic()
	 * @see #getBankAccount()
	 * @generated
	 */
	EAttribute getBankAccount_Bic();

	/**
	 * Returns the meta object for the attribute '{@link bankTransfer.model.bankTransfer.BankAccount#getAccountBalance <em>Account Balance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Account Balance</em>'.
	 * @see bankTransfer.model.bankTransfer.BankAccount#getAccountBalance()
	 * @see #getBankAccount()
	 * @generated
	 */
	EAttribute getBankAccount_AccountBalance();

	/**
	 * Returns the meta object for the reference list '{@link bankTransfer.model.bankTransfer.BankAccount#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owner</em>'.
	 * @see bankTransfer.model.bankTransfer.BankAccount#getOwner()
	 * @see #getBankAccount()
	 * @generated
	 */
	EReference getBankAccount_Owner();

	/**
	 * Returns the meta object for the attribute '{@link bankTransfer.model.bankTransfer.BankAccount#getCurrency <em>Currency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Currency</em>'.
	 * @see bankTransfer.model.bankTransfer.BankAccount#getCurrency()
	 * @see #getBankAccount()
	 * @generated
	 */
	EAttribute getBankAccount_Currency();

	/**
	 * Returns the meta object for class '{@link bankTransfer.model.bankTransfer.Owner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Owner</em>'.
	 * @see bankTransfer.model.bankTransfer.Owner
	 * @generated
	 */
	EClass getOwner();

	/**
	 * Returns the meta object for the attribute '{@link bankTransfer.model.bankTransfer.Owner#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see bankTransfer.model.bankTransfer.Owner#getName()
	 * @see #getOwner()
	 * @generated
	 */
	EAttribute getOwner_Name();

	/**
	 * Returns the meta object for the attribute '{@link bankTransfer.model.bankTransfer.Owner#getAdress <em>Adress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adress</em>'.
	 * @see bankTransfer.model.bankTransfer.Owner#getAdress()
	 * @see #getOwner()
	 * @generated
	 */
	EAttribute getOwner_Adress();

	/**
	 * Returns the meta object for the attribute '{@link bankTransfer.model.bankTransfer.Owner#getPhoneNumber <em>Phone Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phone Number</em>'.
	 * @see bankTransfer.model.bankTransfer.Owner#getPhoneNumber()
	 * @see #getOwner()
	 * @generated
	 */
	EAttribute getOwner_PhoneNumber();

	/**
	 * Returns the meta object for the reference list '{@link bankTransfer.model.bankTransfer.Owner#getBankAccount <em>Bank Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Bank Account</em>'.
	 * @see bankTransfer.model.bankTransfer.Owner#getBankAccount()
	 * @see #getOwner()
	 * @generated
	 */
	EReference getOwner_BankAccount();

	/**
	 * Returns the meta object for class '{@link bankTransfer.model.bankTransfer.ExchangeRateAPI <em>Exchange Rate API</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exchange Rate API</em>'.
	 * @see bankTransfer.model.bankTransfer.ExchangeRateAPI
	 * @generated
	 */
	EClass getExchangeRateAPI();

	/**
	 * Returns the meta object for the '{@link bankTransfer.model.bankTransfer.ExchangeRateAPI#get_exchangerate() <em>Get exchangerate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get exchangerate</em>' operation.
	 * @see bankTransfer.model.bankTransfer.ExchangeRateAPI#get_exchangerate()
	 * @generated
	 */
	EOperation getExchangeRateAPI__Get_exchangerate();

	/**
	 * Returns the meta object for enum '{@link bankTransfer.model.bankTransfer.Currency <em>Currency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Currency</em>'.
	 * @see bankTransfer.model.bankTransfer.Currency
	 * @generated
	 */
	EEnum getCurrency();

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
		 * The meta object literal for the '{@link bankTransfer.model.bankTransfer.impl.BankAccountImpl <em>Bank Account</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bankTransfer.model.bankTransfer.impl.BankAccountImpl
		 * @see bankTransfer.model.bankTransfer.impl.BankTransferPackageImpl#getBankAccount()
		 * @generated
		 */
		EClass BANK_ACCOUNT = eINSTANCE.getBankAccount();

		/**
		 * The meta object literal for the '<em><b>Iban</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BANK_ACCOUNT__IBAN = eINSTANCE.getBankAccount_Iban();

		/**
		 * The meta object literal for the '<em><b>Bic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BANK_ACCOUNT__BIC = eINSTANCE.getBankAccount_Bic();

		/**
		 * The meta object literal for the '<em><b>Account Balance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BANK_ACCOUNT__ACCOUNT_BALANCE = eINSTANCE.getBankAccount_AccountBalance();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BANK_ACCOUNT__OWNER = eINSTANCE.getBankAccount_Owner();

		/**
		 * The meta object literal for the '<em><b>Currency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BANK_ACCOUNT__CURRENCY = eINSTANCE.getBankAccount_Currency();

		/**
		 * The meta object literal for the '{@link bankTransfer.model.bankTransfer.impl.OwnerImpl <em>Owner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bankTransfer.model.bankTransfer.impl.OwnerImpl
		 * @see bankTransfer.model.bankTransfer.impl.BankTransferPackageImpl#getOwner()
		 * @generated
		 */
		EClass OWNER = eINSTANCE.getOwner();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OWNER__NAME = eINSTANCE.getOwner_Name();

		/**
		 * The meta object literal for the '<em><b>Adress</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OWNER__ADRESS = eINSTANCE.getOwner_Adress();

		/**
		 * The meta object literal for the '<em><b>Phone Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OWNER__PHONE_NUMBER = eINSTANCE.getOwner_PhoneNumber();

		/**
		 * The meta object literal for the '<em><b>Bank Account</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OWNER__BANK_ACCOUNT = eINSTANCE.getOwner_BankAccount();

		/**
		 * The meta object literal for the '{@link bankTransfer.model.bankTransfer.impl.ExchangeRateAPIImpl <em>Exchange Rate API</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bankTransfer.model.bankTransfer.impl.ExchangeRateAPIImpl
		 * @see bankTransfer.model.bankTransfer.impl.BankTransferPackageImpl#getExchangeRateAPI()
		 * @generated
		 */
		EClass EXCHANGE_RATE_API = eINSTANCE.getExchangeRateAPI();

		/**
		 * The meta object literal for the '<em><b>Get exchangerate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXCHANGE_RATE_API___GET_EXCHANGERATE = eINSTANCE.getExchangeRateAPI__Get_exchangerate();

		/**
		 * The meta object literal for the '{@link bankTransfer.model.bankTransfer.Currency <em>Currency</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bankTransfer.model.bankTransfer.Currency
		 * @see bankTransfer.model.bankTransfer.impl.BankTransferPackageImpl#getCurrency()
		 * @generated
		 */
		EEnum CURRENCY = eINSTANCE.getCurrency();

	}

} //BankTransferPackage
