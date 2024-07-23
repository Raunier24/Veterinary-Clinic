package com.veterinaryProyect.Veterinary_Clinic.services;


import com.veterinaryProyect.Veterinary_Clinic.models.Patient;
import com.veterinaryProyect.Veterinary_Clinic.repositories.IPatientRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@SpringBootTest
public class PatientServicesTest {

    @InjectMocks
    private PatientServices patientService;

    @Mock
    private IPatientRepository patientRepository;

    @Test
    public void testGetAllPatients() {
        MockitoAnnotations.initMocks(this);
        when(patientRepository.findAll()).thenReturn(Collections.singletonList(new Patient()));
        List<Patient> patients = patientService.getAllPatients();
        assertEquals(1, patients.size());
        verify(patientRepository, times(1)).findAll();
    }
}