package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
@Autowired
UserRepo ur;

public String add(List<UserEntity> ad) {
	for(UserEntity e : ad) {
		ur.save(e);
	}
	return "Saved successfully";
}
public List<UserEntity> getread() {
	List<UserEntity> us = ur.findAll();
	return us;
}
public String deleteData() {
	ur.deleteAll();
	return "All datas deleted";
}
}

