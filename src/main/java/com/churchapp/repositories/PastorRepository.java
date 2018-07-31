package com.churchapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.churchapp.domain.Pastor;

@Repository
public interface PastorRepository extends JpaRepository<Pastor, Integer>{

}
