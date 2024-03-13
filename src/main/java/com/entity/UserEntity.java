package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
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
@Table(name = "userstable")
@Inheritance
public class UserEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected int id;
	@Column
	protected String username;
	@Column
	protected String password;
	@Column
	protected String email;
	@Column
	protected long number;
	@Column
	protected String address;

	

	

}
