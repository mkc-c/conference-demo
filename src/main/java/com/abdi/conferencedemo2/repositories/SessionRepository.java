package com.abdi.conferencedemo2.repositories;

import com.abdi.conferencedemo2.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {
}
