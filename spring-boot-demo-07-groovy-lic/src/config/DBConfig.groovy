package config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

import javax.sql.DataSource

@Configuration
class DBConfig {

    @Bean
    DataSource dataSource(){
//        new DruidDataSource()
    }
}
