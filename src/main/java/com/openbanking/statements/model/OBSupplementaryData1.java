package com.openbanking.statements.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import java.util.HashMap;
import lombok.Getter;
import lombok.Setter;

/**
 * Additional information that can not be captured in the structured fields and/or any other specific block.
 */

@Schema(description = "Additional information that can not be captured in the structured fields and/or any other specific block.")
@Getter
@Setter
public class OBSupplementaryData1 extends HashMap<String, Object> implements Serializable {
	private static final long serialVersionUID = 1L;

}
