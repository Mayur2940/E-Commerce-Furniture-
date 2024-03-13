package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dto.UserDTO;
import com.entity.AdminEntity;
import com.serviceimpl.AdminServiceImpl;

@RestController
@RequestMapping("/admin")
@CrossOrigin(origins = "http://localhost:3000/")
public class AdminController {

	@Autowired
	AdminServiceImpl adminServiceImpl;

	@PostMapping("/registerAdmin")
	public UserDTO addAdmin(@RequestBody AdminEntity admin) {
		return adminServiceImpl.addAdmin(admin);
	}

	@PutMapping("/updateAdmin/{id}")
	public String updateAdmin(@PathVariable(value = "id") int id, @RequestBody UserDTO admin) {

		return adminServiceImpl.updateAdmin(id, admin);
	}

	@GetMapping("/adminByEmail/{email}")
	public UserDTO getAdminByEmail(@PathVariable(value = "email") String email) {
		return adminServiceImpl.getAdminByEmail(email);
	}
	@GetMapping("/allAdmins")
	public List<UserDTO> getAllAdmins() {
		return adminServiceImpl.readAllAdmins();
	}
	@DeleteMapping("/deleteadmin/{id}")
	public String deleteAdmin(@PathVariable("id") int id) {
		return adminServiceImpl.deleteAdmin(id);
	}

}
