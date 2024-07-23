package com.veterinaryProyect.Veterinary_Clinic.repositories;

import com.veterinaryProyect.Veterinary_Clinic.models.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPatientRepository extends JpaRepository<Patient, Long> {
    Patient findByIdentificationNumber(String identificationNumber);
}