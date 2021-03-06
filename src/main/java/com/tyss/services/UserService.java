package com.tyss.services;

import java.util.List;


import com.tyss.dto.User;

public interface UserService {
	public boolean userRegister(User user);

	public User userLogin(String uEmail, String uPassword);

	public boolean userUpdate(User user);

	public boolean userDelete(int uId);

	public List<User> userGet();
	
	public boolean changePassword(String uEmail, String uPassword);
}
