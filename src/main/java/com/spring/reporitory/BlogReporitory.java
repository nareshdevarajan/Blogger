package com.spring.reporitory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.entity.Blog;


public interface BlogReporitory extends JpaRepository<Blog, Integer> {

}
