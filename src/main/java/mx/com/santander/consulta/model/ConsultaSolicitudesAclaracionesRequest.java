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

	String idApp;
	int idCanal;
	int idRamo;
	String numPol;
	
}
