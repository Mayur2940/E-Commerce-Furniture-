package com.entity;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class CustomerEntity extends UserEntity {
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "customer")
	protected Cart cart;

	
	

}
