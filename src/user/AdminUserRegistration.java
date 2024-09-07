package user;

public class AdminUserRegistration extends UserRegistration {

    private static final String ADMIN_KEY = "SECRET_ADMIN_KEY";

    public void registerUser(String username, String password, String adminKey) {
        if (!ADMIN_KEY.equals(adminKey)) {
            System.out.println("Erro: Chave de administrador inválida!");
            return;
        }

        if (userDatabase.containsKey(username)) {
            System.out.println("Erro: Administrador já cadastrado!");
        } else {
            userDatabase.put(username, password);
            System.out.println("Administrador cadastrado com sucesso!");
        }
    }

    @Override
    public void registerUser(String username, String password) {
        // Este método não será usado para registrar administradores
        System.out.println("Use a chave de administrador para registrar.");
    }
}
