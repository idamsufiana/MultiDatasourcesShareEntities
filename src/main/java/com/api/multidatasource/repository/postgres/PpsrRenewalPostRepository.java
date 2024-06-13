package com.api.multidatasource.repository.postgres;

import org.springframework.data.jpa.repository.JpaRepository;
import com.api.multidatasource.models.PpsrRenewal;
import org.springframework.stereotype.Repository;

@Repository
public interface PpsrRenewalPostRepository extends JpaRepository<PpsrRenewal, Long>{
    
}
