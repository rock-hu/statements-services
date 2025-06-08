package com.openbanking.statements.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * Amount of money to be moved between the debtor and creditor, before deduction of charges, expressed in the currency
 * as ordered by the initiating party.
 */

@Schema(
		description = "Amount of money to be moved between the debtor and creditor, before deduction of charges, expressed in the currency as ordered by the initiating party.")
@Getter
@Setter
public class OBCurrencyExchange5InstructedAmount implements Serializable {
	private static final long serialVersionUID = 1L;

}
