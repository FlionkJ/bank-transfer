/**
 */
package bankTransfer.model.bankTransfer.impl;

import bankTransfer.model.bankTransfer.BankAccount;
import bankTransfer.model.bankTransfer.BankTransferPackage;
import bankTransfer.model.bankTransfer.Owner;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Owner</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bankTransfer.model.bankTransfer.impl.OwnerImpl#getName <em>Name</em>}</li>
 *   <li>{@link bankTransfer.model.bankTransfer.impl.OwnerImpl#getAdress <em>Adress</em>}</li>
 *   <li>{@link bankTransfer.model.bankTransfer.impl.OwnerImpl#getPhoneNumber <em>Phone Number</em>}</li>
 *   <li>{@link bankTransfer.model.bankTransfer.impl.OwnerImpl#getBankAccount <em>Bank Account</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OwnerImpl extends MinimalEObjectImpl.Container implements Owner {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAdress() <em>Adress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdress()
	 * @generated
	 * @ordered
	 */
	protected static final String ADRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdress() <em>Adress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdress()
	 * @generated
	 * @ordered
	 */
	protected String adress = ADRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhoneNumber() <em>Phone Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhoneNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int PHONE_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPhoneNumber() <em>Phone Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhoneNumber()
	 * @generated
	 * @ordered
	 */
	protected int phoneNumber = PHONE_NUMBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBankAccount() <em>Bank Account</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBankAccount()
	 * @generated
	 * @ordered
	 */
	protected EList<BankAccount> bankAccount;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OwnerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BankTransferPackage.Literals.OWNER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BankTransferPackage.OWNER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAdress() {
		return adress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAdress(String newAdress) {
		String oldAdress = adress;
		adress = newAdress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BankTransferPackage.OWNER__ADRESS, oldAdress,
					adress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPhoneNumber(int newPhoneNumber) {
		int oldPhoneNumber = phoneNumber;
		phoneNumber = newPhoneNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BankTransferPackage.OWNER__PHONE_NUMBER,
					oldPhoneNumber, phoneNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BankAccount> getBankAccount() {
		if (bankAccount == null) {
			bankAccount = new EObjectWithInverseResolvingEList.ManyInverse<BankAccount>(BankAccount.class, this,
					BankTransferPackage.OWNER__BANK_ACCOUNT, BankTransferPackage.BANK_ACCOUNT__OWNER);
		}
		return bankAccount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BankTransferPackage.OWNER__BANK_ACCOUNT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getBankAccount()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BankTransferPackage.OWNER__BANK_ACCOUNT:
			return ((InternalEList<?>) getBankAccount()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case BankTransferPackage.OWNER__NAME:
			return getName();
		case BankTransferPackage.OWNER__ADRESS:
			return getAdress();
		case BankTransferPackage.OWNER__PHONE_NUMBER:
			return getPhoneNumber();
		case BankTransferPackage.OWNER__BANK_ACCOUNT:
			return getBankAccount();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case BankTransferPackage.OWNER__NAME:
			setName((String) newValue);
			return;
		case BankTransferPackage.OWNER__ADRESS:
			setAdress((String) newValue);
			return;
		case BankTransferPackage.OWNER__PHONE_NUMBER:
			setPhoneNumber((Integer) newValue);
			return;
		case BankTransferPackage.OWNER__BANK_ACCOUNT:
			getBankAccount().clear();
			getBankAccount().addAll((Collection<? extends BankAccount>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case BankTransferPackage.OWNER__NAME:
			setName(NAME_EDEFAULT);
			return;
		case BankTransferPackage.OWNER__ADRESS:
			setAdress(ADRESS_EDEFAULT);
			return;
		case BankTransferPackage.OWNER__PHONE_NUMBER:
			setPhoneNumber(PHONE_NUMBER_EDEFAULT);
			return;
		case BankTransferPackage.OWNER__BANK_ACCOUNT:
			getBankAccount().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case BankTransferPackage.OWNER__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case BankTransferPackage.OWNER__ADRESS:
			return ADRESS_EDEFAULT == null ? adress != null : !ADRESS_EDEFAULT.equals(adress);
		case BankTransferPackage.OWNER__PHONE_NUMBER:
			return phoneNumber != PHONE_NUMBER_EDEFAULT;
		case BankTransferPackage.OWNER__BANK_ACCOUNT:
			return bankAccount != null && !bankAccount.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", adress: ");
		result.append(adress);
		result.append(", phoneNumber: ");
		result.append(phoneNumber);
		result.append(')');
		return result.toString();
	}

} //OwnerImpl
