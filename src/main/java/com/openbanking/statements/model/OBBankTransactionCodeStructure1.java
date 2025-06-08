package com.openbanking.statements.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * Set of elements used to fully identify the type of underlying transaction resulting in an entry.
 */

@Schema(description = "Set of elements used to fully identify the type of underlying transaction resulting in an entry.")
@Getter
@Setter
public class OBBankTransactionCodeStructure1 implements Serializable {
	private static final long serialVersionUID = 1L;

}
