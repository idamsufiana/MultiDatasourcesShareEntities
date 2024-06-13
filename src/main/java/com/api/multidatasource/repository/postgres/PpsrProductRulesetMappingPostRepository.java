package com.api.multidatasource.repository.postgres;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.multidatasource.models.PpsrProductRulesetMapping;
import org.springframework.stereotype.Repository;

@Repository
public interface PpsrProductRulesetMappingPostRepository extends JpaRepository<PpsrProductRulesetMapping, Long> {
    
}
