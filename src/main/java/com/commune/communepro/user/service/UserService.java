package com.commune.communepro.user.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.commune.communepro.role.domain.Role;
import com.commune.communepro.role.repository.RoleRespository;
import com.commune.communepro.user.domain.User;
import com.commune.communepro.user.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private RoleRespository roleRespository;
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	public List<User> getAllUsers(){

		List<User> users=new ArrayList<>();
		userRepository.findAll().forEach(users::add);
		return users;

	}
	public void addUser(User user) {
		 user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		 user.setActive(1);
		 user.setSsoId(user.getFirstName()+"mj");
		 Role userRole = roleRespository.findByRole("ADMIN");
		 user.setRoles(new HashSet<Role>(Arrays.asList(userRole)));
		userRepository.save(user);

	}
	public User getUser(Long id) {
		
		return userRepository.findById(id).get();

	}
	public User findUserByEmail(String email) {
		return userRepository.findByEmail(email);
		
	}
	public void updateUser(User user) {
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		userRepository.save(user);

	}
	public void deleteUser(Long id) {
		userRepository.deleteById(id);

	}
}
