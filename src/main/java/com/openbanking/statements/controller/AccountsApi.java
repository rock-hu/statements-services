package com.openbanking.statements.controller;

import com.openbanking.statements.model.OBReadStatement2;
import com.openbanking.statements.model.OBReadTransaction6;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import java.io.File;
import java.util.Date;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Tag(name = "accounts", description = "accounts")
@RequestMapping(value = "")
public interface AccountsApi {

	@Operation(summary = "Get Statements", operationId = "getAccountsAccountIdStatements", description = "", tags = { "Statements", })

	@RequestMapping(
			value = "/accounts/{AccountId}/statements",
			produces = { "application/json; charset=utf-8", "application/json", "application/jose+jwe" },
			method = RequestMethod.GET)
	default ResponseEntity<OBReadStatement2> getAccountsAccountIdStatements(@Parameter(name = "AccountId", required = true)
	@PathVariable("AccountId")
	String accountId, @Parameter(name = "An Authorisation Token as per https://tools.ietf.org/html/rfc6750", required = true)
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

	@Operation(summary = "Get Statements", operationId = "getAccountsAccountIdStatementsStatementId", description = "", tags = { "Statements", })

	@RequestMapping(
			value = "/accounts/{AccountId}/statements/{StatementId}",
			produces = { "application/json; charset=utf-8", "application/json", "application/jose+jwe" },
			method = RequestMethod.GET)
	default ResponseEntity<OBReadStatement2> getAccountsAccountIdStatementsStatementId(@Parameter(name = "StatementId", required = true)
	@PathVariable("StatementId")
	String statementId, @Parameter(name = "AccountId", required = true)
	@PathVariable("AccountId")
	String accountId, @Parameter(name = "An Authorisation Token as per https://tools.ietf.org/html/rfc6750", required = true)
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
	String xCustomerUserAgent) {
		return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
	}

	@Operation(summary = "Get Statements", operationId = "getAccountsAccountIdStatementsStatementIdFile", description = "", tags = { "Statements", })

	@RequestMapping(
			value = "/accounts/{AccountId}/statements/{StatementId}/file",
			produces = { "application/json; charset=utf-8", "application/json", "application/jose+jwe" },
			method = RequestMethod.GET)
	default ResponseEntity<File> getAccountsAccountIdStatementsStatementIdFile(@Parameter(name = "StatementId", required = true)
	@PathVariable("StatementId")
	String statementId, @Parameter(name = "AccountId", required = true)
	@PathVariable("AccountId")
	String accountId, @Parameter(name = "An Authorisation Token as per https://tools.ietf.org/html/rfc6750", required = true)
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
	String xCustomerUserAgent) {
		return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
	}

	@Operation(
			summary = "Get Transactions",
			operationId = "getAccountsAccountIdStatementsStatementIdTransactions",
			description = "",
			tags = { "Transactions", })

	@RequestMapping(
			value = "/accounts/{AccountId}/statements/{StatementId}/transactions",
			produces = { "application/json; charset=utf-8", "application/json", "application/jose+jwe" },
			method = RequestMethod.GET)
	default ResponseEntity<OBReadTransaction6> getAccountsAccountIdStatementsStatementIdTransactions(@Parameter(name = "StatementId", required = true)
	@PathVariable("StatementId")
	String statementId, @Parameter(name = "AccountId", required = true)
	@PathVariable("AccountId")
	String accountId, @Parameter(name = "An Authorisation Token as per https://tools.ietf.org/html/rfc6750", required = true)
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
	String xCustomerUserAgent) {
		return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
	}

}
