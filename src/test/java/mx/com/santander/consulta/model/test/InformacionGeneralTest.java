package mx.com.santander.consulta.model.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import mx.com.santander.consulta.model.InformacionGeneral;


@RunWith(MockitoJUnitRunner.class)
class InformacionGeneralTest {

	InformacionGeneral general = new InformacionGeneral();

	@Test
	void informacionGeneralTest() {

		general.setDscApp(null);
		general.setDscCanal(null);
		general.setDscFormaPago(null);
		general.setDscMedioPago(null);
		general.setDscMtvoCancel(null);
		general.setDscRamo(null);
		general.setDscStatPol(null);
		general.setFchCancelPol(null);
		general.setFchRehabPol(null);
		general.setFchSuscPol(null);
		general.setFchSuscPol(null);
		general.setFchVigHastaPol(null);
		general.setIdApp(null);
		general.setIdCanal(0);
		general.setIdFormaPago(0);
		general.setIdMedioPago(null);
		general.setIdMtvoCancel(0);
		general.setIdRamo(0);
		general.setIdRamo(0);
		general.setIdStatPol(0);
		general.setNumPol(null);

		assertEquals(null, general.getDscApp());
		assertEquals(null, general.getDscCanal());
		assertEquals(null, general.getDscFormaPago());
		assertEquals(null, general.getDscMedioPago());
		assertEquals(null, general.getDscMtvoCancel());
		assertEquals(null, general.getDscRamo());
		assertEquals(null, general.getDscStatPol());
		assertEquals(null, general.getFchCancelPol());
		assertEquals(null, general.getFchRehabPol());
		assertEquals(null, general.getFchSuscPol());
		assertEquals(null, general.getFchSuscPol());
		assertEquals(null, general.getFchVigHastaPol());
		assertEquals(null, general.getIdApp());
		assertEquals(0, general.getIdCanal());
		assertEquals(0, general.getIdFormaPago());
		assertEquals(null, general.getIdMedioPago());
		assertEquals(0, general.getIdMtvoCancel());
		assertEquals(0, general.getIdRamo());
		assertEquals(0, general.getIdRamo());
		assertEquals(0, general.getIdStatPol());
		assertEquals(null, general.getNumPol());

	}

}
