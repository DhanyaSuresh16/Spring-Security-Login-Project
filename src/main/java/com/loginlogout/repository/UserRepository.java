package com.loginlogout.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.loginlogout.entity.User;


public interface UserRepository extends JpaRepository<User,Long> {

	User findByEmail(String email);
}
