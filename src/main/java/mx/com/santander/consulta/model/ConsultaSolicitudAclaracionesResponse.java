package mx.com.santander.consulta.model;

import java.io.Serializable;


import lombok.Data;
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

	private InformacionGeneral informacionGeneral;
	private DatosContratacion datosContratacion;
	private DatosEjecutivo datosEjecutivo;
	private InformacionContratante informacionContratante;
	private InformacionSeguimiento informacionSeguimiento;

	
}
