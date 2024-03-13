package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.CartItem;

public interface CartItemRepository extends JpaRepository<CartItem, Integer> {
}
