package ru.itmentor.spring.boot_security.demo.dao;


import ru.itmentor.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserDao {

    void save(User user);

    void update(User user);

    void delete(Long id);

    User findById(Long id);

    List<User> findAll();

    User findByUsername(String username);
}
