package com.abdi.conferencedemo2.repositories;

import com.abdi.conferencedemo2.models.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {
}
