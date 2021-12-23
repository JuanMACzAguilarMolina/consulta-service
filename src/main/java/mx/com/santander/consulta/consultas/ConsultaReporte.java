package mx.com.santander.consulta.consultas;

import lombok.Data;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value = "classpath:consulta-consultas.properties", ignoreResourceNotFound = true)
@ConfigurationProperties(prefix = "consulta.consultas")
@Data
public class ConsultaReporte {
	
	private String getEjecutivo;
}
