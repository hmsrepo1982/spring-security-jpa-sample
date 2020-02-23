package com.hms.springsecurityjpasample.repository;



import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hms.springsecurityjpasample.model.Authority;
import com.hms.springsecurityjpasample.model.User;

@Repository
public interface AuthorityRepository extends JpaRepository<Authority, Integer>{
	
	Optional<Authority> findByusername(String username);
	
	Optional<Authority> findByauthority(String authority);

}
