package com.xj.multiDataSource.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@Configuration //spring 扫描到这个注解会进行解析
@MapperScan(basePackages = "com.xj.multiDataSource.mapper.db1" , sqlSessionFactoryRef = "db1SqlSessionFactory")
//MapperSanc 注解 basePackages 指定dao 层路径  sqlSessionFactoryRef 表示指定数据源构工厂的地址 工厂内 设置 了 DataSource 数据源
public class DB1Config {

    @Primary //标明这个是主要的数据源 也就是默认的 未指定数据源名称时 注入这个数据源
    @Bean("db1DataSource") //注册db1 的 DataSource 数据源 供工厂使用
    @ConfigurationProperties(prefix = "spring.datasource.db1")//指定数据配置的地址 application.yml
    public DataSource   getDataSourceConfig(){
        return DataSourceBuilder.create().build();
    }

    @Primary
    @Bean("db1SqlSessionFactory") //SqlSessionFactory 注册成Bean
    public SqlSessionFactory db1SqlSessionFactory(@Qualifier("db1DataSource") DataSource dataSource) throws Exception {
        //Qualifier 注解 通过名称注入 注入db1的数据源
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        return bean.getObject();
    }

    @Primary
    @Bean("db1SqlSessionTemplate")
    public SqlSessionTemplate db1SqlSessionTemplate(@Qualifier("db1SqlSessionFactory") SqlSessionFactory factory) {
        //Qualifier 注解 通过名称注入 注入db1SqlSessionFactory 工厂
        return new SqlSessionTemplate(factory);
    }


}
