package com.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "payments")
public class Payment {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int paymentId;
	    private double amount;
	    private LocalDateTime paymentDate;
	    private String status;

	    @OneToOne
	    @JoinColumn(name = "order_id")
	    private Orders order;
	    
}

