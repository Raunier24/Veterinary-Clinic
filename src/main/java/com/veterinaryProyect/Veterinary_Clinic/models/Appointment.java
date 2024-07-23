package com.veterinaryProyect.Veterinary_Clinic.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "appointment")
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "dateTime")
    private LocalDateTime dateTime;

    @Column(name = "consultationType")
    private String consultationType;

    @Column(name = "reason")
    private String reason;

    @Column(name = "status")
    private boolean status;

   //@ManyToMany(mappedBy = "appointment")
    //private Set<Patient> patients = new HashSet<>();
}
