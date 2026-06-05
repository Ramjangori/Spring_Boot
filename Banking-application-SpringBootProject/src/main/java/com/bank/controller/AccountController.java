package com.bank.controller;

import com.bank.service.AccountServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.dto.TransferRequest;
import com.bank.entity.Account;
import com.bank.entity.Transaction;
import com.bank.service.AccountService;

@RestController
@RequestMapping("/accounts")
public class AccountController {

	private final AccountServiceImpl accountServiceImpl;
	@Autowired
	private AccountService accountService;

	AccountController(AccountServiceImpl accountServiceImpl) {
		this.accountServiceImpl = accountServiceImpl;
	}

	@PostMapping("/create")
	public Account createAccount(@RequestBody Account ac) {

		return accountService.createAccount(ac);
	}

	@GetMapping("/{accountNumber}")
	public Account getAccountDetails(@PathVariable String accountNumber) {

		return accountService.getAccountDetails(accountNumber);

	}

	@PostMapping("/transfer")
	public String transferMoney(@RequestBody TransferRequest request) {

		 System.out.println(request);
		return accountService.transferMoney(request);
	}
	
	@GetMapping("/{accountNumber}/transactions")
	public List<Transaction> getTransactionHistory(
	        @PathVariable String accountNumber) {

	    return accountService.getTransactionHistory(accountNumber);
	}
}
