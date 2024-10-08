package person;
import user.UsuarioBase;

abstract class Person {
    private int id;
    private String endereco;
    private String telefone;
    private UsuarioBase usuario;

    public Person(int id, String endereco, String telefone, UsuarioBase usuario) {
        this.id = id;
        this.endereco = endereco;
        this.telefone = telefone;
        this.usuario = usuario;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public UsuarioBase getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioBase usuario) {
        this.usuario = usuario;
    }

    public abstract void exibirInfo();
}

