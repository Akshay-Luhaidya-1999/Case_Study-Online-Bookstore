package com.user.service.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.service.model.User;

/**
 * This interface extends JpaRepository and provides additional methods
 * for interacting with User entities.
 */
public interface UserRepository extends JpaRepository<User, Long> {

}