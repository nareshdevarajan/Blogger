package com.spring.reporitory;

import org.springframework.data.jpa.repository.JpaRepository;


import com.spring.entity.Role;

public interface RoleReporitory extends JpaRepository<Role, Integer> {

}
