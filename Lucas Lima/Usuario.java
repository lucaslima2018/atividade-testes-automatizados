

public class Usuario {
    private String usuario;

   
    public Usuario(String usuario) {
        this.usuario = usuario;
    }

    public String getUser() {
        return usuario;
    }

    public void realizarLogin(String usuario1) {
        if (usuario1 == usuario) {
            System.out.println("Acesso Concedido!");;
        } else {
            throw new IllegalArgumentException("Usuário e/ou senha inválidos!");
        }
    }

    
}
