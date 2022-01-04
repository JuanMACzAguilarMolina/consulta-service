package mx.com.santander.consulta;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.text.SimpleDateFormat;

import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;

import mx.com.santander.consulta.controller.SolicitudAclaracionesController;
import mx.com.santander.consulta.model.ConsultaSolicitudAclaracionesResponse;
import mx.com.santander.consulta.model.ConsultaSolicitudesAclaracionesRequest;
import mx.com.santander.consulta.model.DatosContratacion;
import mx.com.santander.consulta.model.DatosEjecutivo;
import mx.com.santander.consulta.model.InformacionContratante;
import mx.com.santander.consulta.model.InformacionGeneral;
import mx.com.santander.consulta.model.InformacionSeguimiento;
import mx.com.santander.consulta.service.ISolicitudAclaracionesService;

@WebMvcTest(SolicitudAclaracionesController.class)
class SolicitudAclaracionesControllerTest {
	
	@Autowired
	private MockMvc mockMvc;
	

	@MockBean
	private ISolicitudAclaracionesService service;
	
	private static ObjectMapper mapper = new ObjectMapper();
	
	@Test
	void solicitudAclaracionesGet() throws Exception{
		
		SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
		
		ConsultaSolicitudAclaracionesResponse consulta = new ConsultaSolicitudAclaracionesResponse();
		
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
		
		consulta.setInformacionGeneral(informacionGeneral);
		consulta.setDatosContratacion(datosContratacion);
		consulta.setDatosEjecutivo(datosEjecutivo);
		consulta.setInformacionContratante(informacionContratante);
		consulta.setInformacionSeguimiento(informacionSeguimiento);
		
		ConsultaSolicitudesAclaracionesRequest request = new ConsultaSolicitudesAclaracionesRequest();
		
		request.setIdApp("RC");
		request.setIdCanal(1);
		request.setIdRamo(13);
		request.setNumPol("14570");
		
		Mockito.when(service.getConsulta(request)).thenReturn(consulta);
		String json = mapper.writeValueAsString(request);
		mockMvc.perform(get("/aclaraciones/consultas/consultar").contentType(MediaType.APPLICATION_JSON).characterEncoding("utf-8")
				.content(json).accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk());
 }
	
	
	@Test
	void solicitudAclaracionesGetError() throws Exception{
		ConsultaSolicitudesAclaracionesRequest request = new ConsultaSolicitudesAclaracionesRequest();
		Mockito.when(service.getConsulta(ArgumentMatchers.any())).thenThrow();
		String json = mapper.writeValueAsString(request);
		mockMvc.perform(get("/aclaraciones/consultas/consultar").contentType(MediaType.APPLICATION_JSON).characterEncoding("utf-8")
				.content(json).accept(MediaType.APPLICATION_JSON)).andExpect(status().isNotFound());

	}
	
}
