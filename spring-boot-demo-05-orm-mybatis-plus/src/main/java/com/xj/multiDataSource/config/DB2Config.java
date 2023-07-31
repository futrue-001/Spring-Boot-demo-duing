package com.xj.multiDataSource.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
@MapperScan(basePackages = "com.xj.multiDataSource.mapper.db2",sqlSessionFactoryRef = "db2SqlSessionFactory")
//MapperSanc 注解 basePackages 指定dao 层路径  sqlSessionFactoryRef 表示指定数据源构工厂的地址 工厂内 设置 了 DataSource 数据源
public class DB2Config {

    @Bean("db2DataSource") //注册db2 的 DataSource 数据源 供工厂使用
    @ConfigurationProperties(prefix = "spring.datasource.db2") //指定数据配置的地址 application.yml
    public DataSource getDataSource(){
        return DataSourceBuilder.create().build();
    }

    @Bean("db2SqlSessionFactory")
    public SqlSessionFactory db2SqlSessionFactory(@Qualifier("db2DataSource") DataSource dataSource) throws Exception {
        //Qualifier 注解 通过名称注入 注入db2的数据源
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        return bean.getObject();
    }

    @Bean("db2SqlSessionTemplate")
    public SqlSessionTemplate db2SqlSessionTemplate(@Qualifier("db2SqlSessionFactory") SqlSessionFactory factory){
        return new SqlSessionTemplate(factory);
    }

}
