package com.commune.communepro.user.domain;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.commune.communepro.role.domain.Role;
import com.commune.communepro.scrumrole.domain.ScrumRole;

@Entity
@Table(name = "user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "sso_id")
	private String ssoId;

	@Column(name = "email")
	private String email;

	@Column(name = "firstname")
	private String firstName; 

	@Column(name = "lastname")
	private String lastName;

	@Column(name = "password")
	private String password;

	@Column(name = "active")
	private int active;

	

	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="user_role", joinColumns=@JoinColumn(name="user_id"), inverseJoinColumns=@JoinColumn(name="role_id"))
	private Set<Role> roles;

	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="user_scrumrole", joinColumns=@JoinColumn(name="user_id"), inverseJoinColumns=@JoinColumn(name="role_id"))
	private Set<ScrumRole> scrumRole;
	
	public User() {

	}

	public User(Long id, String ssoId, String email, String firstName, String lastName, String password, int active,
			Set<Role> roles,Set<ScrumRole> scrumRole) {
		super();
		this.id = id;
		this.ssoId = ssoId;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.active = active;
		this.roles = roles;
		this.scrumRole=scrumRole;
	}




	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSsoId() {
		return ssoId;
	}

	public void setSsoId(String ssoId) {
		this.ssoId = ssoId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	public Set<ScrumRole> getScrumRole() {
		return scrumRole;
	}

	public void setScrumRole(Set<ScrumRole> scrumRole) {
		this.scrumRole = scrumRole;
	}

}
