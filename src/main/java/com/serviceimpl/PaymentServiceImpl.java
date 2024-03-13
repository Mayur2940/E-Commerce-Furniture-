package com.serviceimpl;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dto.PaymentDTO;
import com.entity.Orders;
import com.entity.Payment;
import com.repository.OrdersRepository;
import com.repository.PaymentRepository;
import com.service.PaymentService;

@Service
public class PaymentServiceImpl implements PaymentService {
	
	 private final PaymentRepository paymentRepository;
	 private final OrdersRepository ordersRepository;
	
	 @Autowired
	 public PaymentServiceImpl(PaymentRepository paymentRepository, OrdersRepository ordersRepository) {
	     this.paymentRepository = paymentRepository;
	     this.ordersRepository = ordersRepository;
	 }
 
	   @Override
	   public PaymentDTO makePayment(PaymentDTO paymentDTO) {
		
		    Payment payment = new Payment();
	        payment.setAmount(paymentDTO.getAmount());
	        payment.setPaymentDate(LocalDateTime.now());
	        payment.setStatus("Pending"); // Initial status
	        // Assuming orderId is provided in the DTO
	        Orders order = ordersRepository.findById(paymentDTO.getOrderId()).orElse(null);
	        payment.setOrder(order);
 
	        Payment savedPayment = paymentRepository.save(payment);
 
	        paymentDTO.setPaymentId(savedPayment.getPaymentId());
	        paymentDTO.setPaymentDate(savedPayment.getPaymentDate());
	        paymentDTO.setStatus(savedPayment.getStatus());
 
	        return paymentDTO;
	}
 
	@Override
	public PaymentDTO getPaymentById(int paymentId) {
		// TODO Auto-generated method stub
		return null;
	}
	
 
}