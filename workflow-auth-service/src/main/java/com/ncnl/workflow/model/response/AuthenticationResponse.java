package com.ncnl.workflow.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;


@Data
public class AuthenticationResponse {
    @JsonProperty("access_token")
    private String accessToken;

    @JsonProperty("refresh_token")
    private String refreshToken;

    @JsonProperty("message")
    private String message;

    public AuthenticationResponse(String accessToken, String refreshToken, String message) {
        this.accessToken = accessToken;
        this.message = message;
        this.refreshToken = refreshToken;
    }

}
