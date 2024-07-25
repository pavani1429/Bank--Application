package com.exe.bankapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exe.bankapp.entity.Account;

public interface AccountRepository extends JpaRepository<Account,Long>{

	Account save(Account account);
}

	