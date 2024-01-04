package researead.models;

public class User {
    private String username;
    private String email;
    private String password;
    private LibraryModel userLibrary;

    public User(String username, String email, String password) {
        this.username = username;
        this.email =  email;
        this.password = password;
        this.userLibrary = new LibraryModel();
    }
    
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public LibraryModel getLibrary() {
        return this.userLibrary;
    }
     public void setUserLibrary(LibraryModel userLibrary) {
        this.userLibrary = userLibrary;
    }
}
