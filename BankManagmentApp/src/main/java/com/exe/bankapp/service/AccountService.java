package com.exe.bankapp.service;

import java.util.List;

import com.exe.bankapp.entity.Account;

public interface AccountService {
	public Account createAccount(Account account);
	public Account getAccountDetailsByAccountNumber(Long accountNumber);
	public List<Account> getAllAccountDetails();
	public Account depositAmount(Long accountNumber,Double amount);
	public Account withdrwaAmount(Long accountNumber,Double amount);
	public void closeAccount(Long accountNumber);
	
}