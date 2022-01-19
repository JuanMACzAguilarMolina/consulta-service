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
public class ConsultaSolicitudesAclaracionesRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String idApp;
	private int idCanal;
	private int idRamo;
	private String numPol;
	
}
