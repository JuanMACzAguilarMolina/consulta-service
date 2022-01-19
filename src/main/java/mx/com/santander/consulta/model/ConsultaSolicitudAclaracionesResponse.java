package mx.com.santander.consulta.model;

import java.io.Serializable;


import lombok.Getter;
import lombok.Setter;

/**
 * @author Anzen
 *
 */
@Setter
@Getter
public class ConsultaSolicitudAclaracionesResponse implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Clase informacionGeneral
	 */
	private InformacionGeneral informacionGeneral;
	
	/**
	 * Clase datosContratacion
	 */
	private DatosContratacion datosContratacion;
	
	/**
	 * Clase datosEjecutivo
	 */
	private DatosEjecutivo datosEjecutivo;
	
	/**
	 * informacionContratante
	 */
	private InformacionContratante informacionContratante;
	
	/**
	 * Clase informacionSeguimiento
	 */
	private InformacionSeguimiento informacionSeguimiento;

	
}
