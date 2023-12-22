package com.example.demo.service;
import java.util.List;
import com.example.demo.entity.Formation;

public interface FormationService {
Formation saveFormation(Formation f);
Formation updateFormation(Formation f);
void deleteFormation(Formation f);
void deleteFormationById(Long id);
Formation getFormation(Long id);
List<Formation> getAllFormations();
}
