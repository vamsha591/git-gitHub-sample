package com.example.Assessment3.dto;

import java.time.LocalDate;

import javax.validation.constraints.Min;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TransactionRequestDto {
	
	
	private long fromaccount;
	
	
	private long toaccount;
	
	@Min(value = 1,message = "minimum transaction is 1")
	private double amount;

   private LocalDate date;
}
