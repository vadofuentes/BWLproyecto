package com.bwl.clima.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bwl.clima.model.User;

public interface UserRepository extends JpaRepository<User, Long>  {

}
