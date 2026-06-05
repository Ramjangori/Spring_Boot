package com.bank.service;

import java.util.List;

import com.bank.dto.TransferRequest;
import com.bank.entity.Account;
import com.bank.entity.Transaction;

public interface AccountService {
   
	 public Account createAccount(Account account);
	 
	 public Account getAccountDetails(String accountNumber);
	 
	 String transferMoney(TransferRequest request);
	 
	 List<Transaction> getTransactionHistory(String accountNumber);
}
