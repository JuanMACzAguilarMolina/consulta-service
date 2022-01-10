package mx.com.santander.consulta.consultas;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import lombok.Getter;
import lombok.Setter;

@Configuration
@PropertySource(value = "classpath:consulta-consultas.properties", ignoreResourceNotFound = true)
@ConfigurationProperties(prefix = "consulta.consultas")
@Getter
@Setter
public class ConsultaReporte {
	
	private String getEjecutivo;
	
	private String getAclaraciones;
}
