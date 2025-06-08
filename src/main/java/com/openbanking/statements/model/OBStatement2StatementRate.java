package com.openbanking.statements.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * Set of elements used to provide details of a generic rate related to the statement resource.
 */

@Schema(description = "Set of elements used to provide details of a generic rate related to the statement resource.")
@Getter
@Setter
public class OBStatement2StatementRate implements Serializable {
	private static final long serialVersionUID = 1L;

}
