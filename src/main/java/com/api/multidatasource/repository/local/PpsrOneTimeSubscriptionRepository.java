package com.api.multidatasource.repository.local;

import org.springframework.data.jpa.repository.JpaRepository;
import com.api.multidatasource.models.PpsrOneTimeSubscription;
import org.springframework.stereotype.Repository;

@Repository
public interface PpsrOneTimeSubscriptionRepository extends JpaRepository<PpsrOneTimeSubscription, Long>{
  
}
