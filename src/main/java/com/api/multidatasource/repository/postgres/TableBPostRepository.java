package com.api.multidatasource.repository.postgres;

import org.springframework.data.jpa.repository.JpaRepository;
import com.api.multidatasource.models.TableB;

import org.springframework.stereotype.Repository;

@Repository
public interface TableBPostRepository extends JpaRepository<TableB, Long>{
    
}
