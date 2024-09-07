package user;

import java.util.HashMap;


public abstract class UserRegistration {
    protected HashMap<String, String> userDatabase = new HashMap<>();

    // Método abstrato para registrar usuário
    public abstract void registerUser(String username, String password);

    // Verifica se o usuário está registrado
    public boolean isUserRegistered(String username) {
        return userDatabase.containsKey(username);
    }

    // Obtém a senha do usuário
    public String getPassword(String username) {
        return userDatabase.get(username);
    }
}
