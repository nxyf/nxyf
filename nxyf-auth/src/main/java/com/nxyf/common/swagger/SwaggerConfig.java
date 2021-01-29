
package com.nxyf.common.swagger;

import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger配置
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

//    @Value("${swagger.show}")
    private Boolean swaggerShow;

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
//                .enable(swaggerShow)//是否开启swagger  生产环境关闭
                .apiInfo(apiInfo())
                .select()
                //加了ApiOperation注解的类，生成接口文档
                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                //包下的类，生成接口文档
                //.apis(RequestHandlerSelectors.basePackage("io.renren.modules.job.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("南巷有风")
                .description("spring cloud文档")
                .termsOfServiceUrl("http://localhost:7001/swagger-ui.html")
                .version("1.0.0")
                .build();
    }

}