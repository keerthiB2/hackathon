package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.hackathon.model.User;

@Repository
public interface UserRepo extends JpaRepository<User,String>{

}
