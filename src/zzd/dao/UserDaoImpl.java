package zzd.dao;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import zzd.entity.User;

@Repository(value="userDaoImpl")
public class UserDaoImpl implements UserDao {
	@Resource(name="hibernateTemplate")
	private HibernateTemplate hibernateTemplate;
	
	public void add() {
//		System.out.println("dao add....");
//		User user = new User();
//		user.setPassword("lkek");
//		user.setUsername("李长华");
//		hibernateTemplate.save(user);
		
		List<User> list = (List<User>) hibernateTemplate.find("from User");
		for (User user : list) {
			System.out.println(user);
		}
	}
	
}
