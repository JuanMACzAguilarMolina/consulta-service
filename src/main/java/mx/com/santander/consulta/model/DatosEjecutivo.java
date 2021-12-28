package mx.com.santander.consulta.model;

import java.io.Serializable;

import lombok.Data;

/**
 * @author Anzen
 *
 */
@Data
public class DatosEjecutivo implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int idNomina;
	String idEjtvoEmite;
	String txtNombEjtvo;
	String numOficEjctvo;
	
}
