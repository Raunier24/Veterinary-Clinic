package com.veterinaryProyect.Veterinary_Clinic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.veterinaryProyect.Veterinary_Clinic.models.User;

public interface IUserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}