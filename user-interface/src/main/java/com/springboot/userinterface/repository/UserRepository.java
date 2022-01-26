package com.springboot.userinterface.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.userinterface.domain.Login;
@Repository
public interface UserRepository extends JpaRepository<Login,Long>{
		Login findByUsernameAndPassword(String username, String password);



}
	
