package researead.controllers;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import researead.models.Book;
import researead.models.Database;

public class BookController {
    private final Database db = new Database();
    
    public boolean addNewBook(Book newBook) {
        int userId = AuthManager.getAuthenticatedUserId();
       String insertQuery = "INSERT INTO tbl_book (userId, title, author, status, currentPage, totalPage, coverBook) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (
            PreparedStatement preparedStatement = db.getConnection().prepareStatement(insertQuery)
        ) {
            preparedStatement.setInt(1, userId);
            preparedStatement.setString(2, newBook.getTitle());
            preparedStatement.setString(3, newBook.getAuthor());
            preparedStatement.setString(4, newBook.getStatus());
            preparedStatement.setInt(5, newBook.getCurrentPage());
            preparedStatement.setInt(6, newBook.getTotalPage());
            preparedStatement.setBytes(7, newBook.getCoverBook());

            int affectedRows = preparedStatement.executeUpdate();
            return affectedRows > 0; // Return true if the insertion was successful
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
    }
    public boolean deleteBook(String title) {
        String deleteQuery = "DELETE FROM tbl_book WHERE title = ?";
        try (
           PreparedStatement preparedStatement = db.getConnection().prepareStatement(deleteQuery)
        ) {
            preparedStatement.setString(1, title);
            
             int affectedRows = preparedStatement.executeUpdate();
            return affectedRows > 0;
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
    }
    public boolean updateBook(Book updatedBook, String oldTitle) {
        String updateQuery   = "UPDATE tbl_book SET title = ?, author = ?, "
                + "status = ?, currentPage = ?, totalPage = ?, coverBook = ?  WHERE title = ?";
        try (
            PreparedStatement preparedStatement = db.getConnection().prepareStatement(updateQuery);
        ) {
            preparedStatement.setString(1, updatedBook.getTitle());
            preparedStatement.setString(2, updatedBook.getAuthor());
            preparedStatement.setString(3, updatedBook.getStatus());
            preparedStatement.setInt(4, updatedBook.getCurrentPage());
            preparedStatement.setInt(5, updatedBook.getTotalPage());
            preparedStatement.setBytes(6, updatedBook.getCoverBook());
            preparedStatement.setString(7, oldTitle);
            
            int affectedRows = preparedStatement.executeUpdate();
            return affectedRows > 0; // Return true if the insertion was successful
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
    }
    
}
