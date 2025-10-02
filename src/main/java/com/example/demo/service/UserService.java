package com.example.demo.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IUsersDao;
import com.example.demo.entity.Users;

@Service
public class UserService implements IUserService {
	
	@Autowired
	IUsersDao usersDao;
	
	@Override
	public List<Users> getUsers() {
		return usersDao.findAll();
	}

}
