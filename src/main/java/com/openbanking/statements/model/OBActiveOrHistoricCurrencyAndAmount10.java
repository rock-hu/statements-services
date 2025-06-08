package com.openbanking.statements.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * Transaction charges to be paid by the charge bearer.
 */

@Schema(description = "Transaction charges to be paid by the charge bearer.")
@Getter
@Setter
public class OBActiveOrHistoricCurrencyAndAmount10 implements Serializable {
	private static final long serialVersionUID = 1L;

}
