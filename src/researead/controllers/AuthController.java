package researead.controllers;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import researead.models.Database;
import researead.models.User;

public class AuthController  implements AuthBehaviour {
    private final Database db = new Database();
    
    @Override
     public boolean checkLogin(String email, String password) {
        String query = "SELECT * FROM tbl_user WHERE email = ? AND password = ?";
        try (
            PreparedStatement preparedStatement = db.getConnection().prepareStatement(query)
        ) {
            preparedStatement.setString(1, email);
            preparedStatement.setString(2, password);

            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) { // Return true jika ada baris yang sesuai, false jika tidak
                int userId = resultSet.getInt("userId");
                String username = resultSet.getString("username");
                AuthManager.setAuthenticatedUser(new User(username, email, password), userId);
                return true;
            } else {
                return false;
            } 
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
    }
     
    @Override
     public boolean handleRegister(String username, String email, String password) {
        String insertQuery = "INSERT INTO tbl_user (username, email, password) VALUES (?, ?, ?)";
        try (
            PreparedStatement preparedStatement = db.getConnection().prepareStatement(insertQuery)
        ) {
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, email);
            preparedStatement.setString(3, password);

            int affectedRows = preparedStatement.executeUpdate();
            return affectedRows > 0; // Return true if the insertion was successful
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
    }
}
