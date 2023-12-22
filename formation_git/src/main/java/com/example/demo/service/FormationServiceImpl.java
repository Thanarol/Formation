package com.example.demo.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Formation;
import com.example.demo.repos.FormationRepository;
@Service
public class FormationServiceImpl implements FormationService {
@Autowired
FormationRepository formationRepository;
@Override
public Formation saveFormation(Formation f) {

return formationRepository.save(f);
}
@Override
public Formation updateFormation(Formation f) {
return formationRepository.save(f);
}
@Override
public void deleteFormation(Formation f) {
formationRepository.delete(f);
}
@Override
public void deleteFormationById(Long id) {
formationRepository.deleteById(id);
}
@Override
public Formation getFormation(Long id) {
return formationRepository.findById(id).get();
}
@Override
public List<Formation> getAllFormations() {
return formationRepository.findAll();
}
}