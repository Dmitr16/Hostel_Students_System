package com.github.dmitr16.system.actions;

import com.github.dmitr16.system.models.User;
import com.github.dmitr16.system.models.users.Admin;

public interface IAdmin {

    void createAdmin(Admin user);

    void createUser(User user);

    void changeUserRole(User user);
}
