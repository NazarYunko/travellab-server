package com.travellab;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Getter
@ConfigurationProperties("travellab")
public class ApplicationProperties {

    @Value("${travellab.oauth.client-id}")
    private String clientId;

    @Value("${travellab.oauth.client-secret}")
    private String clientSecret;
}
