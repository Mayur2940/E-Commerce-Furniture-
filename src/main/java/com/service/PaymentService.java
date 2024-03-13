package com.service;

import com.dto.PaymentDTO;

public interface PaymentService {
	 PaymentDTO makePayment(PaymentDTO paymentDTO);
	 PaymentDTO getPaymentById(int paymentId);
 
}