package com.example.Assessment3.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Assessment3.dto.ResponseDto;
import com.example.Assessment3.entity.Account;
import com.example.Assessment3.repo.AccountRepository;
import com.example.Assessment3.service.CustomerService;


@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	AccountRepository accountRepository;
	
	@Override
	public ResponseDto createAccount(Account account) {
		// TODO Auto-generated method stub
		accountRepository.save(account);
		ResponseDto responseDto=new ResponseDto("Account Successfully Created");
		return responseDto;
	}

}
