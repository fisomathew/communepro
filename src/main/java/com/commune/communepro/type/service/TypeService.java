package com.commune.communepro.type.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.commune.communepro.type.domain.Type;
import com.commune.communepro.type.repository.TypeRepository;

@Service
public class TypeService {
	@Autowired
	private TypeRepository typeRepository;


	public List<Type> getAllTypes(){

		List<Type> types=new ArrayList<>();
		typeRepository.findAll().forEach(types::add);
		return types;

	}
	public void addType(Type types) {

		typeRepository.save(types);

	}
	public Type getType(Long id) {

		return typeRepository.findById(id).get();

	}

	public void updateType(Type type) {
		typeRepository.save(type);

	}

	public void deleteType(Long id) {
		typeRepository.deleteById(id);

	}
}
