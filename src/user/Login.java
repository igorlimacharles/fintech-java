package user;

public class Login {
    private UserRegistration userRegistration;

    public Login(UserRegistration userRegistration) {
        this.userRegistration = userRegistration;
    }

    public boolean verifyCredentials(String username, String password) {
        if (userRegistration.isUserRegistered(username)) {
            String storedPassword = userRegistration.getPassword(username);
            return storedPassword.equals(password);
        } else {
            System.out.println("Erro: Usuário não cadastrado!");
            return false;
        }
    }
}