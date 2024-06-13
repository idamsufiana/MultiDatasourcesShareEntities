package com.api.multidatasource.repository.local;

import org.springframework.data.jpa.repository.JpaRepository;
import com.api.multidatasource.models.PpsrRenewal;
import org.springframework.stereotype.Repository;

@Repository
public interface PpsrRenewalRepository extends JpaRepository<PpsrRenewal, Long>{
    
}
