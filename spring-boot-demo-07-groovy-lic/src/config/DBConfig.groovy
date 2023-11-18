package config

import org.apache.ibatis.session.SqlSessionFactory
import org.mybatis.spring.SqlSessionFactoryBean
import org.mybatis.spring.SqlSessionTemplate
import org.mybatis.spring.mapper.MapperScannerConfigurer
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import com.alibaba.druid.pool.DruidDataSource;

import javax.sql.DataSource

@Configuration
class DBConfig {

    @Bean
    DataSource dataSource() {
        def druid = new DruidDataSource();
        druid.setDriverClassName("com.mysql.cj.jdbc.Driver");
        druid.setUrl("jdbc:mysql:///test02");
        druid.setUsername("root");
        druid.setPassword("root");
        druid;
    }

    @Bean
    SqlSessionFactory sessionFactory(DataSource dataSource){
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean()
        bean.setDataSource(dataSource);
        bean.getObject();
    }
    @Bean
    SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory factory){
        new SqlSessionTemplate(factory)
    }

    @Bean
    MapperScannerConfigurer configurer(SqlSessionFactory factory) {
        def mapper = new MapperScannerConfigurer();
        mapper.setSqlSessionFactory(factory)
        mapper.setBasePackage("mapper");
        mapper
    }

}
