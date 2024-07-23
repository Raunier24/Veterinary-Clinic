package com.veterinaryProyect.Veterinary_Clinic.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

//@Entity
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime dateTime;
    private String reason;
    private String status;
    private boolean isEmergency;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

   //@ManyToMany(mappedBy = "appointment")
    //private Set<Patient> patients = new HashSet<>();
}
