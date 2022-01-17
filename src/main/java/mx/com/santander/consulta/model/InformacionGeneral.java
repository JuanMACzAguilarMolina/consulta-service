package mx.com.santander.consulta.model;

import java.io.Serializable;
import java.time.LocalDate;
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
public class InformacionGeneral implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String idApp;
	private String dscApp;
	private int idCanal;
	private String dscCanal;
	private int idRamo;
	private String dscRamo;
	private String numPol;
	private int idStatPol;
	private String dscStatPol;
	private int idFormaPago;
	private String dscFormaPago;
	private int idMtvoCancel;
	private String dscMtvoCancel;
	private String idMedioPago;
	private String dscMedioPago;
	
	@JsonFormat(pattern ="yyyyMMdd")
	private Date fchSuscPol;
	
	@JsonFormat(pattern ="yyyyMMdd")
	private Date fchVigHastaPol;
	
	@JsonFormat(pattern ="yyyyMMdd")
	private Date fchRehabPol;
	
	@JsonFormat(pattern ="yyyyMMdd")
	private Date fchCancelPol;

}
