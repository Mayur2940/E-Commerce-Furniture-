package com.dto;

import java.time.LocalDateTime;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaymentDTO {
	 private int paymentId;
	    private double amount;
	    private LocalDateTime paymentDate;
	    private String status;
	    private int orderId;
	 
}
