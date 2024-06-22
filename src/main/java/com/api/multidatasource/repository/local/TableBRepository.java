package com.api.multidatasource.repository.local;

import org.springframework.data.jpa.repository.JpaRepository;
import com.api.multidatasource.models.TableB;

import org.springframework.stereotype.Repository;

@Repository
public interface TableBRepository extends JpaRepository<TableB, Long>{
    
}
