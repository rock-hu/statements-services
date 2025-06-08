package com.openbanking.statements.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * Details of the merchant involved in the transaction.
 */

@Schema(description = "Details of the merchant involved in the transaction.")
@Getter
@Setter
public class OBMerchantDetails1 implements Serializable {
	private static final long serialVersionUID = 1L;

}
