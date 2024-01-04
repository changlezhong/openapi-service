package com.time.trip.openapi.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public GroupedOpenApi testApi() {
        return GroupedOpenApi.builder()
                // 组名
                .group("test")
                // 扫描的包
                .packagesToScan("com.time.trip.openapi.controller.test")
                .build();
    }

    @Bean
    public GroupedOpenApi demoApi() {
        return GroupedOpenApi.builder()
                // 组名
                .group("demo")
                // 扫描的包
                .packagesToScan("com.time.trip.openapi.controller.demo")
                .build();
    }

    @Bean
    public OpenAPI springDocOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("OpenAPI 接口文档")
                        .description("OpenAPI 接口文档")
                        .version("v1"));
    }

}


