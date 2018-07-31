package com.churchapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.churchapp.domain.Aviso;

@Repository
public interface AvisoRepository extends JpaRepository<Aviso, Integer>{

}
