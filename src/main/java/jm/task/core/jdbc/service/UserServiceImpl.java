package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;

import java.util.List;

public class UserServiceImpl implements UserService {
    UserDao userDao = new UserDaoJDBCImpl();

    public void createUsersTable() {
        userDao.createUsersTable();

    }


    public void dropUsersTable() {
        userDao.dropUsersTable();
    }

    public void saveUser(String name, String lastName, byte age) {
        userDao.saveUser(name, lastName, age);
        System.out.println("Успешно добавлен : " + name + lastName);
    }

    public void removeUserById(long id) {
        userDao.removeUserById(id);
    }

    public List<User> getAllUsers() {

        List<User> users = userDao.getAllUsers();
        int count = 0;
        for (User user : users) {
            System.out.println("Пользователь : " + user);
            count++;
        }
        System.out.println(count);
        return users;
    }

    public void cleanUsersTable() {
        userDao.cleanUsersTable();
    }
}