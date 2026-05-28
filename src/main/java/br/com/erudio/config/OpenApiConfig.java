package br.com.erudio.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class OpenApiConfig {

    @Bean
    OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("REST API's RESTFul from 0 with Java, Spring Boot, Kubernetes and Docker")
                        .version("V1")
                        .description("REST API's RESTFul from 0 with Java, Spring Boot, Kubernetes and Docker")
                        .termsOfService("....................................................................")
                        .license(new License()
                                .name("Apache 2.0")
                                .url("------------------------------------")));
    }

}
