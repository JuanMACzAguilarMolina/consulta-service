package mx.com.santander.consulta.service;

import org.springframework.stereotype.Service;

import mx.com.santander.consulta.model.ConsultaSolicitudAclaracionesResponse;
import mx.com.santander.consulta.model.ConsultaSolicitudesAclaracionesRequest;

/**
 * @author Anzen
 *
 */
@Service
public interface ISolicitudAclaracionesService {
	
	/**
	 * @param consultaSolicitudesAclaracionesRequest
	 * @return
	 */
	ConsultaSolicitudAclaracionesResponse getConsulta(ConsultaSolicitudesAclaracionesRequest consultaSolicitudesAclaracionesRequest);

}
