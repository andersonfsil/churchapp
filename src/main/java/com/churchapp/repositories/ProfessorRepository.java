package com.churchapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.churchapp.domain.Professor;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Integer>{

}
