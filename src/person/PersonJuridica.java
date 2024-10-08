package person;

import user.UsuarioBase;

// PersonJuridica herda de Person
public class PersonJuridica extends Person {
    private String cnpj;
    private String razaoSocial;

    public PersonJuridica(int id, String endereco, String telefone, UsuarioBase usuario, String cnpj, String razaoSocial) {
        super(id, endereco, telefone, usuario);
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Person Jurídica: " + getUsuario().getNome() + ", CNPJ: " + cnpj);
    }
}
