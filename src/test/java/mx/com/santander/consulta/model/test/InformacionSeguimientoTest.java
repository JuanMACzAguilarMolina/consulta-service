package mx.com.santander.consulta.model.test;

import static org.junit.jupiter.api.Assertions.assertEquals;



import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;


import mx.com.santander.consulta.model.InformacionSeguimiento;

@RunWith(MockitoJUnitRunner.class)
class InformacionSeguimientoTest {

	InformacionSeguimiento seguimiento = new InformacionSeguimiento();

	@Test
	void informacionSegumientogetters() {

		seguimiento.setCodStatSegui(null);
		seguimiento.setDscObser(null);
		seguimiento.setDscStatMarca(null);
		seguimiento.setDscStatSegui(null);
		seguimiento.setFchCobroPol(null);
		seguimiento.setFchContaSeg(null);
		seguimiento.setFchDocum(null);
		seguimiento.setFlgNeteo(null);
		seguimiento.setImpPmaNeteo(0);
		seguimiento.setImpPmaPond(0);
		seguimiento.setImpRcbosCancel(0);
		seguimiento.setNumPorcePond(0);
		seguimiento.setStatusCode(0);
		seguimiento.setStatusDesc(null);



		assertEquals(null,seguimiento.getCodStatSegui());
		assertEquals(null,seguimiento.getDscObser());
		assertEquals(null,seguimiento.getDscStatMarca());
		assertEquals(null,seguimiento.getDscStatSegui());
		assertEquals(null,seguimiento.getFchCobroPol());
		assertEquals(null,seguimiento.getFchContaSeg());
		assertEquals(null,seguimiento.getFchDocum());
		assertEquals(null,seguimiento.getFlgNeteo());
		assertEquals(0,seguimiento.getImpPmaNeteo());
		assertEquals(0,seguimiento.getImpPmaPond());
		assertEquals(0,seguimiento.getImpRcbosCancel());
		assertEquals(0,seguimiento.getNumPorcePond());
		assertEquals(0,seguimiento.getStatusCode());
		assertEquals(null,seguimiento.getStatusDesc());



	}


}
