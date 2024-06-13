package com.api.multidatasource.repository.postgres;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.multidatasource.models.PpsrProductRolloverRulesetMapping;
import org.springframework.stereotype.Repository;

@Repository
public interface PpsrProductRolloverRulesetMappingPostRepository extends JpaRepository<PpsrProductRolloverRulesetMapping, Long> {
    
}
