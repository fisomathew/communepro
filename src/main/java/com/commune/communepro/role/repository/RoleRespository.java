package com.commune.communepro.role.repository;



import org.springframework.data.repository.CrudRepository;

import com.commune.communepro.role.domain.Role;

public interface RoleRespository extends CrudRepository<Role, Long> {

	 Role findByRole(String role);
	
}
