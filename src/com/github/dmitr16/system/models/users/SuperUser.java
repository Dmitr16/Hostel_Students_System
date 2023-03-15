package com.github.dmitr16.system.models.users;

import com.github.dmitr16.system.models.User;

public class SuperUser extends User {

    public SuperUser(int ID, String login, String hashPassword, String fullName, String role) {
        super(ID, login, hashPassword, fullName, role);
    }
}
