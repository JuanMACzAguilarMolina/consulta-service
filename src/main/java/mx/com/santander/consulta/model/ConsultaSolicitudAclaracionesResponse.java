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

	private InformacionGeneral informacionGeneral;
	private DatosContratacion datosContratacion;
	private DatosEjecutivo datosEjecutivo;
	private InformacionContratante informacionContratante;
	private InformacionSeguimiento informacionSeguimiento;

	
}
