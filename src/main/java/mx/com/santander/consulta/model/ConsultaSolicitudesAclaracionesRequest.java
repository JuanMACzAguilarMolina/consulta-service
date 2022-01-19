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

	/**
	 * String idApp
	 */
	private String idApp;
	
	/**
	 * int idCanal
	 */
	private int idCanal;
	
	/**
	 * int idRamo
	 */
	private int idRamo;
	
	/**
	 * String numPol
	 */
	private String numPol;
	
}
