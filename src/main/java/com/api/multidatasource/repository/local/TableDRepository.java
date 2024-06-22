package com.api.multidatasource.repository.local;

import org.springframework.data.jpa.repository.JpaRepository;
import com.api.multidatasource.models.TableD;

import org.springframework.stereotype.Repository;

@Repository
public interface TableDRepository extends JpaRepository<TableD, Long> {
    
}
