package zzd.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import zzd.dao.UserDao;

@Transactional
@Service(value="userService")
public class UserService {
	@Resource(name="userDaoImpl")
	private UserDao userDao;
	
	public void add(){
		System.out.println("service add");
		userDao.add();
	}
}
