package com.api.multidatasource.repository.postgres;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.multidatasource.models.TableD;

import org.springframework.stereotype.Repository;

@Repository
public interface TableDPostRepository extends JpaRepository<TableD, Long> {
    
}
