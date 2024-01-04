package researead.controllers;

import researead.models.LibraryModel;
import researead.models.User;

public class AuthManager {
    private static User authenticatedUser;
    private static int  authenticatedUserId;
    
    private AuthManager() {
        // Private constructor to prevent instantiation
    }
    
    public static void setAuthenticatedUser(User user, int userId) {
        authenticatedUser = user;
        authenticatedUserId = userId;
    }
    public static void setAuthenticatedUserLibrary(LibraryModel library) {
        authenticatedUser.setUserLibrary(library);
    }
    public static User getAuthenticatedUser() {
        return authenticatedUser;
    }
    public static int getAuthenticatedUserId() {
        return authenticatedUserId;
    }
}
