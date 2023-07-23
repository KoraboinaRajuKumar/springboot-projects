package com.infy.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infy.binding.LoginForm;
import com.infy.binding.UnlockForm;
import com.infy.binding.UserForm;
import com.infy.service.UserManagementServiceImpl;

@RestController
@RequestMapping("/api")
public class UserManagementController {

	@Autowired
	private UserManagementServiceImpl service;

	@PostMapping("/saveuser")
	public ResponseEntity<String> saveuser(@RequestBody UserForm form) {
		String registerUser = service.registerUser(form);
		return new ResponseEntity<String>(registerUser, HttpStatus.CREATED);

	}

	@GetMapping("/emailcheck/{email}")
	public ResponseEntity<String> emailCheck(@PathVariable String email) {
		String emailCheck = service.emailCheck(email);
		return new ResponseEntity<String>(emailCheck, HttpStatus.OK);
	}

	@PostMapping("/login")
	public ResponseEntity<String> login(@RequestBody LoginForm form) {
		String login = service.Login(form);
		return new ResponseEntity<String>(login, HttpStatus.OK);

	}

	@PostMapping("/un-lockaccount")
	public ResponseEntity<String> unlockAccount(@RequestBody UnlockForm form) {
		String login = service.unLockAccount(form);
		return new ResponseEntity<String>(login, HttpStatus.OK);

	}

	@GetMapping("/loadcountry")
	public Map<Integer, String> LoadCountrys() {
		return service.loadCountys();
	}

}
