
import java.util.ArrayList;
import java.util.List;

public class Sistema {

    private List<Usuario> usuarios;

    public Sistema() {
        usuarios = new ArrayList<Usuario>();
    }

    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public List<Usuario> getUsers() {
        return usuarios;
    }
}