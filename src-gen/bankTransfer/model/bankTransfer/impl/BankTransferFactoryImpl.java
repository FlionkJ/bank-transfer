/**
 */
package bankTransfer.model.bankTransfer.impl;

import bankTransfer.model.bankTransfer.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BankTransferFactoryImpl extends EFactoryImpl implements BankTransferFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BankTransferFactory init() {
		try {
			BankTransferFactory theBankTransferFactory = (BankTransferFactory) EPackage.Registry.INSTANCE
					.getEFactory(BankTransferPackage.eNS_URI);
			if (theBankTransferFactory != null) {
				return theBankTransferFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BankTransferFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BankTransferFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case BankTransferPackage.BANK_ACCOUNT:
			return createBankAccount();
		case BankTransferPackage.OWNER:
			return createOwner();
		case BankTransferPackage.EXCHANGE_RATE_API:
			return createExchangeRateAPI();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case BankTransferPackage.CURRENCY:
			return createCurrencyFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case BankTransferPackage.CURRENCY:
			return convertCurrencyToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BankAccount createBankAccount() {
		BankAccountImpl bankAccount = new BankAccountImpl();
		return bankAccount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Owner createOwner() {
		OwnerImpl owner = new OwnerImpl();
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExchangeRateAPI createExchangeRateAPI() {
		ExchangeRateAPIImpl exchangeRateAPI = new ExchangeRateAPIImpl();
		return exchangeRateAPI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Currency createCurrencyFromString(EDataType eDataType, String initialValue) {
		Currency result = Currency.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCurrencyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BankTransferPackage getBankTransferPackage() {
		return (BankTransferPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BankTransferPackage getPackage() {
		return BankTransferPackage.eINSTANCE;
	}

} //BankTransferFactoryImpl
