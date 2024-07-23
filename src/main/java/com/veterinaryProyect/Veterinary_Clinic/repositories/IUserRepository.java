package com.veterinaryProyect.Veterinary_Clinic.repositories;

import com.veterinaryProyect.Veterinary_Clinic.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}