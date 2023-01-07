package com.admin.service;

import java.util.List;
import com.admin.entity.Admin;
public interface AdminService {

	List<Admin> getAllStudents();
	
	Admin saveAdmin(Admin admin);
	
	Admin getAdminById(Long id);
	
	Admin updateAdmin(Admin admin);
	
	void deleteAdminById(Long id);
}
