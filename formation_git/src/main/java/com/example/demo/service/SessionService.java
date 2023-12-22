package com.example.demo.service;

import java.util.List;
import com.example.demo.entity.Session;

public interface SessionService {
	Session saveSession(Session s);
	Session updateSession(Session s);
	void deleteSession(Session s);
	void deleteSessionById(Long id);
	Session getSession(Long id);
	List<Session> getAllSessions();
}
