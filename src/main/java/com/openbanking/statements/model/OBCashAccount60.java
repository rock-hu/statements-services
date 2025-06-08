package com.openbanking.statements.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * Unambiguous identification of the account of the creditor, in the case of a debit transaction.
 */

@Schema(description = "Unambiguous identification of the account of the creditor, in the case of a debit transaction.")
@Getter
@Setter
public class OBCashAccount60 implements Serializable {
	private static final long serialVersionUID = 1L;

}
