import java.util.HashMap;

public class UserRegistration {
    // Um mapa para armazenar nome de usuário e senha
    private HashMap<String, String> userDatabase = new HashMap<>();

    // Metodo para cadastrar um novo usuário
    public void registerUser(String username, String password) {
        if (userDatabase.containsKey(username)) {
            System.out.println("Erro: Usuário já cadastrado!");
        } else {
            userDatabase.put(username, password);
            System.out.println("Usuário cadastrado com sucesso!");
        }
    }

    // Metodo para verificar se o usuário está cadastrado
    public boolean isUserRegistered(String username) {
        return userDatabase.containsKey(username);
    }

    // Metodo para obter a senha do usuário
    public String getPassword(String username) {
        return userDatabase.get(username);
    }
}