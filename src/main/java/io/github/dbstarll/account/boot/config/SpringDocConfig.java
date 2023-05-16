package io.github.dbstarll.account.boot.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class SpringDocConfig {
    @Bean
    OpenAPI api() {
        return new OpenAPI()
                .info(new Info().title("Account API").description("账户体系 API 演示").version("v1.0.0-SNAPSHOT"));
    }

    @Bean
    GroupedOpenApi loginApi() {
        return GroupedOpenApi.builder().group("login").displayName("登录/登出")
                .pathsToMatch("/login/**", "/logout/**").build();
    }

    @Bean
    GroupedOpenApi bindApi() {
        return GroupedOpenApi.builder().group("bind").displayName("绑定/解绑")
                .pathsToMatch("/bind/**", "/unbind/**").build();
    }
}
