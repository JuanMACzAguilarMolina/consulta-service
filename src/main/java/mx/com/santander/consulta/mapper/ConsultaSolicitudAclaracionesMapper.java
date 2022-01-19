package mx.com.santander.consulta.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import mx.com.santander.consulta.model.ConsultaSolicitudAclaracionesResponse;
import mx.com.santander.consulta.model.DatosContratacion;
import mx.com.santander.consulta.model.DatosEjecutivo;
import mx.com.santander.consulta.model.InformacionContratante;
import mx.com.santander.consulta.model.InformacionGeneral;
import mx.com.santander.consulta.model.InformacionSeguimiento;

public class ConsultaSolicitudAclaracionesMapper implements RowMapper<ConsultaSolicitudAclaracionesResponse> {

	@Override
	public ConsultaSolicitudAclaracionesResponse mapRow(ResultSet rs, int rowNum) throws SQLException {
		ConsultaSolicitudAclaracionesResponse consulta = new ConsultaSolicitudAclaracionesResponse();
		
		InformacionGeneral informacionGeneral = new InformacionGeneral();
		DatosContratacion datosContratacion = new DatosContratacion();
		DatosEjecutivo datosEjecutivo = new DatosEjecutivo();
		InformacionContratante informacionContratante = new InformacionContratante();
		InformacionSeguimiento informacionSeguimiento = new InformacionSeguimiento();
		
		informacionGeneral.setIdApp(rs.getString("idApp"));
		informacionGeneral.setDscApp(rs.getString("dscApp"));
		informacionGeneral.setIdCanal(rs.getInt("idCanal"));
		informacionGeneral.setDscCanal(rs.getString("dscCanal"));
		informacionGeneral.setIdRamo(rs.getInt("idRamo"));
		informacionGeneral.setDscRamo(rs.getString("dscRamo"));
		informacionGeneral.setNumPol(rs.getString("numPol"));
		informacionGeneral.setIdStatPol(rs.getInt("idStatPol"));
		informacionGeneral.setDscStatPol(rs.getString("dscStatPol"));
		informacionGeneral.setIdFormaPago(rs.getInt("idFormaPago"));
		informacionGeneral.setDscFormaPago(rs.getString("dscFormaPago"));
		informacionGeneral.setIdMtvoCancel(rs.getInt("idMtvoCancel"));
		informacionGeneral.setDscMtvoCancel(rs.getString("dscMtvoCancel"));
		informacionGeneral.setIdMedioPago(rs.getString("idMedioPago"));
		informacionGeneral.setDscMedioPago(rs.getString("dscMedioPago"));
		informacionGeneral.setFchSuscPol(rs.getDate("fchSuscPol"));
		informacionGeneral.setFchVigHastaPol(rs.getDate("fchVigHastaPol"));
		informacionGeneral.setFchRehabPol(rs.getDate("fchRehabPol"));
		informacionGeneral.setFchCancelPol(rs.getDate("fchCancelPol"));
		datosContratacion.setIdRegion(rs.getInt("idRegion"));
		datosContratacion.setDscRegion(rs.getString("dscRegion"));
		datosContratacion.setIdZona(rs.getInt("idZona"));
		datosContratacion.setDscZona(rs.getString("dscZona"));
		datosContratacion.setIdSucur(rs.getInt("idSucur"));
		datosContratacion.setDscSucur(rs.getString("dscSucur"));
		datosContratacion.setImpPrima100(rs.getDouble("impPrima100"));
		datosContratacion.setNumCtaPrefClnteContr(rs.getLong("numCtaPrefClnteContr"));
		
		datosEjecutivo.setIdNomina(rs.getInt("idNomina"));
		datosEjecutivo.setIdEjtvoEmite(rs.getString("idEjtvoEmite"));
		datosEjecutivo.setTxtNombEjtvo(rs.getString("txtNombEjtvo"));
		datosEjecutivo.setNumOficEjctvo(rs.getString("numOficEjctvo"));
		
		informacionContratante.setTxtBucClnteContr(rs.getString("txtBucClnteContr"));
		informacionContratante.setTxtNombClnteContr(rs.getString("txtNombClnteContr"));
		informacionContratante.setIdSgmtoClnteContr(rs.getInt("idSgmtoClnteContr"));
		informacionContratante.setDscSgmtoBanco(rs.getString("dscSgmtoBanco"));
		informacionContratante.setDscSgmtoClnte(rs.getString("dscSgmtoClnte"));
		informacionContratante.setDscMdlAtnSgmtoBanco(rs.getString("dscMdlAtnSgmtoBanco"));
		
		informacionSeguimiento.setCodStatSegui(rs.getString("codStatSegui"));
		informacionSeguimiento.setDscStatSegui(rs.getString("dscStatSegui"));
		informacionSeguimiento.setDscStatMarca(rs.getString("dscStatMarca"));
		informacionSeguimiento.setFchContaSeg(rs.getDate("fchContaSeg"));
		informacionSeguimiento.setFchCobroPol(rs.getDate("fchCobroPol"));
		informacionSeguimiento.setFchDocum(rs.getDate("fchDocum"));
		informacionSeguimiento.setFlgNeteo(rs.getString("flgNeteo"));
		informacionSeguimiento.setImpPmaNeteo(rs.getInt("impPmaNeteo"));
		informacionSeguimiento.setNumPorcePond(rs.getInt("numPorcePond"));
		informacionSeguimiento.setImpPmaPond(rs.getInt("impPmaPond"));
		informacionSeguimiento.setImpRcbosCancel(rs.getInt("impRcbosCancel"));
		informacionSeguimiento.setDscObser(rs.getString("dscObser"));
		informacionSeguimiento.setStatusCode(0);
		informacionSeguimiento.setStatusDesc("OK");
		
		consulta.setInformacionGeneral(informacionGeneral);
		consulta.setDatosContratacion(datosContratacion);
		consulta.setDatosEjecutivo(datosEjecutivo);
		consulta.setInformacionContratante(informacionContratante);
		consulta.setInformacionSeguimiento(informacionSeguimiento);
		return consulta;
	}

}
