package mx.com.santander.consulta.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import mx.com.santander.consulta.consultas.ConsultaReporte;
import mx.com.santander.consulta.model.ConsultaSolicitudAclaracionesResponse;
import mx.com.santander.consulta.model.ConsultaSolicitudesAclaracionesRequest;

/**
 * @author Anzen
 *
 */
public interface ISolicitudAclaracionesRepository {

	/**
	 * 
	 * @param consultaSolicitudesAclaracionesRequest
	 * @return
	 */
	ConsultaSolicitudAclaracionesResponse getConsulta(ConsultaSolicitudesAclaracionesRequest consultaSolicitudesAclaracionesRequest);

	/**
	 * @param jdbcTemplate
	 */
	void setRepository(JdbcTemplate jdbcTemplate);

	/**
	 * @param consultas
	 */
	void setConsultas(ConsultaReporte consultas);
}
