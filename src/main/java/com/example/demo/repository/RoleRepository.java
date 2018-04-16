package com.example.demo.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.example.demo.model.Role;

public interface RoleRepository extends MongoRepository<Role, ObjectId>{

	@Query(value = "{'role_name' : ?0 }")
	Role getRole(String role_name);
}
