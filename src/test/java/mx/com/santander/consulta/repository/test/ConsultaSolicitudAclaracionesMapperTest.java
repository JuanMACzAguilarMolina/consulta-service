package mx.com.santander.consulta.dao.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import mx.com.santander.consulta.dao.ConsultaSolicitudAclaracionesMapper;
import mx.com.santander.consulta.model.ConsultaSolicitudAclaracionesResponse;

/**
 * @author Anzen
 *
 */
class ConsultaSolicitudAclaracionesMapperTest {
	
	@Mock
    private ResultSet rs;

    @InjectMocks
    private ConsultaSolicitudAclaracionesMapper mapper;

	/**
	 * @throws Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		MockitoAnnotations.openMocks(this);
	}
	

	/**
	 * @throws SQLException
	 * @throws ParseException
	 */
	@Test
	void test() throws SQLException, ParseException {
		
		when(this.rs.getString("idApp")).thenReturn("RC");
		

        ConsultaSolicitudAclaracionesResponse response = this.mapper.mapRow(this.rs, 1);
        assertNotNull(response);
	}

}
