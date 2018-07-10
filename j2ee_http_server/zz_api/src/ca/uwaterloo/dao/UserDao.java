package ca.uwaterloo.dao;

import ca.uwaterloo.entity.User;

public interface UserDao {
	User login(User user);
}