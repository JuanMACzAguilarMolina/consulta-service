package mx.com.santander.consulta.model.test;

import static org.junit.jupiter.api.Assertions.assertEquals;



import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import mx.com.santander.consulta.model.ConsultaSolicitudAclaracionesResponse;
import mx.com.santander.consulta.model.DatosContratacion;
import mx.com.santander.consulta.model.DatosEjecutivo;
import mx.com.santander.consulta.model.InformacionContratante;
import mx.com.santander.consulta.model.InformacionGeneral;
import mx.com.santander.consulta.model.InformacionSeguimiento;

@RunWith(MockitoJUnitRunner.class)
class ConsultaSolicitudAclaracionesResponseTest {

	ConsultaSolicitudAclaracionesResponse res = new ConsultaSolicitudAclaracionesResponse();
	
	InformacionGeneral informacionGeneral = new InformacionGeneral();
	DatosContratacion datosContratacion = new DatosContratacion();
	DatosEjecutivo datosEjecutivo = new DatosEjecutivo();
	InformacionContratante informacionContratante = new InformacionContratante();
	InformacionSeguimiento informacionSeguimiento = new InformacionSeguimiento();

	@Test
	void informacionSegumientogetters() {

		res.setDatosContratacion(datosContratacion);
		res.setDatosEjecutivo(datosEjecutivo);
		res.setInformacionContratante(informacionContratante);
		res.setInformacionGeneral(informacionGeneral);
		res.setInformacionSeguimiento(informacionSeguimiento);	

		assertEquals(datosContratacion,res.getDatosContratacion());
		assertEquals(datosEjecutivo,res.getDatosEjecutivo());
		assertEquals(informacionContratante,res.getInformacionContratante());
		assertEquals(informacionGeneral,res.getInformacionGeneral());
		assertEquals(informacionSeguimiento,res.getInformacionSeguimiento());



	}


}