package com.openbanking.statements.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * Set of elements to describe the card instrument used in the transaction.
 */

@Schema(description = "Set of elements to describe the card instrument used in the transaction.")
@Getter
@Setter
public class OBTransactionCardInstrument1 implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * Name of the card scheme.
	 */
	public enum CardSchemeNameEnum {
		AMERICANEXPRESS("AmericanExpress"),

		DINERS("Diners"),

		DISCOVER("Discover"),

		MASTERCARD("MasterCard"),

		VISA("VISA");

		private String value;

		CardSchemeNameEnum(String value) {
			this.value = value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		public static CardSchemeNameEnum fromValue(String text) {
			for (CardSchemeNameEnum b : CardSchemeNameEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}
	}

	/**
	 * The card authorisation type.
	 */
	public enum AuthorisationTypeEnum {
		CONSUMERDEVICE("ConsumerDevice"),

		CONTACTLESS("Contactless"),

		NONE("None"),

		PIN("PIN");

		private String value;

		AuthorisationTypeEnum(String value) {
			this.value = value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		public static AuthorisationTypeEnum fromValue(String text) {
			for (AuthorisationTypeEnum b : AuthorisationTypeEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}
	}

}
