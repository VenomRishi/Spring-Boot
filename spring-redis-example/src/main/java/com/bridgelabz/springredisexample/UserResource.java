package com.bridgelabz.springredisexample;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserResource {

	@Autowired
	private IUserRepository userRepository;

	public UserResource(IUserRepository userRepository) {

		this.userRepository = userRepository;
	}

	@PostMapping("/add")
	public User add(@RequestBody User user) {
		userRepository.save(new User(user.getId(), user.getName(), 20000L));
		return userRepository.findById(user.getId());
	}

	@PutMapping("/update")
	public User update(@RequestBody User user) {
		userRepository.update(new User(user.getId(), user.getName(), 1000L));
		return userRepository.findById(user.getId());
	}

	@GetMapping("/getAll")
	public Map<String, User> getAll() {
		return userRepository.findAll();
	}

	@DeleteMapping("/delete")
	public Map<String, User> delete(@RequestParam String id) {
		userRepository.delete(id);
		return getAll();
	}

}
