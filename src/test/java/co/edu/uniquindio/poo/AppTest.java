/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

    /**
     * Rigorous Test :-)
     */
    @Test
    public void testDatosCompletos() {
        LOG.info("Iniciado test datos completos");
        Contacto contacto = new Contacto("John Doe", "johndoe", "Calle 123", "1234567890", "johndoe@example.com");
        assertEquals("el contacto es: nombre=John Doe, alias=johndoe, direccion=Calle 123, telefono=1234567890, email=johndoe@example.com", contacto.toString());
        LOG.info("finalizando test datos completos");
    }
    
    @Test
    public void datosVacios() {
        LOG.info("Iniciado test datosVacios");

        assertThrows(Throwable.class, ()-> new Contacto(" ", " ", " ", " ", " "));

        LOG.info("Finalizando test datosVacios");
    }
    @Test
    public void validacionCorreo() {
        LOG.info("Iniciado test validacionCorreo");

        assertThrows(Throwable.class, ()-> new Contacto("Pedro juan", "Peter albeiro", "Calle 78589", "5555555555", "pedrogmail.com"));

        LOG.info("Finalizando test validacionCorreo");
    }
}




