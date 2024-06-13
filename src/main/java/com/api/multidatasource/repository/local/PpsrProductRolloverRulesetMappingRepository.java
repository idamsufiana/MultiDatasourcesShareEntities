package com.api.multidatasource.repository.local;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.multidatasource.models.PpsrProductRolloverRulesetMapping;
import org.springframework.stereotype.Repository;

@Repository
public interface PpsrProductRolloverRulesetMappingRepository extends JpaRepository<PpsrProductRolloverRulesetMapping, Long> {
    
}
