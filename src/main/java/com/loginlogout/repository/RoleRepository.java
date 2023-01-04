package com.loginlogout.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.loginlogout.entity.Role;

public interface RoleRepository extends JpaRepository<Role,Long> {
	Role findByName(String name);
}
