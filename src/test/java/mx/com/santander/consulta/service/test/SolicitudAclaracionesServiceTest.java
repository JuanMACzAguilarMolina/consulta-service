package mx.com.santander.consulta.service.test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import mx.com.santander.consulta.dao.ISolicitudAclaracionesRepository;
import mx.com.santander.consulta.model.ConsultaSolicitudAclaracionesResponse;
import mx.com.santander.consulta.model.ConsultaSolicitudesAclaracionesRequest;
import mx.com.santander.consulta.model.DatosContratacion;
import mx.com.santander.consulta.model.DatosEjecutivo;
import mx.com.santander.consulta.model.InformacionContratante;
import mx.com.santander.consulta.model.InformacionGeneral;
import mx.com.santander.consulta.model.InformacionSeguimiento;
import mx.com.santander.consulta.service.ISolicitudAclaracionesService;
import mx.com.santander.consulta.service.SolicitudAclaracionesService;

class SolicitudAclaracionesServiceTest {

	private ISolicitudAclaracionesRepository solicitud;

	private ISolicitudAclaracionesService iSolicitudAclaracionesService = new SolicitudAclaracionesService();

	@BeforeEach
	void setUp() throws Exception {
		solicitud =Mockito.mock(ISolicitudAclaracionesRepository.class);
		iSolicitudAclaracionesService.setRepository(solicitud);
	}

	@Test
	void test() throws ParseException {
		ConsultaSolicitudesAclaracionesRequest request = new ConsultaSolicitudesAclaracionesRequest();
		ConsultaSolicitudAclaracionesResponse aclaraciones = new ConsultaSolicitudAclaracionesResponse();

		request.setIdApp("RC");
		request.setIdCanal(1);
		request.setIdRamo(13);
		request.setNumPol("14570");

		SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");

		InformacionGeneral informacionGeneral = new InformacionGeneral();
		DatosContratacion datosContratacion = new DatosContratacion();
		DatosEjecutivo datosEjecutivo = new DatosEjecutivo();
		InformacionContratante informacionContratante = new InformacionContratante();
		InformacionSeguimiento informacionSeguimiento = new InformacionSeguimiento();

		informacionGeneral.setIdApp("RC");
		informacionGeneral.setDscApp("RECTOR");
		informacionGeneral.setIdCanal(1);
		informacionGeneral.setDscCanal("RED SANTANDER");
		informacionGeneral.setIdRamo(13);
		informacionGeneral.setDscRamo("SUPER BLINDAJE PLUS REDISE?O");
		informacionGeneral.setNumPol("14573");
		informacionGeneral.setIdStatPol(12);
		informacionGeneral.setDscStatPol("TERMINADA");
		informacionGeneral.setIdFormaPago(3);
		informacionGeneral.setDscFormaPago("SEMESTRAL");
		informacionGeneral.setIdMtvoCancel(12);
		informacionGeneral.setDscMtvoCancel("CANCELACIÃ¿N DE PÃ¿LIZA");
		informacionGeneral.setIdMedioPago("T");
		informacionGeneral.setDscMedioPago("TARJETA DE CREDITO");
		informacionGeneral.setFchSuscPol(formato.parse("2020-09-04 00:00:00"));
		informacionGeneral.setFchVigHastaPol(formato.parse("2021-09-04 00:00:00"));
		informacionGeneral.setFchRehabPol(null);
		informacionGeneral.setFchCancelPol(null);

		datosContratacion.setIdRegion(0);
		datosContratacion.setDscRegion("SIN REGION");
		datosContratacion.setIdZona(0);
		datosContratacion.setDscZona("Sin Zona");
		datosContratacion.setIdSucur(9002);
		datosContratacion.setDscSucur("PRUEBAS");
		datosContratacion.setImpPrima100(4592.61);

		datosEjecutivo.setIdNomina(10065);
		datosEjecutivo.setIdEjtvoEmite("10065");
		datosEjecutivo.setTxtNombEjtvo("BONIFAZ BERNON FABIOLA");
		datosEjecutivo.setNumOficEjctvo(null);

		informacionContratante.setTxtBucClnteContr("52145824");
		informacionContratante.setTxtNombClnteContr("SALESVER/ADIONVER/AMARILIS");
		informacionContratante.setIdSgmtoClnteContr(0);
		informacionContratante.setDscSgmtoBanco("Otro");
		informacionContratante.setDscSgmtoClnte("SIN SEGMENTO");
		informacionContratante.setDscMdlAtnSgmtoBanco("N/A");

		informacionSeguimiento.setCodStatSegui(null);
		informacionSeguimiento.setDscStatSegui(null);
		informacionSeguimiento.setDscStatMarca(null);
		informacionSeguimiento.setFchContaSeg(null);
		informacionSeguimiento.setFchCobroPol(formato.parse("2020-09-29 00:00:00"));
		informacionSeguimiento.setFchDocum(null);
		informacionSeguimiento.setFlgNeteo(null);
		informacionSeguimiento.setImpPmaNeteo(0);
		informacionSeguimiento.setNumPorcePond(0);
		informacionSeguimiento.setImpPmaPond(0);
		informacionSeguimiento.setImpRcbosCancel(0);
		informacionSeguimiento.setDscObser(null);
		informacionSeguimiento.setStatusCode(0);
		informacionSeguimiento.setStatusDesc("OK");

		aclaraciones.setInformacionGeneral(informacionGeneral);
		aclaraciones.setDatosContratacion(datosContratacion);
		aclaraciones.setDatosEjecutivo(datosEjecutivo);
		aclaraciones.setInformacionContratante(informacionContratante);
		aclaraciones.setInformacionSeguimiento(informacionSeguimiento);
		
		when (solicitud.getConsulta(request)).thenReturn(aclaraciones);
		ConsultaSolicitudAclaracionesResponse response = iSolicitudAclaracionesService.getConsulta(request);
		
		assertEquals(aclaraciones, response);
	}

}
