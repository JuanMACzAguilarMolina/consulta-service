package mx.com.santander.consulta.model;

import java.io.Serializable;

import lombok.Data;
/**
 * @author Anzen
 *
 */
@Data
public class DatosContratacion implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int idRegion;
	String dscRegion;
	int idZona;
	String dscZona;
	int idSucur;
	String dscSucur;
	Double impPrima100;
	Long numCtaPrefClnteContr;

}
