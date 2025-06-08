package com.openbanking.statements.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * Amount of money of the cash balance after a transaction entry is applied to the account..
 */

@Schema(description = "Amount of money of the cash balance after a transaction entry is applied to the account..")
@Getter
@Setter
public class OBTransactionCashBalanceAmount implements Serializable {
	private static final long serialVersionUID = 1L;

}
