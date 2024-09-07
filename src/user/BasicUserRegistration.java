package user;

public class BasicUserRegistration extends UserRegistration {

    @Override
    public void registerUser(String username, String password) {
        if (userDatabase.containsKey(username)) {
            System.out.println("Erro: Usuário já cadastrado!");
        } else {
            userDatabase.put(username, password);
            System.out.println("Usuário básico cadastrado com sucesso!");
        }
    }
}
