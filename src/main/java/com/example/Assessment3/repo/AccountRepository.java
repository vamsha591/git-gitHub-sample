package com.example.Assessment3.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Assessment3.entity.Account;


public interface AccountRepository extends JpaRepository<Account, Integer> {
	Account findByAccountnumber(long accountnumber);

}
