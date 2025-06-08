package com.openbanking.statements.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * Unambiguous identification of the account of the debtor, in the case of a crebit transaction.
 */

@Schema(description = "Unambiguous identification of the account of the debtor, in the case of a crebit transaction.")
@Getter
@Setter
public class OBCashAccount61 implements Serializable {
	private static final long serialVersionUID = 1L;

}
