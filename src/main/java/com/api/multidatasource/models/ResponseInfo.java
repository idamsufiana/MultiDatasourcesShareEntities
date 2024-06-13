package com.api.multidatasource.models;

import java.net.http.HttpHeaders;
import java.util.ArrayList;

import org.springframework.http.HttpStatus;

import com.api.multidatasource.config.ApplicationConstant;
import com.api.multidatasource.exception.CommonException;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;


@Data
@NoArgsConstructor
@Accessors(chain = true)
public class ResponseInfo {


	private final ResponseBody body = new ResponseBody();
	private HttpHeaders httpHeaders;
	private HttpStatus httpStatus;
	
    
    public void setSuccess() {
    	this.httpStatus = HttpStatus.OK;
    	body.setStatus(ApplicationConstant.STATUS.ok);
    	body.setCode("00");
        body.setMessage("Success");
    }

    public void setException(Exception e) {
    	if (e instanceof CommonException) {
    		setCommonException((CommonException) e);
    	} else {
    		setCommonException(new CommonException(e));
    	}
    }

	public void setCommonException(CommonException e) {
    	this.httpStatus = e.getHttpStatus();
    	String status = e.getStatus().equals(ApplicationConstant.COMPLETION_STATUS.SYSTEM_ERROR) ? "error" : "failed";
    	body.setStatus(ApplicationConstant.STATUS.valueOf(status));
    	body.setCode(e.getCode());
    	body.setMessage(e.getDisplayMessage());

    }

}
