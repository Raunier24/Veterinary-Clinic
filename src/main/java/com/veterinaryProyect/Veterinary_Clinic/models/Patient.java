package com.veterinaryProyect.Veterinary_Clinic.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

//import javax.persistence.*;



public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int age;
    private String breed;
    private String gender;
    private String identificationNumber;
    private String ownerFirstName;
    private String ownerLastName;
    private String ownerPhoneNumber;
    public void setId(Long id2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setId'");
    }

    //@ManyToMany
    //@JoinTable(
      //      name = "patient_appointment",
        //    joinColumns = @JoinColumn(name = "patient_id"),
          //  inverseJoinColumns = @JoinColumn(name = "appointment_id")
    //)
    //private Set<Appointment> appointments = new HashSet<>();

    //private String profileImage;

}
