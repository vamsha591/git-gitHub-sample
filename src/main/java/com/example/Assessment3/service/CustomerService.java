package com.example.Assessment3.service;

import org.springframework.stereotype.Service;

import com.example.Assessment3.dto.ResponseDto;
import com.example.Assessment3.entity.Account;

@Service
public interface CustomerService {
	ResponseDto createAccount(Account account);
}
