/**
 */
package bankTransfer.model.bankTransfer.impl;

import bankTransfer.model.bankTransfer.BankTransferPackage;
import bankTransfer.model.bankTransfer.Inhaber;
import bankTransfer.model.bankTransfer.Konto;
import bankTransfer.model.bankTransfer.Waehrung;

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
 * An implementation of the model object '<em><b>Konto</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bankTransfer.model.bankTransfer.impl.KontoImpl#getIban <em>Iban</em>}</li>
 *   <li>{@link bankTransfer.model.bankTransfer.impl.KontoImpl#getBic <em>Bic</em>}</li>
 *   <li>{@link bankTransfer.model.bankTransfer.impl.KontoImpl#getKontostand <em>Kontostand</em>}</li>
 *   <li>{@link bankTransfer.model.bankTransfer.impl.KontoImpl#getInhaber <em>Inhaber</em>}</li>
 *   <li>{@link bankTransfer.model.bankTransfer.impl.KontoImpl#getWaehrung <em>Waehrung</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KontoImpl extends MinimalEObjectImpl.Container implements Konto {
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
	 * The default value of the '{@link #getKontostand() <em>Kontostand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKontostand()
	 * @generated
	 * @ordered
	 */
	protected static final int KONTOSTAND_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getKontostand() <em>Kontostand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKontostand()
	 * @generated
	 * @ordered
	 */
	protected int kontostand = KONTOSTAND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInhaber() <em>Inhaber</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInhaber()
	 * @generated
	 * @ordered
	 */
	protected EList<Inhaber> inhaber;

	/**
	 * The default value of the '{@link #getWaehrung() <em>Waehrung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaehrung()
	 * @generated
	 * @ordered
	 */
	protected static final Waehrung WAEHRUNG_EDEFAULT = Waehrung.EURO;

	/**
	 * The cached value of the '{@link #getWaehrung() <em>Waehrung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaehrung()
	 * @generated
	 * @ordered
	 */
	protected Waehrung waehrung = WAEHRUNG_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KontoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BankTransferPackage.Literals.KONTO;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BankTransferPackage.KONTO__IBAN, oldIban, iban));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BankTransferPackage.KONTO__BIC, oldBic, bic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getKontostand() {
		return kontostand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKontostand(int newKontostand) {
		int oldKontostand = kontostand;
		kontostand = newKontostand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BankTransferPackage.KONTO__KONTOSTAND, oldKontostand,
					kontostand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Inhaber> getInhaber() {
		if (inhaber == null) {
			inhaber = new EObjectWithInverseResolvingEList.ManyInverse<Inhaber>(Inhaber.class, this,
					BankTransferPackage.KONTO__INHABER, BankTransferPackage.INHABER__KONTO);
		}
		return inhaber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Waehrung getWaehrung() {
		return waehrung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWaehrung(Waehrung newWaehrung) {
		Waehrung oldWaehrung = waehrung;
		waehrung = newWaehrung == null ? WAEHRUNG_EDEFAULT : newWaehrung;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BankTransferPackage.KONTO__WAEHRUNG, oldWaehrung,
					waehrung));
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
		case BankTransferPackage.KONTO__INHABER:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getInhaber()).basicAdd(otherEnd, msgs);
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
		case BankTransferPackage.KONTO__INHABER:
			return ((InternalEList<?>) getInhaber()).basicRemove(otherEnd, msgs);
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
		case BankTransferPackage.KONTO__IBAN:
			return getIban();
		case BankTransferPackage.KONTO__BIC:
			return getBic();
		case BankTransferPackage.KONTO__KONTOSTAND:
			return getKontostand();
		case BankTransferPackage.KONTO__INHABER:
			return getInhaber();
		case BankTransferPackage.KONTO__WAEHRUNG:
			return getWaehrung();
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
		case BankTransferPackage.KONTO__IBAN:
			setIban((String) newValue);
			return;
		case BankTransferPackage.KONTO__BIC:
			setBic((String) newValue);
			return;
		case BankTransferPackage.KONTO__KONTOSTAND:
			setKontostand((Integer) newValue);
			return;
		case BankTransferPackage.KONTO__INHABER:
			getInhaber().clear();
			getInhaber().addAll((Collection<? extends Inhaber>) newValue);
			return;
		case BankTransferPackage.KONTO__WAEHRUNG:
			setWaehrung((Waehrung) newValue);
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
		case BankTransferPackage.KONTO__IBAN:
			setIban(IBAN_EDEFAULT);
			return;
		case BankTransferPackage.KONTO__BIC:
			setBic(BIC_EDEFAULT);
			return;
		case BankTransferPackage.KONTO__KONTOSTAND:
			setKontostand(KONTOSTAND_EDEFAULT);
			return;
		case BankTransferPackage.KONTO__INHABER:
			getInhaber().clear();
			return;
		case BankTransferPackage.KONTO__WAEHRUNG:
			setWaehrung(WAEHRUNG_EDEFAULT);
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
		case BankTransferPackage.KONTO__IBAN:
			return IBAN_EDEFAULT == null ? iban != null : !IBAN_EDEFAULT.equals(iban);
		case BankTransferPackage.KONTO__BIC:
			return BIC_EDEFAULT == null ? bic != null : !BIC_EDEFAULT.equals(bic);
		case BankTransferPackage.KONTO__KONTOSTAND:
			return kontostand != KONTOSTAND_EDEFAULT;
		case BankTransferPackage.KONTO__INHABER:
			return inhaber != null && !inhaber.isEmpty();
		case BankTransferPackage.KONTO__WAEHRUNG:
			return waehrung != WAEHRUNG_EDEFAULT;
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
		result.append(", kontostand: ");
		result.append(kontostand);
		result.append(", waehrung: ");
		result.append(waehrung);
		result.append(')');
		return result.toString();
	}

} //KontoImpl
