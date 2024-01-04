package researead;

import researead.views.Login;

public class Researead {

    public static void main(String[] args) {
        // Initialize the UI 
        //Library library = new Library();

        // Set UI visibility to true
        //library.setVisible(true);
        
        // Initialize the UI and pass the Database and Mahasiswa objects
        Login login = new Login();

        // Set UI visibility to true
        
        login.setLocationRelativeTo(null);
        login.setVisible(true);
    }
}
