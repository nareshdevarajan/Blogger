package com.spring.reporitory;

import org.springframework.data.jpa.repository.JpaRepository;


import com.spring.entity.User;

public interface UserReporitory extends JpaRepository<User, Integer> {

}
