package com.openbanking.statements.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * Provides further details on a statement resource.
 */

@Schema(description = "Provides further details on a statement resource.")
@Getter
@Setter
public class OBStatement2 implements Serializable {
	private static final long serialVersionUID = 1L;

}
