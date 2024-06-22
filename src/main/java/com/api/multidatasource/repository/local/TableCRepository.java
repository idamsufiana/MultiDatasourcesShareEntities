package com.api.multidatasource.repository.local;

import org.springframework.data.jpa.repository.JpaRepository;
import com.api.multidatasource.models.TableC;

import org.springframework.stereotype.Repository;

@Repository
public interface TableCRepository extends JpaRepository<TableC, Long> {
    
}
