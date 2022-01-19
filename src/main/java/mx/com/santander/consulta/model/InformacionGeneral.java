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
public class InformacionGeneral implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * String idApp
	 */
	private String idApp;
	
	/**
	 * String dscApp
	 */
	private String dscApp;
	
	/**
	 * int idCanal
	 */
	private int idCanal;
	
	/**
	 * String dscCanal
	 */
	private String dscCanal;
	
	/**
	 * int idRamo
	 */
	private int idRamo;
	
	/**
	 * String dscRamo;
	 */
	private String dscRamo;
	
	/**
	 * String numPol
	 */
	private String numPol;
	
	/**
	 * int idStatPol
	 */
	private int idStatPol;
	
	/**
	 * String dscStatPol
	 */
	private String dscStatPol;
	
	/**
	 * int idFormaPago
	 */
	private int idFormaPago;
	
	/**
	 * String dscFormaPago
	 */
	private String dscFormaPago;
	
	/**
	 * int idMtvoCancel
	 */
	private int idMtvoCancel;
	
	/**
	 * String dscMtvoCancel
	 */
	private String dscMtvoCancel;
	
	/**
	 * String idMedioPago
	 */
	private String idMedioPago;
	
	/**
	 * String dscMedioPago
	 */
	private String dscMedioPago;
	
	/**
	 * Date fchSuscPol
	 */
	@JsonFormat(pattern ="yyyyMMdd")
	private Date fchSuscPol;
	
	/**
	 * Date fchVigHastaPol
	 */
	@JsonFormat(pattern ="yyyyMMdd")
	private Date fchVigHastaPol;
	
	/**
	 * Date fchRehabPol
	 */
	@JsonFormat(pattern ="yyyyMMdd")
	private Date fchRehabPol;
	
	/**
	 * Date fchCancelPol
	 */
	@JsonFormat(pattern ="yyyyMMdd")
	private Date fchCancelPol;

}
