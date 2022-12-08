
package com.moviereview.capstone.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.moviereview.capstone.entity.User;
import com.moviereview.capstone.repository.UserRepository;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping(value="/api/v1")
public class UserController { 
	

	Logger log= LoggerFactory.getLogger(UserController.class);

	@Autowired
	private UserRepository userRepo;
	
	@PostMapping(value="/addUser")
	public void addUser(@RequestBody User v) {
		log.info("Inside Method addUser");
		userRepo.save(v);
		log.info("Exiting Method addUser");
}
	@GetMapping(value="/listUsers")
	public List<User> listUsers() {
		log.info("Inside Method listUser");
		List<User> userList=userRepo.findAll();
		log.info("Exiting Method listUser");
		return userList;
}
	@DeleteMapping(value="/deleteUser/{id}")
	public void deleteMovieById(@PathVariable("id")@RequestBody String id) {
		userRepo.deleteById(Long.valueOf(id));
}
}