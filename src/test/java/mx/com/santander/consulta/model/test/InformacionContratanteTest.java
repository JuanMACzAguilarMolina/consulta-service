package mx.com.santander.consulta.model.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import mx.com.santander.consulta.model.InformacionContratante;

@RunWith(MockitoJUnitRunner.class)
class InformacionContratanteTest {

	InformacionContratante con = new InformacionContratante();

	@Test
	void informacionContratantegetters() {

		con.setDscMdlAtnSgmtoBanco(null);
		con.setDscSgmtoBanco(null);
		con.setDscSgmtoClnte(null);
		con.setIdSgmtoClnteContr(0);
		con.setTxtBucClnteContr(null);
		con.setTxtNombClnteContr(null);

		assertEquals(null, con.getDscMdlAtnSgmtoBanco());
		assertEquals(null, con.getDscSgmtoBanco());
		assertEquals(null, con.getDscSgmtoClnte());
		assertEquals(0, con.getIdSgmtoClnteContr());
		assertEquals(null, con.getTxtBucClnteContr());
		assertEquals(null, con.getTxtNombClnteContr());

	}

}