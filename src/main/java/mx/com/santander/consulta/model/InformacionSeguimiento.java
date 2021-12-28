package mx.com.santander.consulta.model;

import java.io.Serializable;

import lombok.Data;

/**
 * @author Anzen
 *
 */
@Data
public class InformacionSeguimiento implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	String codStatSegui; 
	String dscStatSegui; 
	String dscStatMarca;
	String fchContaSeg; 
	String fchCobroPol;
	String fchDocum;
	String flgNeteo; 
	int impPmaNeteo;
	int numPorcePond;
	int impPmaPond; 
	int impRcbosCancel;
	String dscObser; 
	int statusCode;
	String statusDesc;

}
