package com.example.demo.repos;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Formation;
import com.example.demo.entity.Session;

public interface SessionRepository extends CrudRepository<Session, Long> {
   List<Session> findByDateSession (Long id, float nbMaxParticip, LocalDate dateSession, Formation formation);
}