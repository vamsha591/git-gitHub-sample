package com.example.Assessment3.service;

import com.example.Assessment3.dto.ResponseDto;
import com.example.Assessment3.dto.TransactionRequestDto;

public interface TransactionService {
	
	ResponseDto transfer(TransactionRequestDto transactionDto);

}
