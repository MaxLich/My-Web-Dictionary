package ru.maxlich.app.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import ru.maxlich.app.dao.DictRecordMapper;

import javax.sql.DataSource;

@Configuration
public class SpringConfig {

    @Bean
    public JdbcTemplate getJdbcTemplate() {
        return new JdbcTemplate(getDataSource());
    }

    @Bean
    public DataSource getDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl("jdbc:postgresql://localhost:5432/dictionary_db");
        dataSource.setUsername("postgres");
        dataSource.setPassword("1");
        dataSource.setDriverClassName("org.postgresql.Driver");
        return dataSource;
    }

    @Bean
    public DictRecordMapper getDictRecordMapper() {
        return new DictRecordMapper();
    }
}
