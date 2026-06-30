/**
 */
package bankTransfer.model.bankTransfer.impl;

import bankTransfer.model.bankTransfer.BankTransferFactory;
import bankTransfer.model.bankTransfer.BankTransferPackage;
import bankTransfer.model.bankTransfer.Inhaber;
import bankTransfer.model.bankTransfer.Konto;
import bankTransfer.model.bankTransfer.Waehrung;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
	private EClass kontoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inhaberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum waehrungEEnum = null;

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
	public EClass getKonto() {
		return kontoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKonto_Iban() {
		return (EAttribute) kontoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKonto_Bic() {
		return (EAttribute) kontoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKonto_Kontostand() {
		return (EAttribute) kontoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKonto_Inhaber() {
		return (EReference) kontoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKonto_Waehrung() {
		return (EAttribute) kontoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInhaber() {
		return inhaberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInhaber_Name() {
		return (EAttribute) inhaberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInhaber_Anschrift() {
		return (EAttribute) inhaberEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInhaber_Telefonnummer() {
		return (EAttribute) inhaberEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInhaber_Konto() {
		return (EReference) inhaberEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getWaehrung() {
		return waehrungEEnum;
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
		kontoEClass = createEClass(KONTO);
		createEAttribute(kontoEClass, KONTO__IBAN);
		createEAttribute(kontoEClass, KONTO__BIC);
		createEAttribute(kontoEClass, KONTO__KONTOSTAND);
		createEReference(kontoEClass, KONTO__INHABER);
		createEAttribute(kontoEClass, KONTO__WAEHRUNG);

		inhaberEClass = createEClass(INHABER);
		createEAttribute(inhaberEClass, INHABER__NAME);
		createEAttribute(inhaberEClass, INHABER__ANSCHRIFT);
		createEAttribute(inhaberEClass, INHABER__TELEFONNUMMER);
		createEReference(inhaberEClass, INHABER__KONTO);

		// Create enums
		waehrungEEnum = createEEnum(WAEHRUNG);
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
		initEClass(kontoEClass, Konto.class, "Konto", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKonto_Iban(), ecorePackage.getEString(), "iban", null, 0, 1, Konto.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKonto_Bic(), ecorePackage.getEString(), "bic", null, 0, 1, Konto.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKonto_Kontostand(), ecorePackage.getEInt(), "kontostand", null, 0, 1, Konto.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKonto_Inhaber(), this.getInhaber(), this.getInhaber_Konto(), "inhaber", null, 0, 3,
				Konto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKonto_Waehrung(), this.getWaehrung(), "waehrung", null, 0, 1, Konto.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inhaberEClass, Inhaber.class, "Inhaber", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInhaber_Name(), ecorePackage.getEString(), "name", null, 0, 1, Inhaber.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInhaber_Anschrift(), ecorePackage.getEString(), "anschrift", null, 0, 1, Inhaber.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInhaber_Telefonnummer(), ecorePackage.getEInt(), "telefonnummer", null, 0, 1, Inhaber.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInhaber_Konto(), this.getKonto(), this.getKonto_Inhaber(), "konto", null, 0, -1,
				Inhaber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(waehrungEEnum, Waehrung.class, "Waehrung");
		addEEnumLiteral(waehrungEEnum, Waehrung.EURO);
		addEEnumLiteral(waehrungEEnum, Waehrung.USDOLLAR);
		addEEnumLiteral(waehrungEEnum, Waehrung.SEK);
		addEEnumLiteral(waehrungEEnum, Waehrung.NOK);

		// Create resource
		createResource(eNS_URI);
	}

} //BankTransferPackageImpl
