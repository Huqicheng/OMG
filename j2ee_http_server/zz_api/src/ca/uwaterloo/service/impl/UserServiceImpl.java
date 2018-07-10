package ca.uwaterloo.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ca.uwaterloo.dao.UserDao;
import ca.uwaterloo.entity.User;
import ca.uwaterloo.service.UserService;
@Service
@Transactional
public class UserServiceImpl implements UserService{
	@Resource
	UserDao userDao = null;
	
	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public User login(User user) {
		return userDao.login(user);
	}
	
}
