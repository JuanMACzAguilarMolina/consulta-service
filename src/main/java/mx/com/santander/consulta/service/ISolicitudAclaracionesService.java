package mx.com.santander.consulta.service;

import mx.com.santander.consulta.dao.ISolicitudAclaracionesRepository;
import mx.com.santander.consulta.model.ConsultaSolicitudAclaracionesResponse;
import mx.com.santander.consulta.model.ConsultaSolicitudesAclaracionesRequest;

/**
 * @author Anzen
 *
 */

public interface ISolicitudAclaracionesService {

	/**
	 * @param consultaSolicitudesAclaracionesRequest
	 * @return
	 */
	ConsultaSolicitudAclaracionesResponse getConsulta(
			ConsultaSolicitudesAclaracionesRequest consultaSolicitudesAclaracionesRequest);

	/**
	 * @param solicitud
	 */
	void setRepository(ISolicitudAclaracionesRepository solicitud);

}
