package com.github.dmitr16.system.models;

abstract public class User {
    int ID;
    String login;
    String hashPassword;
    String fullName;
    String role;

   public User(int ID, String login, String hashPassword, String fullName, String role) {
        this.ID = ID;
        this.login = login;
        this.hashPassword = hashPassword;
        this.fullName = fullName;
        this.role = role;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getHashPassword() {
        return hashPassword;
    }

    public void setHashPassword(String hashPassword) {
        this.hashPassword = hashPassword;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
