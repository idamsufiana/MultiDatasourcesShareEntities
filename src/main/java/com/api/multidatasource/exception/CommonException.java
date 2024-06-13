package com.api.multidatasource.exception;

import org.springframework.http.HttpStatus;

import com.api.multidatasource.config.ApplicationConstant;

import lombok.Data;

@Data
public class CommonException extends Exception {

    private ApplicationConstant.COMPLETION_STATUS status;
	private HttpStatus httpStatus;
	private String code;
    private String type;
    private String displayMessage;

    public CommonException(Exception e) {
    	super(e.getMessage());
    	this.status = ApplicationConstant.COMPLETION_STATUS.SYSTEM_ERROR;
    	this.httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
        this.code = "99";
        this.type = e.getClass().getSimpleName();
        this.displayMessage = "Unknown Error: " + e.getClass().getSimpleName();
    }
    
}
