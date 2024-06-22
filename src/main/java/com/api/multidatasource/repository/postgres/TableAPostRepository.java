package com.api.multidatasource.repository.postgres;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.multidatasource.models.TableA;

import org.springframework.stereotype.Repository;

@Repository
public interface TableAPostRepository extends JpaRepository<TableA, Long>{
  
}
