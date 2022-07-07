package com.example.demo;
	
	import java.util.ArrayList;
	import java.util.List;

import org.apache.catalina.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

	@RestController
	public class UserController {
@Autowired
UserService uss;
	    @GetMapping("/users")
	    public ResponseEntity < List < UserEntity >> users() {
	        List < UserEntity > users = new ArrayList < > ();
//	        users.add(new UserEntity(1,"Prakash"));
//	        users.add(new UserEntity(2,"Arun"));
//	        users.add(new UserEntity(3,"kalai"));
	        HttpHeaders headers = new HttpHeaders();
	        headers.add("Responded", "UserController");
	        return ResponseEntity.accepted().headers(headers).body(users);
	    }
	    @PostMapping (value = "/create")
	    public String add(@RequestBody List<UserEntity> ad) {
	    	return uss.add(ad);
	    }
	    @GetMapping (value = "/read") 
	    	public ResponseEntity<List<UserEntity>> getread() throws UserNotFoundException {
	        List<UserEntity> us = uss.getread();
	        if(us == null) {
	        	return new ResponseEntity<>(us, HttpStatus.OK);
	        }
	        else {
	        	throw new UserNotFoundException("Ok");
	        }
	        
	        }
	    @DeleteMapping (value = "/delete")
        public String deleteData() {
        	return uss.deleteData();
	  }
}
	