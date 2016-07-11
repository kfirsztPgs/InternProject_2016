package com.pgs.soft.repository;

import org.springframework.data.repository.CrudRepository;

import com.pgs.soft.domain.User;

public interface UserRepository extends CrudRepository<User, Integer>{

}
