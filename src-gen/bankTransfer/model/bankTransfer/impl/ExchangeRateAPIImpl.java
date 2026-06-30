/**
 */
package bankTransfer.model.bankTransfer.impl;

import bankTransfer.model.bankTransfer.BankTransferPackage;
import bankTransfer.model.bankTransfer.ExchangeRateAPI;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exchange Rate API</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ExchangeRateAPIImpl extends MinimalEObjectImpl.Container implements ExchangeRateAPI {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExchangeRateAPIImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BankTransferPackage.Literals.EXCHANGE_RATE_API;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void get_exchangerate() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case BankTransferPackage.EXCHANGE_RATE_API___GET_EXCHANGERATE:
			get_exchangerate();
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ExchangeRateAPIImpl
