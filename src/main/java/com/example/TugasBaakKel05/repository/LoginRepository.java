package com.example.TugasBaakKel05.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.TugasBaakKel05.model.User;

@Repository
public interface LoginRepository extends JpaRepository<User, Long> {
	User findByUsernameAndPassword(String username, String password);
}
