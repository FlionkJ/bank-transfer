/**
 */
package bankTransfer.model.bankTransfer.impl;

import bankTransfer.model.bankTransfer.BankAccount;
import bankTransfer.model.bankTransfer.BankTransferFactory;
import bankTransfer.model.bankTransfer.BankTransferPackage;
import bankTransfer.model.bankTransfer.Currency;
import bankTransfer.model.bankTransfer.ExchangeRateAPI;
import bankTransfer.model.bankTransfer.Owner;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BankTransferPackageImpl extends EPackageImpl implements BankTransferPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bankAccountEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ownerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exchangeRateAPIEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum currencyEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see bankTransfer.model.bankTransfer.BankTransferPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BankTransferPackageImpl() {
		super(eNS_URI, BankTransferFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link BankTransferPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BankTransferPackage init() {
		if (isInited)
			return (BankTransferPackage) EPackage.Registry.INSTANCE.getEPackage(BankTransferPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredBankTransferPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		BankTransferPackageImpl theBankTransferPackage = registeredBankTransferPackage instanceof BankTransferPackageImpl
				? (BankTransferPackageImpl) registeredBankTransferPackage
				: new BankTransferPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theBankTransferPackage.createPackageContents();

		// Initialize created meta-data
		theBankTransferPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBankTransferPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BankTransferPackage.eNS_URI, theBankTransferPackage);
		return theBankTransferPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBankAccount() {
		return bankAccountEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBankAccount_Iban() {
		return (EAttribute) bankAccountEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBankAccount_Bic() {
		return (EAttribute) bankAccountEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBankAccount_AccountBalance() {
		return (EAttribute) bankAccountEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBankAccount_Owner() {
		return (EReference) bankAccountEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBankAccount_Currency() {
		return (EAttribute) bankAccountEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOwner() {
		return ownerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOwner_Name() {
		return (EAttribute) ownerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOwner_Adress() {
		return (EAttribute) ownerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOwner_PhoneNumber() {
		return (EAttribute) ownerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOwner_BankAccount() {
		return (EReference) ownerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExchangeRateAPI() {
		return exchangeRateAPIEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getExchangeRateAPI__Get_exchangerate() {
		return exchangeRateAPIEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCurrency() {
		return currencyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BankTransferFactory getBankTransferFactory() {
		return (BankTransferFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		bankAccountEClass = createEClass(BANK_ACCOUNT);
		createEAttribute(bankAccountEClass, BANK_ACCOUNT__IBAN);
		createEAttribute(bankAccountEClass, BANK_ACCOUNT__BIC);
		createEAttribute(bankAccountEClass, BANK_ACCOUNT__ACCOUNT_BALANCE);
		createEReference(bankAccountEClass, BANK_ACCOUNT__OWNER);
		createEAttribute(bankAccountEClass, BANK_ACCOUNT__CURRENCY);

		ownerEClass = createEClass(OWNER);
		createEAttribute(ownerEClass, OWNER__NAME);
		createEAttribute(ownerEClass, OWNER__ADRESS);
		createEAttribute(ownerEClass, OWNER__PHONE_NUMBER);
		createEReference(ownerEClass, OWNER__BANK_ACCOUNT);

		exchangeRateAPIEClass = createEClass(EXCHANGE_RATE_API);
		createEOperation(exchangeRateAPIEClass, EXCHANGE_RATE_API___GET_EXCHANGERATE);

		// Create enums
		currencyEEnum = createEEnum(CURRENCY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(bankAccountEClass, BankAccount.class, "BankAccount", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBankAccount_Iban(), ecorePackage.getEString(), "iban", null, 0, 1, BankAccount.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBankAccount_Bic(), ecorePackage.getEString(), "bic", null, 0, 1, BankAccount.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBankAccount_AccountBalance(), ecorePackage.getEInt(), "accountBalance", null, 0, 1,
				BankAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getBankAccount_Owner(), this.getOwner(), this.getOwner_BankAccount(), "owner", null, 0, 3,
				BankAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBankAccount_Currency(), this.getCurrency(), "currency", null, 0, 1, BankAccount.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ownerEClass, Owner.class, "Owner", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOwner_Name(), ecorePackage.getEString(), "name", null, 0, 1, Owner.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOwner_Adress(), ecorePackage.getEString(), "adress", null, 0, 1, Owner.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOwner_PhoneNumber(), ecorePackage.getEInt(), "phoneNumber", null, 0, 1, Owner.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOwner_BankAccount(), this.getBankAccount(), this.getBankAccount_Owner(), "bankAccount", null,
				0, -1, Owner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exchangeRateAPIEClass, ExchangeRateAPI.class, "ExchangeRateAPI", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getExchangeRateAPI__Get_exchangerate(), null, "get_exchangerate", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(currencyEEnum, Currency.class, "Currency");
		addEEnumLiteral(currencyEEnum, Currency.EUR);
		addEEnumLiteral(currencyEEnum, Currency.USD);
		addEEnumLiteral(currencyEEnum, Currency.SEK);
		addEEnumLiteral(currencyEEnum, Currency.NOK);

		// Create resource
		createResource(eNS_URI);
	}

} //BankTransferPackageImpl
