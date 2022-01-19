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
public class DatosEjecutivo implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * int idNomina
	 */
	private int idNomina;
	
	/**
	 * String idEjtvoEmite
	 */
	private String idEjtvoEmite;
	
	/**
	 * String txtNombEjtvo
	 */
	private String txtNombEjtvo;
	
	/**
	 * String numOficEjctvo
	 */
	private String numOficEjctvo;
	
}
