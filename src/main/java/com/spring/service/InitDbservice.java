package com.spring.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.entity.Blog;
import com.spring.entity.Item;
import com.spring.entity.Role;
import com.spring.entity.User;
import com.spring.reporitory.BlogReporitory;
import com.spring.reporitory.ItemReporitory;
import com.spring.reporitory.RoleReporitory;
import com.spring.reporitory.UserReporitory;


@Transactional
@Service
public class InitDbservice {

	@Autowired
	private UserReporitory userReporitory;
	
	@Autowired
	private BlogReporitory blogReporitory;
	
	@Autowired
	private ItemReporitory itemReporitory;
	
	@Autowired
	private RoleReporitory roleReporitory;
	
	@PostConstruct
	public void init(){
		
		Role roleUser = new Role();
		roleUser.setName("ROLE_USER");
		roleReporitory.save(roleUser);
		
		Role roleAdmin = new Role();
		roleAdmin.setName("ROLE_Admin");
		roleReporitory.save(roleAdmin);
		
		User userAdmin = new User();
		userAdmin.setName("admin");
		List<Role> roles = new ArrayList<Role>();
		roles.add(roleUser);
		roles.add(roleAdmin);
		userAdmin.setRoles(roles);
		userReporitory.save(userAdmin);
		
		Blog blogJavavids = new Blog();
		blogJavavids.setName("JavaVids");
		blogJavavids.setUrl("http://feeds.feedBurner.com/javavids?format=xml");
		blogJavavids.setUser(userAdmin);
		blogReporitory.save(blogJavavids);
		
		
		Item item1 = new Item();
		item1.setBlog(blogJavavids);
		item1.setLink("http://www.javavids.com");
		item1.setTitle("First");
		item1.setPublishedDate(new Date());
		itemReporitory.save(item1);
		
		
		Item item2 = new Item();
		item2.setBlog(blogJavavids);
		item2.setLink("http://www.javavids.com");
		item2.setTitle("Second");
		item2.setPublishedDate(new Date());
		itemReporitory.save(item2);
		
		
	}
	
	
	
}
