package researead.controllers;

public interface AuthBehaviour {
    boolean checkLogin(String email, String password);
    boolean handleRegister(String username, String email, String password);
}
