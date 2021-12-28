package mx.com.santander.consulta.jdbc;

import java.beans.PropertyVetoException;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * @author Anzen
 *
 */
@Configuration
@PropertySource("classpath:application.yml")
public class ApplicationContext {

	@Bean(destroyMethod = "close")
    DataSource dataSource(Environment env) {
        ComboPooledDataSource ds = new ComboPooledDataSource();
        try {
            ds.setDriverClass(env.getRequiredProperty("spring.datasource.driverClassName"));
        } catch (IllegalStateException | PropertyVetoException ex) {
            throw new RuntimeException(
                    "error while setting the driver class name in the datasource", ex);
        }
        ds.setJdbcUrl(env.getRequiredProperty("spring.datasource.url"));
        ds.setUser(env.getRequiredProperty("spring.datasource.username"));
        ds.setPassword(env.getRequiredProperty("spring.datasource.password"));
 
        return ds;
    }
     
    @Bean
    JdbcTemplate jdbcTemplate(DataSource dataSource) {
        return new JdbcTemplate(dataSource);        
    }
     
    @Bean
    DataSourceTransactionManager dataSourceTransactionManager(DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }   
}
