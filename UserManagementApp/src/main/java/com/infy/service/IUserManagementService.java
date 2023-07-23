package com.infy.service;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.infy.binding.LoginForm;
import com.infy.binding.UnlockForm;
import com.infy.binding.UserForm;

public interface IUserManagementService {

	public String emailCheck(String email);

	public Map<Integer, String> loadCountys();

	// public Map<Integer, String> loadStates(Integer countryId);

	// public Map<Integer, String> loadCitys(Integer StateId);

	public String registerUser(UserForm form);

	public String Login(LoginForm form);

	public String unLockAccount(UnlockForm form);

}
