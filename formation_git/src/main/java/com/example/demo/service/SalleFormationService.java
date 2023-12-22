package com.example.demo.service;

import java.util.List;
import com.example.demo.entity.SalleFormation;

public interface SalleFormationService {
	SalleFormation saveSalleFormation(SalleFormation sf);
	SalleFormation updateSalleFormation(SalleFormation sf);
	void deleteSalleFormation(SalleFormation sf);
	void deleteSalleFormationById(Long id);
	SalleFormation getSalleFormation(Long id);
	List<SalleFormation> getAllSallesFormation();
}
