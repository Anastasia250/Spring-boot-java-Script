package ru.itmentor.spring.boot_security.demo.dao;

import ru.itmentor.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserDao {

    void addUser(User user);

    void updateUser(User user);

    void deleteUser(long id);

    User getUserById(long id);

    List<User> listUsers();

    User findUserByEmail(String email);
}
