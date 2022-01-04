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
	
	private String txtBucClnteContr;
	private String txtNombClnteContr;
	private int idSgmtoClnteContr;
	private String dscSgmtoBanco;
	private String dscSgmtoClnte;
	private String dscMdlAtnSgmtoBanco;

}
