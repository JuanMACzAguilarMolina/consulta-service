package mx.com.santander.consulta.integrales;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatchers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.mockito.ArgumentMatchers.eq;

import org.springframework.web.context.WebApplicationContext;

import lombok.extern.slf4j.Slf4j;
import mx.com.santander.consulta.ConsultaServiceApplication;
import mx.com.santander.consulta.constants.Constants;
import mx.com.santander.consulta.consultas.ConsultaReporte;
import mx.com.santander.consulta.model.ConsultaSolicitudAclaracionesResponse;
import mx.com.santander.consulta.model.DatosContratacion;
import mx.com.santander.consulta.model.DatosEjecutivo;
import mx.com.santander.consulta.model.InformacionContratante;
import mx.com.santander.consulta.model.InformacionGeneral;
import mx.com.santander.consulta.model.InformacionSeguimiento;

//@Slf4j
//@Import({ BuildProperties.class })
//@WebMvcTest(SolicitudAclaracionesController.class)
@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ConsultaServiceApplication.class)
@WebAppConfiguration
class ControllerIntTest {

	
	private MockMvc mockMvc;

	@Autowired
	private WebApplicationContext webApplicationContext;
	
	@MockBean
	private JdbcTemplate jdbcTemplate;

	@MockBean
	private ConsultaReporte consultaReporte;

	private final static String REQUEST_ACLARACIONES = "{\n" + "                \"idApp\": \"RC\",\n"
			+ "                \"idCanal\": \"1\",\n" + "                \"idRamo\": \"13\",\n"
			+ "                \"numPol\": \"14573\",\n" + "}";

	
	@BeforeEach
	void setUp() throws ParseException {
		//Inicializa el Mock
		this.mockMvc = MockMvcBuilders.webAppContextSetup(this.webApplicationContext).build();
		
		//Objeto query
		String query= consultaReporte.getGetAclaraciones();
		
		//Objetos retornados por llamadas a query
		
		SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
	
		ConsultaSolicitudAclaracionesResponse infoAclaracion = new ConsultaSolicitudAclaracionesResponse();
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
		
		infoAclaracion.setInformacionGeneral(informacionGeneral);
    	infoAclaracion.setDatosContratacion(datosContratacion);
		infoAclaracion.setDatosEjecutivo(datosEjecutivo);
		infoAclaracion.setInformacionContratante(informacionContratante);
		infoAclaracion.setInformacionSeguimiento(informacionSeguimiento);
		
		//Comportamiento de configuración
		when(consultaReporte.getGetAclaraciones()).thenReturn(query);
		
		//Comportamiento de jdbcTemplate
		when(jdbcTemplate.queryForObject(eq(query),eq(ConsultaSolicitudAclaracionesResponse.class),ArgumentMatchers.any()))
		.thenReturn(infoAclaracion);
	}
	
//	@Test
//	void consultaAclaraciones() {
//		callService(HttpMethod.GET,200, Constants.ENDPOINT_GENERAL_ACLARACIONES + Constants.ENDPOINT_CONSULTA, REQUEST_ACLARACIONES);
//	}
	
	
	
	/**
	 * Realiza una llamada a un servicio
	 * @author Agilethought
	 * @param method el método HTTP que se va a usar (GET,POST,PUT,etc..)
	 * @param status código de estatus HTTP que se espera de la ejecución de la petición
	 * @param uri del recurso a consultar
	 * @param body objeto que usará la uri para hacer la petición
	 */	
	private void callService(HttpMethod method, int status, String uri, String body) {
		log.info("*********************************************************************************************************************");
		log.info("INICIA callService {}: {}", method, uri);
		try {
			MvcResult result;
			MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.request(method, uri)
					.contentType(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON);
			if (body != null) {
				builder.content(body);
			}
			result = mockMvc.perform(builder).andExpect(status().is(status)).andReturn();
			String resultDOW = result.getResponse().getContentAsString();
			log.debug("response: {}", resultDOW);
			assertNotNull(resultDOW);
			
		} catch (Exception ex) {
			log.error("Exception", ex);
		}
		
		log.info("FINALIZA callService");
		log.info("*********************************************************************************************************************");
	}
	
}