package mx.com.santander.consulta.model;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Anzen
 *
 */
@Setter
@Getter
public class InformacionSeguimiento implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String codStatSegui; 
	private String dscStatSegui; 
	private String dscStatMarca;
	
	@JsonFormat(pattern ="yyyyMMdd")
	private Date fchContaSeg; 
	
	@JsonFormat(pattern ="yyyyMMdd")
	private Date fchCobroPol;
	
	@JsonFormat(pattern ="yyyyMMdd")
	private Date fchDocum;
	
	private String flgNeteo; 
	private int impPmaNeteo;
	private int numPorcePond;
	private int impPmaPond; 
	private int impRcbosCancel;
	private String dscObser; 
	private int statusCode;
	private String statusDesc;

}
