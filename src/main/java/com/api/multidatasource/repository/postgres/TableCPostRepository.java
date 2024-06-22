package com.api.multidatasource.repository.postgres;

import org.springframework.data.jpa.repository.JpaRepository;
import com.api.multidatasource.models.TableC;

import org.springframework.stereotype.Repository;

@Repository
public interface TableCPostRepository extends JpaRepository<TableC, Long> {
    
}
