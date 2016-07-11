package com.pgs.soft.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pgs.soft.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {
	public Optional<User> findOneByEmail(String email);

}
