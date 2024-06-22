package com.api.multidatasource.repository.local;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.multidatasource.models.TableA;

import org.springframework.stereotype.Repository;

@Repository
public interface TableARepository extends JpaRepository<TableA, Long>{
  
}
