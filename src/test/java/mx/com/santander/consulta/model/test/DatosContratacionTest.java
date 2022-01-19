package mx.com.santander.consulta.model.test;

import static org.junit.jupiter.api.Assertions.assertEquals;



import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import mx.com.santander.consulta.model.DatosContratacion;



@RunWith(MockitoJUnitRunner.class)
class DatosContratacionTest {

	DatosContratacion cont = new DatosContratacion();

	@Test
	void datosContrataciongetters() {
		
		cont.setDscRegion(null);
		cont.setDscSucur(null);
		cont.setDscZona(null);
		cont.setIdRegion(0);
		cont.setIdSucur(0);
		cont.setIdZona(0);
		cont.setImpPrima100(null);
		cont.setNumCtaPrefClnteContr(null);
	
	    assertEquals(null,cont.getDscRegion());
	    assertEquals(null,cont.getDscSucur());
	    assertEquals(null,cont.getDscZona());
	    assertEquals(0,cont.getIdRegion());
	    assertEquals(0,cont.getIdSucur());
	    assertEquals(0,cont.getIdZona());
	    assertEquals(null,cont.getImpPrima100());
	    assertEquals(null,cont.getNumCtaPrefClnteContr());
	    
		

	}


}
