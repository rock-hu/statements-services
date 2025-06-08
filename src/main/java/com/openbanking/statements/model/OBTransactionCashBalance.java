package com.openbanking.statements.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * Set of elements used to define the balance as a numerical representation of the net increases and decreases in an
 * account after a transaction entry is applied to the account.
 */

@Schema(
		description = "Set of elements used to define the balance as a numerical representation of the net increases and decreases in an account after a transaction entry is applied to the account.")
@Getter
@Setter
public class OBTransactionCashBalance implements Serializable {
	private static final long serialVersionUID = 1L;

}
