package com.example.demo;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.demo.entity.Formation;
import com.example.demo.repos.FormationRepository;
@SpringBootTest
class FormationApplicationTests {
@Autowired
private FormationRepository formationRepository;
@Test
public void testCreateFormation() {
Formation form = new Formation();
form.setCout(500.5f);
form.setDateCreation(LocalDate.of(2023, 10, 20));
form.setDescription("Formation sur le langage java");
form.setDuree(60);
form.setNomFormation("Java");
formationRepository.save(form);
}
@Test
public void testFindByNomFormation() {
	Formation form = formationRepository.findByNomFormation("Java");
	System.out.println(form);
}
}
