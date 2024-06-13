package com.api.multidatasource.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.multidatasource.models.PpsrOneTimeSubscription;
import com.api.multidatasource.models.PpsrProductRolloverRulesetMapping;
import com.api.multidatasource.models.PpsrProductRulesetMapping;
import com.api.multidatasource.models.PpsrRenewal;
import com.api.multidatasource.models.ResponseInfo;
import com.api.multidatasource.repository.local.PpsrOneTimeSubscriptionRepository;
import com.api.multidatasource.repository.local.PpsrProductRolloverRulesetMappingRepository;
import com.api.multidatasource.repository.local.PpsrProductRulesetMappingRepository;
import com.api.multidatasource.repository.local.PpsrRenewalRepository;
import com.api.multidatasource.repository.postgres.PpsrOneTimeSubscriptionPostRepository;
import com.api.multidatasource.repository.postgres.PpsrProductRolloverRulesetMappingPostRepository;
import com.api.multidatasource.repository.postgres.PpsrProductRulesetMappingPostRepository;
import com.api.multidatasource.repository.postgres.PpsrRenewalPostRepository;

import jakarta.transaction.Transactional;

@Service
public class DownloadService {

    @Autowired
    private PpsrProductRolloverRulesetMappingPostRepository ppsrProductRolloverRulesetMappingPostRepository;

    @Autowired
    private PpsrOneTimeSubscriptionPostRepository ppsrOneTimeSubscriptionPostRepository;

    @Autowired
    private PpsrRenewalPostRepository ppsrRenewalPostRepository;

    @Autowired
    private PpsrProductRulesetMappingPostRepository ppsrProductRulesetMappingPostRepository;

    @Autowired
    private PpsrProductRolloverRulesetMappingRepository ppsrProductRolloverRulesetMappingRepository;

    @Autowired
    private PpsrOneTimeSubscriptionRepository ppsrOneTimeSubscriptionRepository;

    @Autowired
    private PpsrRenewalRepository ppsrRenewalRepository;

    @Autowired
    private PpsrProductRulesetMappingRepository ppsrProductRulesetMappingRepository;

    public ResponseInfo getAllData(){
        ResponseInfo responseData = new ResponseInfo();

        try {

            ppsrOneTimeSubscriptionRepository.deleteAll();
            List<PpsrOneTimeSubscription> ppsrOneTimeSubscription = ppsrOneTimeSubscriptionPostRepository.findAll();
            ppsrOneTimeSubscriptionRepository.saveAll(ppsrOneTimeSubscription);

            ppsrRenewalRepository.deleteAll();
            List<PpsrRenewal> ppsrRenewals = ppsrRenewalPostRepository.findAll();
            ppsrRenewalRepository.saveAll(ppsrRenewals);

            ppsrProductRulesetMappingRepository.deleteAll();
            List<PpsrProductRulesetMapping> ppsrProductRulesetMapping = ppsrProductRulesetMappingPostRepository.findAll();
            ppsrProductRulesetMappingRepository.saveAll(ppsrProductRulesetMapping);

            ppsrProductRolloverRulesetMappingRepository.deleteAll();
            List<PpsrProductRolloverRulesetMapping> ppsrProductRolloverRulesetMapping = ppsrProductRolloverRulesetMappingPostRepository.findAll();
            ppsrProductRolloverRulesetMappingRepository.saveAll(ppsrProductRolloverRulesetMapping);

            responseData.setSuccess();
            
        } catch (Exception e) {
            e.printStackTrace();
            responseData.setException(e);
            return responseData;
        }
        return responseData;
    }
    
}
