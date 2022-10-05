package com.microservices.project.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ErrorResponse {

    private String errorMessage;
    private String errorCode;

}
