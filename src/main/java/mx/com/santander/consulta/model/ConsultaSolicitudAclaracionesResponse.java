package mx.com.santander.consulta.model;

import java.io.Serializable;


import lombok.Data;

/**
 * @author Anzen
 *
 */
@Data
public class ConsultaSolicitudAclaracionesResponse implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	InformacionGeneral informacionGeneral;
	DatosContratacion datosContratacion;
	DatosEjecutivo datosEjecutivo;
	InformacionContratante informacionContratante;
	InformacionSeguimiento informacionSeguimiento;

	
}
