package com.saurabh.employees.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saurabh.employees.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

}
