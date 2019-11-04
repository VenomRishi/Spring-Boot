package com.bridgelabz.springredisexample;

import java.util.Map;


public interface IUserRepository {
	void save(User user);

	Map<String, User> findAll();

	User findById(String id);

	void update(User user);

	void delete(String id);
}
