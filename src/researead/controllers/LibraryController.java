package researead.controllers;

import researead.models.Database;
import researead.models.Book;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import researead.models.LibraryModel;

public class LibraryController {
    private final Database db = new Database();
    
    public LibraryModel getUserLibraryInDB(int userId) {
        LibraryModel userLibrary = new LibraryModel();
        String query = "SELECT * FROM tbl_book WHERE userId = ?";
        
        try (
            PreparedStatement preparedStatement = db.getConnection().prepareStatement(query)
        ) {
            preparedStatement.setInt(1, userId);
            
            ResultSet resultSet = preparedStatement.executeQuery();
            
            while (resultSet.next()) {
                String title = resultSet.getString("title");
                String author = resultSet.getString("author");
                String status = resultSet.getString("status");
                int currentPage = resultSet.getInt("currentPage");
                int totalPage = resultSet.getInt("totalPage");
                byte[] coverBook = resultSet.getBytes("coverBook");

                Book book = new Book(title, author, status, currentPage, totalPage, coverBook);
                userLibrary.addBook(title, book);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return userLibrary;
    }
    
    // public void getUserLibraryByStatus();
}
