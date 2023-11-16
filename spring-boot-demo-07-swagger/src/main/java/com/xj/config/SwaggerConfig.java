package com.xj.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

//注入swagger到spring容器
@Configuration
@EnableSwagger2 //自动开启swagger文档生成
public class SwaggerConfig {

    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.xj"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo()) //展示信息
                .groupName("小杰");//分组信息

    }

    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("spring 与 swagger 整合")
                .version("1.0")
                .description("学生系统增删")
                .build();
    }

}
