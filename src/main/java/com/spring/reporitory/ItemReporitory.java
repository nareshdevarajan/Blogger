package com.spring.reporitory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.entity.Item;

public interface ItemReporitory extends JpaRepository<Item, Integer> {

}
