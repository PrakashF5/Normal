package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
@Autowired
UserDao ud;

public String add(List<UserEntity> ad) {
	return ud.add(ad);
}

public List<UserEntity> getread() {
	List<UserEntity> us = ud.getread();
	return us;
}
public String deleteData() {
	return ud.deleteData();
}
}
