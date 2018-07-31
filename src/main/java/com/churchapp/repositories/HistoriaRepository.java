package com.churchapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.churchapp.domain.Historia;

@Repository
public interface HistoriaRepository extends JpaRepository<Historia, Integer>{

}
