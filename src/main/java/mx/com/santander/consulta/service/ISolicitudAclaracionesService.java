package mx.com.santander.consulta.service;

import mx.com.santander.consulta.model.ConsultaSolicitudAclaracionesResponse;
import mx.com.santander.consulta.model.ConsultaSolicitudesAclaracionesRequest;
import mx.com.santander.consulta.repository.ISolicitudAclaracionesRepository;

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
