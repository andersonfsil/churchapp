package com.churchapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.churchapp.domain.Diacono;

@Repository
public interface DiaconoRepository extends JpaRepository<Diacono, Integer>{

}
