package com.admin.service.impl;


import com.admin.service.AdminService;
import com.admin.entity.Admin;
import com.admin.repository.AdminRepository;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AdminServiceImpl implements AdminService{

	private AdminRepository AdminRepository;
	
	public AdminServiceImpl(AdminRepository AdminRepository) {
		super();
		this.AdminRepository = AdminRepository;
		
	}

	@Override
	public List<Admin> getAllStudents()
	{
		return AdminRepository.findAll();
	}
	@Override
	public Admin saveAdmin(Admin admin) {
		return AdminRepository.save(admin);
	}

	@Override
	public Admin getAdminById(Long id) {
		
		return AdminRepository.findById(id).get();
	}

	@Override
	public Admin updateAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return AdminRepository.save(admin);
	}

	@Override
	public void deleteAdminById(Long id) {
		 AdminRepository.deleteById(id);
		// TODO Auto-generated method stub
		
	}
}
