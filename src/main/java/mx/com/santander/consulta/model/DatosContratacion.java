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
public class DatosContratacion implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * int idRegion
	 */
	private int idRegion;
	
	/**
	 * String dscRegion
	 */
	private String dscRegion;
	
	/**
	 * int idZona
	 */
	private int idZona;
	
	/**
	 * String dscZona
	 */
	private String dscZona;
	
	/**
	 * int idSucur
	 */
	private int idSucur;
	
	/**
	 * String dscSucur
	 */
	private String dscSucur;
	
	/**
	 * Double impPrima100
	 */
	private Double impPrima100;
	
	/**
	 * Long numCtaPrefClnteContr
	 */
	private Long numCtaPrefClnteContr;

}
