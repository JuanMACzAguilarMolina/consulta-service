package mx.com.santander.consulta.model.test;

import static org.junit.jupiter.api.Assertions.assertEquals;



import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import mx.com.santander.consulta.model.DatosEjecutivo;


@RunWith(MockitoJUnitRunner.class)
class DatosEjecutivoTest {

	DatosEjecutivo ej = new DatosEjecutivo();

	@Test
	void datosEjecutivogetters() {

		ej.setIdEjtvoEmite(null);
		ej.setIdNomina(0);
		ej.setNumOficEjctvo(null);
		ej.setTxtNombEjtvo(null);

		assertEquals(null,ej.getIdEjtvoEmite());
		assertEquals(0,ej.getIdNomina());
		assertEquals(null,ej.getNumOficEjctvo());
		assertEquals(null,ej.getTxtNombEjtvo());

	}


}
