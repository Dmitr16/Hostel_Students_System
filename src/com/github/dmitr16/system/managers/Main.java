package com.github.dmitr16.system.managers;

import com.github.dmitr16.system.models.users.Admin;
import com.github.dmitr16.system.storages.UsersStorage;

import java.security.NoSuchAlgorithmException;

public class Main {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        Admin admin = new Admin(1000, "dmbeljaev", "670c33b22d00762aa31c47d4bc30010e",
                "Беляев Дмитрий Константинович", "Администратор");
        UsersStorage.userStorage.put(admin.getLogin(), admin);
        SystemManager manager = new SystemManager();
    }
}
