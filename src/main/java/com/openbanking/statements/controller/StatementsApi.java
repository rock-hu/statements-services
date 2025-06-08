package com.openbanking.statements.controller;

import com.openbanking.statements.model.OBReadStatement2;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import java.util.Date;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Tag(name = "statements", description = "statements")
@RequestMapping(value = "")
public interface StatementsApi {

	@Operation(summary = "Get Statements", operationId = "getStatements", description = "", tags = { "Statements", })

	@RequestMapping(
			value = "/statements",
			produces = { "application/json; charset=utf-8", "application/json", "application/jose+jwe" },
			method = RequestMethod.GET)
	default ResponseEntity<OBReadStatement2> getStatements(
			@Parameter(name = "An Authorisation Token as per https://tools.ietf.org/html/rfc6750", required = true)
			@RequestHeader(value = "Authorization", required = true)
			String authorization, @Parameter(
					name = "The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC")
			@RequestHeader(value = "x-fapi-auth-date", required = false)
			String xFapiAuthDate, @Parameter(name = "The PSU's IP address if the PSU is currently logged in with the TPP.")
			@RequestHeader(value = "x-fapi-customer-ip-address", required = false)
			String xFapiCustomerIpAddress, @Parameter(name = "An RFC4122 UID used as a correlation id.")
			@RequestHeader(value = "x-fapi-interaction-id", required = false)
			String xFapiInteractionId, @Parameter(name = "Indicates the user-agent that the PSU is using.")
			@RequestHeader(value = "x-customer-user-agent", required = false)
			String xCustomerUserAgent, @Parameter(
					name = "The UTC ISO 8601 Date Time to filter statements FROM NB Time component is optional - set to 00:00:00 for just Date. If the Date Time contains a timezone, the ASPSP must ignore the timezone component.")
			@RequestParam(value = "fromStatementDateTime", required = false)
			Date fromStatementDateTime, @Parameter(
					name = "The UTC ISO 8601 Date Time to filter statements TO NB Time component is optional - set to 00:00:00 for just Date. If the Date Time contains a timezone, the ASPSP must ignore the timezone component.")
			@RequestParam(value = "toStatementDateTime", required = false)
			Date toStatementDateTime) {
		return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
	}

}
