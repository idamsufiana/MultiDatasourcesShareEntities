package com.api.multidatasource.models;

import com.api.multidatasource.config.ApplicationConstant;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseBody {

    @JsonProperty("status")
    private ApplicationConstant.STATUS status;
    @JsonProperty("code")
    private String code;
    @JsonProperty("message")
    private String message;

}

