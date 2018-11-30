package com.commune.communepro.scrumrole.repository;

import org.springframework.data.repository.CrudRepository;

import com.commune.communepro.scrumrole.domain.ScrumRole;

public interface ScrumRoleRespository extends CrudRepository<ScrumRole, Long> {

	ScrumRole findByRole(String role);
	
}
