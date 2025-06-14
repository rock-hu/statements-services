package com.openbanking.statements.model;

/**
 * Indicates whether the amount is a credit or a debit. Usage: A zero amount is considered to be a credit amount.
 */
public enum OBCreditDebitCode0 {
	CREDIT("Credit"), DEBIT("Debit");

	private String value;

	OBCreditDebitCode0(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return String.valueOf(value);
	}

	public static OBCreditDebitCode0 fromValue(String text) {
		for (OBCreditDebitCode0 b : OBCreditDebitCode0.values()) {
			if (String.valueOf(b.value).equals(text)) {
				return b;
			}
		}
		return null;
	}
}
