package com.example.demo;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
public class passwordGenerator {
	public static void main(String[] args) {
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String plainPassword = "nam2020";
		String encodedPassword = passwordEncoder.encode(plainPassword);
		
		System.out.println(encodedPassword);
	}

}
