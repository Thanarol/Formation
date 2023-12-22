package com.example.demo.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import com.example.demo.entity.User;

public interface UserRepository extends CrudRepository<User, Long> {
   List<User> findByNom (Long id, String nom, String prenom, String email, String password, String role, String adresse);
}