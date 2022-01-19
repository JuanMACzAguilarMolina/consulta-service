package mx.com.santander.consulta.model;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

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
	
	/**
	 * String codStatSegui
	 */
	private String codStatSegui; 
	
	/**
	 * String dscStatSegui
	 */
	private String dscStatSegui;
	
	/**
	 * String dscStatMarca
	 */
	private String dscStatMarca;
	
	/**
	 * Date fchContaSeg
	 */
	@JsonFormat(pattern ="yyyyMMdd")
	private Date fchContaSeg; 
	
	/**
	 * Date fchCobroPol
	 */
	@JsonFormat(pattern ="yyyyMMdd")
	private Date fchCobroPol;
	
	/**
	 * Date fchDocum
	 */
	@JsonFormat(pattern ="yyyyMMdd")
	private Date fchDocum;
	
	/**
	 * String flgNeteo
	 */
	private String flgNeteo; 
	
	/**
	 * int impPmaNeteo
	 */
	private int impPmaNeteo;
	
	/**
	 * int numPorcePond
	 */
	private int numPorcePond;
	
	/**
	 * int impPmaPond
	 */
	private int impPmaPond; 
	
	/**
	 * int impRcbosCancel
	 */
	private int impRcbosCancel;
	
	/**
	 * String dscObser
	 */
	private String dscObser; 
	
	/**
	 * int statusCode
	 */
	private int statusCode;
	
	/**
	 * String statusDesc
	 */
	private String statusDesc;

}
