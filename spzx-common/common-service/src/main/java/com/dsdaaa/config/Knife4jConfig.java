package com.dsdaaa.config;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;

/**
 * knife4j配置类
 */
public class Knife4jConfig {
    @Bean
    public GroupedOpenApi webApi() {      // 创建了一个api接口的分组
        return GroupedOpenApi.builder()
                .group("web-api")         // 分组名称
                .pathsToMatch("/api/**")  // 接口请求路径规则
                .build();
    }
}
