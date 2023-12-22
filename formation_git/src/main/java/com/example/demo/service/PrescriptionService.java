package com.example.demo.service;

import java.util.List;
import com.example.demo.entity.Prescription;

public interface PrescriptionService {
	Prescription savePrescription(Prescription p);
	Prescription updatePrescription(Prescription p);
	void deletePrescription(Prescription p);
	void deletePrescriptionById(Long id);
	Prescription getPrescription(Long id);
	List<Prescription> getAllPrescriptions();
}
