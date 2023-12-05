

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class UsuarioTeste {

    private Usuario usuario;

    @Before
    public void setUp() {
        usuario = new Usuario("Joao");
    }

    @Test
    public void testeLogin() {
        assertEquals("Joao", usuario.getUser());
    }
    
}