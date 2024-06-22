package com.api.multidatasource.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.api.multidatasource.models.ResponseInfo;
import com.api.multidatasource.models.TableA;
import com.api.multidatasource.models.TableB;
import com.api.multidatasource.models.TableC;
import com.api.multidatasource.models.TableD;
import com.api.multidatasource.repository.local.TableARepository;
import com.api.multidatasource.repository.local.TableBRepository;
import com.api.multidatasource.repository.local.TableCRepository;
import com.api.multidatasource.repository.local.TableDRepository;
import com.api.multidatasource.repository.postgres.TableAPostRepository;
import com.api.multidatasource.repository.postgres.TableBPostRepository;
import com.api.multidatasource.repository.postgres.TableCPostRepository;
import com.api.multidatasource.repository.postgres.TableDPostRepository;


@Service
public class DownloadService {

    @Autowired
    private TableDPostRepository tableDPostRepository;

    @Autowired
    private TableAPostRepository tableAPostRepository;

    @Autowired
    private TableBPostRepository tableBPostRepository;

    @Autowired
    private TableCPostRepository tableCPostRepository;

    @Autowired
    private TableDRepository tableDRepository;

    @Autowired
    private TableARepository tableARepository;

    @Autowired
    private TableBRepository tableBRepository;

    @Autowired
    private TableCRepository tableCRepository;

    public ResponseInfo getAllData(){
        ResponseInfo responseData = new ResponseInfo();

        try {

            tableARepository.deleteAll();
            List<TableA> tableAs = tableAPostRepository.findAll();
            tableARepository.saveAll(tableAs);

            tableBRepository.deleteAll();
            List<TableB> tableBs = tableBPostRepository.findAll();
            tableBRepository.saveAll(tableBs);

            tableCRepository.deleteAll();
            List<TableC> tableCs = tableCPostRepository.findAll();
            tableCRepository.saveAll(tableCs);

            tableDRepository.deleteAll();
            List<TableD> tableDs = tableDPostRepository.findAll();
            tableDRepository.saveAll(tableDs);

            responseData.setSuccess();
            
        } catch (Exception e) {
            e.printStackTrace();
            responseData.setException(e);
            return responseData;
        }
        return responseData;
    }
    
}
