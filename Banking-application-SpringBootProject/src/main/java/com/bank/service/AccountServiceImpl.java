package com.bank.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.dto.TransferRequest;
import com.bank.entity.Account;
import com.bank.entity.Transaction;
import com.bank.exception.AccountNotFoundException;
import com.bank.exception.InsufficientBalanaceException;
import com.bank.exception.InvalidAccountNumberException;
import com.bank.exception.TransactionNotFoundException;
import com.bank.repository.AccountRepository;
import com.bank.repository.TransactionRepository;

import jakarta.transaction.Transactional;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountRepository accountRepo;
	
	@Autowired
	private TransactionRepository transactionRepo;


	@Override
	public Account getAccountDetails(String accountNumber) {

	    Optional<Account> ac = accountRepo.findByAccountNumber(accountNumber);

	    if(ac.isPresent()) {
	        return ac.get();
	    }
	    else {
	    	  throw new AccountNotFoundException("Account Not Found");
	    }
	}
    
	@Override
	public Account createAccount(Account account) {

	    account.setCreatedAt(LocalDateTime.now());

	    Account ac = accountRepo.save(account);

	    ac.setAccountNumber("ACC" + (1000 + ac.getId()));

	    return accountRepo.save(ac);
	}

	@Override
	@Transactional
	public String transferMoney(TransferRequest request) {
		
		 
		  Optional<Account> sender = accountRepo.findByAccountNumber(request.getFromAccount());
		  Optional<Account> reciever = accountRepo.findByAccountNumber(request.getToAccount());
		  Double amount = request.getAmount();
		  if(sender.isPresent() && reciever.isPresent()) {
			  Account sac = sender.get();
			  Account rac = reciever.get();
			  if(sac.getBalance()>=amount) {
				  sac.setBalance(sac.getBalance()-amount);
				  rac.setBalance(rac.getBalance()+amount);  
				  accountRepo.save(sac);
				  accountRepo.save(rac);
				  
				  Transaction t = new Transaction();
				  t.setAmount(request.getAmount());
				  t.setFromAccount(sender.get());
				  t.setToAccount(reciever.get());
				  t.setTransactionDate(LocalDateTime.now());
				  t.setStatus("Sucess");
				  
				  transactionRepo.save(t);
			  }
			  else {
				  throw new InsufficientBalanaceException("Insufficient Balance in Your Account");
			  }
		  }
		  else {
			  throw new InvalidAccountNumberException("invalid Account Number Check Reciever Or Sender Account Number");
		  }
		return "Money Transfer Successfully";
	}

	@Override
	public List<Transaction> getTransactionHistory(String accountNumber) {

	    Account account = accountRepo
	            .findByAccountNumber(accountNumber)
	            .orElseThrow(() ->
	                    new AccountNotFoundException("Account Not Found"));

	    List<Transaction> transactions =
	            transactionRepo.findByFromAccountOrToAccount(
	                    account,
	                    account);

	    if (transactions.isEmpty()) {
	        throw new TransactionNotFoundException(
	                "No Transaction Found For Account : " + accountNumber);
	    }

	    return transactions;
	}

}
