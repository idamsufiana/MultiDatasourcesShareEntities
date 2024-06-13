package com.api.multidatasource.repository.postgres;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.multidatasource.models.PpsrOneTimeSubscription;
import org.springframework.stereotype.Repository;

@Repository
public interface PpsrOneTimeSubscriptionPostRepository extends JpaRepository<PpsrOneTimeSubscription, Long>{
  
}
