package mx.com.santander.consulta.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import mx.com.santander.consulta.dao.ISolicitudAclaracionesRepository;
import mx.com.santander.consulta.model.ConsultaSolicitudAclaracionesResponse;
import mx.com.santander.consulta.model.ConsultaSolicitudesAclaracionesRequest;

@Service
@Slf4j
public class SolicitudAclaracionesService implements ISolicitudAclaracionesService {

	@Autowired
	private ISolicitudAclaracionesRepository solicitud;

	@Override
	public ConsultaSolicitudAclaracionesResponse getConsulta(
			ConsultaSolicitudesAclaracionesRequest consultaSolicitudesAclaracionesRequest) {

		ConsultaSolicitudAclaracionesResponse consultaSolicitudAclaracionesResponse;

		log.info("Se carga informacion de getAclaraciones");
		consultaSolicitudAclaracionesResponse = this.solicitud.getConsulta(consultaSolicitudesAclaracionesRequest);
		return consultaSolicitudAclaracionesResponse;
	}

	
	  @Override public void setRepository(ISolicitudAclaracionesRepository
	  solicitud) { this.solicitud = solicitud;
	  
	  }
	 

}
