package com.api.multidatasource.delivery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.multidatasource.models.ResponseInfo;
import com.api.multidatasource.services.DownloadService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/GetAndWrite")
public class TransferDataController {

    @Autowired
    private DownloadService downloadService;

    @GetMapping("/Postgres")
    public ResponseEntity<?> download(){
        ResponseInfo responseData = new ResponseInfo();
        responseData = downloadService.getAllData();
        return new ResponseEntity<>(responseData.getBody(), responseData.getHttpStatus());
    }

    @GetMapping("/Halo")
    public String Halo(){
        return "Ok";
    }

    
}
