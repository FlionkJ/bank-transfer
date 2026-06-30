/**
 */
package bankTransfer.model.bankTransfer.impl;

import bankTransfer.model.bankTransfer.BankAccount;
import bankTransfer.model.bankTransfer.BankTransferPackage;
import bankTransfer.model.bankTransfer.Currency;
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
 * An implementation of the model object '<em><b>Bank Account</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bankTransfer.model.bankTransfer.impl.BankAccountImpl#getIban <em>Iban</em>}</li>
 *   <li>{@link bankTransfer.model.bankTransfer.impl.BankAccountImpl#getBic <em>Bic</em>}</li>
 *   <li>{@link bankTransfer.model.bankTransfer.impl.BankAccountImpl#getAccountBalance <em>Account Balance</em>}</li>
 *   <li>{@link bankTransfer.model.bankTransfer.impl.BankAccountImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link bankTransfer.model.bankTransfer.impl.BankAccountImpl#getCurrency <em>Currency</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BankAccountImpl extends MinimalEObjectImpl.Container implements BankAccount {
	/**
	 * The default value of the '{@link #getIban() <em>Iban</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIban()
	 * @generated
	 * @ordered
	 */
	protected static final String IBAN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIban() <em>Iban</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIban()
	 * @generated
	 * @ordered
	 */
	protected String iban = IBAN_EDEFAULT;

	/**
	 * The default value of the '{@link #getBic() <em>Bic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBic()
	 * @generated
	 * @ordered
	 */
	protected static final String BIC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBic() <em>Bic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBic()
	 * @generated
	 * @ordered
	 */
	protected String bic = BIC_EDEFAULT;

	/**
	 * The default value of the '{@link #getAccountBalance() <em>Account Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountBalance()
	 * @generated
	 * @ordered
	 */
	protected static final int ACCOUNT_BALANCE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAccountBalance() <em>Account Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountBalance()
	 * @generated
	 * @ordered
	 */
	protected int accountBalance = ACCOUNT_BALANCE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwner() <em>Owner</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwner()
	 * @generated
	 * @ordered
	 */
	protected EList<Owner> owner;

	/**
	 * The default value of the '{@link #getCurrency() <em>Currency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrency()
	 * @generated
	 * @ordered
	 */
	protected static final Currency CURRENCY_EDEFAULT = Currency.EUR;

	/**
	 * The cached value of the '{@link #getCurrency() <em>Currency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrency()
	 * @generated
	 * @ordered
	 */
	protected Currency currency = CURRENCY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BankAccountImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BankTransferPackage.Literals.BANK_ACCOUNT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIban() {
		return iban;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIban(String newIban) {
		String oldIban = iban;
		iban = newIban;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BankTransferPackage.BANK_ACCOUNT__IBAN, oldIban,
					iban));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBic() {
		return bic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBic(String newBic) {
		String oldBic = bic;
		bic = newBic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BankTransferPackage.BANK_ACCOUNT__BIC, oldBic, bic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getAccountBalance() {
		return accountBalance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccountBalance(int newAccountBalance) {
		int oldAccountBalance = accountBalance;
		accountBalance = newAccountBalance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BankTransferPackage.BANK_ACCOUNT__ACCOUNT_BALANCE,
					oldAccountBalance, accountBalance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Owner> getOwner() {
		if (owner == null) {
			owner = new EObjectWithInverseResolvingEList.ManyInverse<Owner>(Owner.class, this,
					BankTransferPackage.BANK_ACCOUNT__OWNER, BankTransferPackage.OWNER__BANK_ACCOUNT);
		}
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Currency getCurrency() {
		return currency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrency(Currency newCurrency) {
		Currency oldCurrency = currency;
		currency = newCurrency == null ? CURRENCY_EDEFAULT : newCurrency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BankTransferPackage.BANK_ACCOUNT__CURRENCY,
					oldCurrency, currency));
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
		case BankTransferPackage.BANK_ACCOUNT__OWNER:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getOwner()).basicAdd(otherEnd, msgs);
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
		case BankTransferPackage.BANK_ACCOUNT__OWNER:
			return ((InternalEList<?>) getOwner()).basicRemove(otherEnd, msgs);
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
		case BankTransferPackage.BANK_ACCOUNT__IBAN:
			return getIban();
		case BankTransferPackage.BANK_ACCOUNT__BIC:
			return getBic();
		case BankTransferPackage.BANK_ACCOUNT__ACCOUNT_BALANCE:
			return getAccountBalance();
		case BankTransferPackage.BANK_ACCOUNT__OWNER:
			return getOwner();
		case BankTransferPackage.BANK_ACCOUNT__CURRENCY:
			return getCurrency();
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
		case BankTransferPackage.BANK_ACCOUNT__IBAN:
			setIban((String) newValue);
			return;
		case BankTransferPackage.BANK_ACCOUNT__BIC:
			setBic((String) newValue);
			return;
		case BankTransferPackage.BANK_ACCOUNT__ACCOUNT_BALANCE:
			setAccountBalance((Integer) newValue);
			return;
		case BankTransferPackage.BANK_ACCOUNT__OWNER:
			getOwner().clear();
			getOwner().addAll((Collection<? extends Owner>) newValue);
			return;
		case BankTransferPackage.BANK_ACCOUNT__CURRENCY:
			setCurrency((Currency) newValue);
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
		case BankTransferPackage.BANK_ACCOUNT__IBAN:
			setIban(IBAN_EDEFAULT);
			return;
		case BankTransferPackage.BANK_ACCOUNT__BIC:
			setBic(BIC_EDEFAULT);
			return;
		case BankTransferPackage.BANK_ACCOUNT__ACCOUNT_BALANCE:
			setAccountBalance(ACCOUNT_BALANCE_EDEFAULT);
			return;
		case BankTransferPackage.BANK_ACCOUNT__OWNER:
			getOwner().clear();
			return;
		case BankTransferPackage.BANK_ACCOUNT__CURRENCY:
			setCurrency(CURRENCY_EDEFAULT);
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
		case BankTransferPackage.BANK_ACCOUNT__IBAN:
			return IBAN_EDEFAULT == null ? iban != null : !IBAN_EDEFAULT.equals(iban);
		case BankTransferPackage.BANK_ACCOUNT__BIC:
			return BIC_EDEFAULT == null ? bic != null : !BIC_EDEFAULT.equals(bic);
		case BankTransferPackage.BANK_ACCOUNT__ACCOUNT_BALANCE:
			return accountBalance != ACCOUNT_BALANCE_EDEFAULT;
		case BankTransferPackage.BANK_ACCOUNT__OWNER:
			return owner != null && !owner.isEmpty();
		case BankTransferPackage.BANK_ACCOUNT__CURRENCY:
			return currency != CURRENCY_EDEFAULT;
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
		result.append(" (iban: ");
		result.append(iban);
		result.append(", bic: ");
		result.append(bic);
		result.append(", accountBalance: ");
		result.append(accountBalance);
		result.append(", currency: ");
		result.append(currency);
		result.append(')');
		return result.toString();
	}

} //BankAccountImpl
