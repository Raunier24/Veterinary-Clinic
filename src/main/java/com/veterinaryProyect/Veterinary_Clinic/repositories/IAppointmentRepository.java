package com.veterinaryProyect.Veterinary_Clinic.repositories;


import com.veterinaryProyect.Veterinary_Clinic.models.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAppointmentRepository extends JpaRepository<Appointment, Long> {
}
