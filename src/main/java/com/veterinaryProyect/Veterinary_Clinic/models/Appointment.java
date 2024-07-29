package com.veterinaryProyect.Veterinary_Clinic.models;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

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

    public void setId(Long id2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setId'");
    }

   //@ManyToMany(mappedBy = "appointment")
    //private Set<Patient> patients = new HashSet<>();
}
