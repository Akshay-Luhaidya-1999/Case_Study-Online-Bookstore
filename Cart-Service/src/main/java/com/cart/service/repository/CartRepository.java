package com.cart.service.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cart.service.model.Cart;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long> {
	 Optional<Cart> findByUserId(Long userId);
}
