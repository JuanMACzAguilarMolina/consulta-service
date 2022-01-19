package mx.com.santander.consulta.model;

import java.io.Serializable;


import lombok.Getter;
import lombok.Setter;
/**
 * @author Anzen
 *
 */
@Getter
@Setter
public class DatosContratacion implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idRegion;
	private String dscRegion;
	private int idZona;
	private String dscZona;
	private int idSucur;
	private String dscSucur;
	private Double impPrima100;
	private Long numCtaPrefClnteContr;

}
