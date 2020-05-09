package com.travellab.configuration;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.travellab.repository")
@EntityScan("com.travellab.model")
@Configuration
public class JpaConfiguration {
}
