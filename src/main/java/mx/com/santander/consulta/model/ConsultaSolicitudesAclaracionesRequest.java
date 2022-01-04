package mx.com.santander.consulta.model;

import java.io.Serializable;

import lombok.Data;


/**
 * @author Anzen
 *
 */
@Data
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
