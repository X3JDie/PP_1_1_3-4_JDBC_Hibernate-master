package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Main {
    private final static UserService userService = new UserServiceImpl();

    public static void main(String[] args) {

        userService.saveUser("Кто", "То", (byte) 15);
        userService.saveUser("Алекс", "Меркур", (byte) 25);
        userService.saveUser("Алекс", "Паркер", (byte) 77);
        userService.saveUser("Джордан", "Флай", (byte) 53);

        userService.removeUserById(3);

        userService.getAllUsers();

        userService.cleanUsersTable();

        userService.dropUsersTable();
    }
}
