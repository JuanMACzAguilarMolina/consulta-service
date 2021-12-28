package mx.com.santander.consulta.model;

import java.io.Serializable;

import lombok.Data;

/**
 * @author Anzen
 *
 */
@Data
public class InformacionGeneral implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	String idApp;
	String dscApp;
	int idCanal;
	String dscCanal;
	int idRamo;
	String dscRamo;
	String numPol;
	int idStatPol;
	String dscStatPol;
	int idFormaPago;
	String dscFormaPago;
	int idMtvoCancel;
	String dscMtvoCancel;
	String idMedioPago;
	String dscMedioPago;
	String fchSuscPol;
	String fchVigHastaPol;
	String fchRehabPol;
	String fchCancelPol;

}
