package com.tyss.services;

import com.tyss.dto.Admin;

public interface AdminService {
	public boolean register(Admin admin);
	public boolean login(String email,String password);
	public Admin login() ;
	public boolean changePassword(String email,String password);
}
