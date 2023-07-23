package com.infy.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infy.binding.LoginForm;
import com.infy.entity.UserMaster;


public interface UserRepository extends JpaRepository<UserMaster, Serializable> {

	public UserMaster findByEmail(String email);
	
	public UserMaster findByEmailAndUserPwd(String email,String pwd);

}
