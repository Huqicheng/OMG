package ca.uwaterloo.dao.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;



import ca.uwaterloo.dao.UserDao;
import ca.uwaterloo.entity.User;
import ca.uwaterloo.mapper.UserMapper;

@Repository
@Transactional(rollbackFor=Exception.class)
public class UserDaoImpl implements UserDao{

	@Resource(name="userMapper")
	private UserMapper userMapper;
	@Override
	public User login(User user) {
		return userMapper.login(user);
	}

}
