package com.bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bank.dto.TransferRequest;
import com.bank.entity.Account;
import com.bank.entity.Transaction;
import com.bank.service.AccountService;
import com.bank.service.AccountServiceImpl;

@RestController
@RequestMapping("/accounts")
public class AccountController {

	
	@Autowired
	private AccountService accountService;

	AccountController(AccountServiceImpl accountServiceImpl) {
		this.accountService = accountServiceImpl;
	}

	@PostMapping("/create")
	public Account createAccount(@RequestBody Account ac) {

		return accountService.createAccount(ac);
	}

	@GetMapping("/{accountNumber}")
	public Account getAccountDetails(@PathVariable String accountNumber) {

		return accountService.getAccountDetails(accountNumber);

	}

	@PostMapping("/login")
	public Account getAccountDetails(
	        @RequestParam String accountNumber,
	        @RequestParam String password) {

	    Account account =
	            accountService.getAccountDetails(accountNumber);

	    if(account.getPassword().equals(password)) {

	        return account;

	    } else {

	        throw new RuntimeException(
	                "Invalid Password");

	    }
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
