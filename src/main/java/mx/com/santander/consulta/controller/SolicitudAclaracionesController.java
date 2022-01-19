package mx.com.santander.consulta.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import mx.com.santander.consulta.constants.Constants;
import mx.com.santander.consulta.model.ConsultaSolicitudesAclaracionesRequest;
import mx.com.santander.consulta.service.ISolicitudAclaracionesService;

@RestController
@RequestMapping(Constants.ENDPOINT_GENERAL_ACLARACIONES)
@Slf4j
public class SolicitudAclaracionesController {

	@Autowired
	private ISolicitudAclaracionesService iSolicitudAclaracionesService;

	/**
	 * Metodo getConsulta
	 * @param consultaSolicitudesAclaracionesRequest
	 * @return ResponseEntity
	 */
	@PostMapping(value = Constants.ENDPOINT_CONSULTA, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getConsulta(
			@RequestBody ConsultaSolicitudesAclaracionesRequest consultaSolicitudesAclaracionesRequest) {
		log.info("Se inicia la solicitud controlador de consultas");
		try {
			return ResponseEntity
					.ok(this.iSolicitudAclaracionesService.getConsulta(consultaSolicitudesAclaracionesRequest));
		} catch (Exception e) {
			Map<String, Object> response = new HashMap<>();
			response.put("statusCode", "1");
			response.put("statusDesc", "NO SE PUDIERON RECUPERAR LOS DATOS DE LA PÓLIZA: "
					+ consultaSolicitudesAclaracionesRequest.getNumPol() + " Datos de entrada erroneos");
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
		}

	}

	/**
	 * Metodo setSolicitud
	 * @param service
	 */
	public void setSolicitud(ISolicitudAclaracionesService service) {
		iSolicitudAclaracionesService = service;
		
	}

	
}
