package com.github.dmitr16.system.managers;

import com.github.dmitr16.system.models.User;
import com.github.dmitr16.system.storages.UsersStorage;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

class SystemManager {
    Scanner scanner = new Scanner(System.in);

    public SystemManager() throws NoSuchAlgorithmException {
        System.out.println("Система распределения мест в общежитиях");
        login();
    }

    private void interactiveMenu() {
        // TODO: добавить элементы меню
    }

    private void login() throws NoSuchAlgorithmException {
        System.out.println("Введите логин: ");
        String login = scanner.next();

        if (findUserByLogin(login)) {
            System.out.println("Пользователь найден..");
            System.out.println("Введите пароль.");
            String password = scanner.next();

            if (checkPassword(login, password)) {
                System.out.println("Вы вошли как " + UsersStorage.userStorage.get(login).getFullName() + ".");
                System.out.println("Ваша роль - " + UsersStorage.userStorage.get(login).getRole() + ".");
            } else {
                System.out.println("Пароль введен неверно. Попробуйте снова.");
            }

        } else {
            System.out.println("Пользователя с данным логином не найдено.");
        }
    }

    private boolean findUserByLogin(String login) {
        if (UsersStorage.userStorage.containsKey(login)) {
            return true;
        }
        return false;
    }

    private User getUserFromStorage(String login) {
        User user = UsersStorage.userStorage.get(login);
        return user;
    }

    private boolean checkPassword(String login, String password) throws NoSuchAlgorithmException {
        User user = getUserFromStorage(login);
        String hash = convertToMD5(password);

        if (user.getHashPassword().equals(hash)) {
            return true;
        } else {
            return false;
        }
    }

    private String convertToMD5(String password) throws NoSuchAlgorithmException {
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        byte[] bytes = md5.digest(password.getBytes());
        StringBuilder builder = new StringBuilder();

        for (byte b : bytes) {
            builder.append(String.format("%02x", b));
        }
        return builder.toString();
    }

}