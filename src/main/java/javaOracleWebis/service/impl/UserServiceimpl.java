package javaOracleWebis.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javaOracleWebis.entity.User;
import javaOracleWebis.mapper.UserMapper;
import javaOracleWebis.service.UserService;

@Service
public class UserServiceimpl implements UserService {
	@Autowired
	private UserMapper mapper;
	
	@Override
	public List<User> getAllUser(){
		return mapper.getAllUser();
	}
}
