package com.xj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;

@SpringBootApplication
public class WebContainerApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebContainerApplication.class, args);
    }

    //我们使用了响应式web容器 这里 先编写一段 响应式编程
    @Bean
    public RouterFunction<ServerResponse> hello(){
        return route(GET("/hello"),
                serverRequest -> ok().body(
                        Mono.just("Hello Word!"),String.class));
    }
}
