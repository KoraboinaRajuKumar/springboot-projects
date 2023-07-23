package com.infy.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infy.entity.CountyMaster;


public interface CountryRepository extends JpaRepository<CountyMaster, Serializable> {

}
