package com.admin;

import org.springframework.boot.CommandLineRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.admin.repository.AdminRepository;
import com.admin.entity.Admin;

@SpringBootApplication
public class AdminApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(AdminApplication.class, args);
	}
	
	@Autowired
	private AdminRepository AdminRepository;
	
	@Override
	public void run(String... args) throws Exception{
//		Admin student1 = new Admin("Navneet", "kvnavneet09@gmail.com", "jee mains app", "20-10-2022", "01-01-2023", "completed");
//		AdminRepository.save(student1);
//		
//		Admin student2 = new Admin("navjkn","kumar","kvnavneet09@gmail.com");
//		AdminRepository.save(student2);
	}

}
