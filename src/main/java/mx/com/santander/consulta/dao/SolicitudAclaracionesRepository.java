package mx.com.santander.consulta.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import lombok.extern.slf4j.Slf4j;
import mx.com.santander.consulta.consultas.ConsultaReporte;
import mx.com.santander.consulta.model.ConsultaSolicitudAclaracionesResponse;
import mx.com.santander.consulta.model.ConsultaSolicitudesAclaracionesRequest;

/**
 * @author Anzen
 *
 */
/**
 * @author Anzen
 *
 */
@Repository
@Slf4j
public class SolicitudAclaracionesRepository implements ISolicitudAclaracionesRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	ConsultaReporte consultas;
	
	/**
	 *
	 */
	@Override
	public ConsultaSolicitudAclaracionesResponse getConsulta(
			ConsultaSolicitudesAclaracionesRequest consultaSolicitudesAclaracionesRequest) {
		log.info("Inicio de getConsulta para extraccion de datos ");
		ConsultaSolicitudAclaracionesResponse response;
				
		return response = this.jdbcTemplate.queryForObject(consultas.getGetAclaraciones(),
				new ConsultaSolicitudAclaracionesMapper(),consultaSolicitudesAclaracionesRequest.getIdApp(),
				consultaSolicitudesAclaracionesRequest.getIdCanal(),consultaSolicitudesAclaracionesRequest.getIdRamo(),consultaSolicitudesAclaracionesRequest.getNumPol());
	
	}

	
	  @Override
	  public void setRepository(JdbcTemplate jdbcTemplate) {
	  this.jdbcTemplate = jdbcTemplate;
	  
	  }
	  
	  @Override
	  public void setConsultas(ConsultaReporte consultas) {
	  this.consultas = consultas;
	  
	  }
	 

}
