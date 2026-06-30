/**
 */
package bankTransfer.model.bankTransfer;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Waehrung</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see bankTransfer.model.bankTransfer.BankTransferPackage#getWaehrung()
 * @model
 * @generated
 */
public enum Waehrung implements Enumerator {
	/**
	 * The '<em><b>EURO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EURO_VALUE
	 * @generated
	 * @ordered
	 */
	EURO(0, "EURO", "EURO"),

	/**
	 * The '<em><b>USDOLLAR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USDOLLAR_VALUE
	 * @generated
	 * @ordered
	 */
	USDOLLAR(1, "USDOLLAR", "USDOLLAR"),

	/**
	 * The '<em><b>SEK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEK_VALUE
	 * @generated
	 * @ordered
	 */
	SEK(2, "SEK", "SEK"),

	/**
	 * The '<em><b>NOK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOK_VALUE
	 * @generated
	 * @ordered
	 */
	NOK(3, "NOK", "NOK");

	/**
	 * The '<em><b>EURO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EURO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EURO_VALUE = 0;

	/**
	 * The '<em><b>USDOLLAR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USDOLLAR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int USDOLLAR_VALUE = 1;

	/**
	 * The '<em><b>SEK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SEK_VALUE = 2;

	/**
	 * The '<em><b>NOK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NOK_VALUE = 3;

	/**
	 * An array of all the '<em><b>Waehrung</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Waehrung[] VALUES_ARRAY = new Waehrung[] { EURO, USDOLLAR, SEK, NOK, };

	/**
	 * A public read-only list of all the '<em><b>Waehrung</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Waehrung> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Waehrung</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Waehrung get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Waehrung result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Waehrung</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Waehrung getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Waehrung result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Waehrung</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Waehrung get(int value) {
		switch (value) {
		case EURO_VALUE:
			return EURO;
		case USDOLLAR_VALUE:
			return USDOLLAR;
		case SEK_VALUE:
			return SEK;
		case NOK_VALUE:
			return NOK;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Waehrung(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
		return value;
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
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //Waehrung
