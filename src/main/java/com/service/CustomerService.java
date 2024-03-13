package com.service;

import java.util.List;

import com.dto.CartDTO;
import com.dto.UserDTO;
import com.entity.CustomerEntity;

public interface CustomerService {

	public CustomerEntity registerCustomer(UserDTO userDTO);

	public String updateCustomer(int id, UserDTO customerDTO);

	public boolean deleteCustomer(int id);

	public List<UserDTO> getByEmail(String email);

	public CartDTO getCartByCustomer(int customerId);

}
