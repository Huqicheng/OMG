package ca.uwaterloo.mapper;

import java.util.List;

import org.springframework.stereotype.Component;

import ca.uwaterloo.entity.User;


public interface UserMapper extends SqlMapper {
	
	public User login(User user);
	
}
