import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class SistemaTeste {

    private Sistema sistema;
    private Usuario usuario1;

    @Before
    public void setUp() {
        this.sistema = new Sistema();
        Usuario usuario1 = new Usuario("Joao");
    }

    @Test
    public void testeRealizarLogin() {
        this.sistema.adicionarUsuario(usuario1);

        assertEquals(usuario1, this.sistema.getUsers().get(0));
    }
    
}