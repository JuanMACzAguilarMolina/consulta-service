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
public class DatosEjecutivo implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idNomina;
	private String idEjtvoEmite;
	private String txtNombEjtvo;
	private String numOficEjctvo;
	
}
