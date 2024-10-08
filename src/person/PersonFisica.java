package person;

import user.UsuarioBase;

// PersonFisica herda de Person
public class PersonFisica extends Person {
    private String cpf;
    private String dataNascimento;

    public PersonFisica(int id, String endereco, String telefone, UsuarioBase usuario, String cpf, String dataNascimento) {
        super(id, endereco, telefone, usuario);
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Person Física: " + getUsuario().getNome() + ", CPF: " + cpf);
    }
}
