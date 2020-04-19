package com.example.jobportal.ui.login;

/**
 * Class exposing authenticated user details to the UI.
 */
class LoggedInUserView {
    private String displayName;
    //... other data fields that may be accessible to the UI
    private String userType;


    LoggedInUserView(String displayName,String userType) {
        this.displayName = displayName; this.userType = userType;
    }

    String getDisplayName() {
        return displayName;
    }

    String getUserType(){
        return userType;
    }
}
