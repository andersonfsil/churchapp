package com.churchapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.churchapp.domain.Grupo;

@Repository
public interface GrupoRepository extends JpaRepository<Grupo, Integer>{

}
