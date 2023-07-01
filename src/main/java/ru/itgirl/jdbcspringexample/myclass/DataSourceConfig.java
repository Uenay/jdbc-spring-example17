package ru.itgirl.jdbcspringexample.myclass;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {
    @Bean
    public DataSource getDataSource() {
        return DataSourceBuilder.create()
                .driverClassName("org.postgresql.Driver")
                .url("jdbc:mysql://localhost:5432/jdbc-spring-example")
                .username("postgres")
                .password("aimezMoi0106")
                .build();
    }
}
