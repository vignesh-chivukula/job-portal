package com.example.jobportal.data.model;

/**
 * Data class that captures user information for logged in users retrieved from LoginRepository
 */
public class LoggedInUser {

    private String userId;
    private String displayName;
    private String userType;

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public LoggedInUser(String userId, String displayName, String userType) {
        this.userId = userId;
        this.displayName = displayName;
        this.userType = userType;
    }

    public String getUserId() {
        return userId;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getUserType() {return userType;}
}
