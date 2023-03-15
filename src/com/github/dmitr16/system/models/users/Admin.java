package com.github.dmitr16.system.models.users;

import com.github.dmitr16.system.models.User;

public class Admin extends User {

    public Admin(int ID, String login, String hashPassword, String fullName, String role) {
        super(ID, login, hashPassword, fullName, role);
    }
}
