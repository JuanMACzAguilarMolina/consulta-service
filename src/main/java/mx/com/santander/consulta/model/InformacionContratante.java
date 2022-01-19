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
public class InformacionContratante implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * String txtBucClnteContr
	 */
	private String txtBucClnteContr;
	
	/**
	 * String txtNombClnteContr
	 */
	private String txtNombClnteContr;
	
	/**
	 * int idSgmtoClnteContr
	 */
	private int idSgmtoClnteContr;
	
	/**
	 * String dscSgmtoBanco
	 */
	private String dscSgmtoBanco;
	
	/**
	 * String dscSgmtoClnte
	 */
	private String dscSgmtoClnte;
	
	/**
	 * String dscMdlAtnSgmtoBanco
	 */
	private String dscMdlAtnSgmtoBanco;

}
