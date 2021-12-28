package mx.com.santander.consulta.model;

import java.io.Serializable;

import lombok.Data;

/**
 * @author Anzen
 *
 */
@Data
public class InformacionContratante implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	String txtBucClnteContr;
	String txtNombClnteContr;
	int idSgmtoClnteContr;
	String dscSgmtoBanco;
	String dscSgmtoClnte;
	String dscMdlAtnSgmtoBanco;

}
