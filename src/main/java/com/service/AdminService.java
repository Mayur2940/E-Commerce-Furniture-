package com.service;


import java.util.List;

import com.dto.UserDTO;
import com.entity.AdminEntity;

public interface AdminService {
	
	public UserDTO addAdmin(AdminEntity admin);
	public String updateAdmin(int id,UserDTO adminDTO);
	public UserDTO getAdminByEmail(String email) ;
	public String deleteAdmin(int id);
	public List<UserDTO> readAllAdmins();
	

}
