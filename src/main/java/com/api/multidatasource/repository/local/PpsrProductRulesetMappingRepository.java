package com.api.multidatasource.repository.local;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.multidatasource.models.PpsrProductRulesetMapping;
import org.springframework.stereotype.Repository;

@Repository
public interface PpsrProductRulesetMappingRepository extends JpaRepository<PpsrProductRulesetMapping, Long> {
    
}
