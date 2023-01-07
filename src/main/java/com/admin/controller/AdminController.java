package com.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import com.admin.entity.Admin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.admin.service.AdminService;
@Controller
public class AdminController {

	private AdminService AdminService;

	public AdminController(AdminService AdminService) {
		super();
		this.AdminService = AdminService;
		
		
		
	}
	@GetMapping("/admin")
	public String listStudents(Model model) {
		model.addAttribute("admin",AdminService.getAllStudents());
		return "admin";
		
	}
	
	@GetMapping("/admin/new")
	public String createStudentForm(Model model) {
		Admin admin = new Admin();
		model.addAttribute("admin",admin);
		return "create_admin";
		
		
		
	}
	
	@PostMapping("/admin")
	public String saveStudent(@ModelAttribute("admin") Admin admin) {
		AdminService.saveAdmin(admin);
		return "redirect:/admin";
	}
	@GetMapping("/admin/edit/{id}")
	public String editAdminForm(@PathVariable Long id,Model model)
	{
		model.addAttribute("admin",AdminService.getAdminById(id));
		return "edit_admin";
	}
	@PostMapping("/admin/{id}")
	public String updateAdmin(@PathVariable Long id, @ModelAttribute("admin") Admin admin, Model model) {
		Admin existingAdmin = AdminService.getAdminById(id);
		existingAdmin.setId(id);
		existingAdmin.setName(admin.getName());
		existingAdmin.setEmail(admin.getEmail());
		existingAdmin.setProject_name(admin.getProject_name());
		existingAdmin.setStart_date(admin.getStart_date());
		existingAdmin.setEnd_date(admin.getEnd_date());
		
		AdminService.updateAdmin(existingAdmin);
		
		return "redirect:/admin";
		
	}
	
	@GetMapping("/admin/{id}")
	public String deleteAdmin(@PathVariable Long id)
	{
		AdminService.deleteAdminById(id);
		return "redirect:/admin";
	}
	
	
	
	
}
