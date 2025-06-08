package com.openbanking.statements.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * Information that locates and identifies a specific address, as defined by postal services.
 */

@Schema(description = "Information that locates and identifies a specific address, as defined by postal services.")
@Getter
@Setter
public class OBPostalAddress6 implements Serializable {
	private static final long serialVersionUID = 1L;

}
