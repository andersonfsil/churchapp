package com.churchapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.churchapp.domain.Culto;

@Repository
public interface CultoRepository extends JpaRepository<Culto, Integer>{

}
