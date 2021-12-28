package mx.com.santander.consulta.dao;

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
}
