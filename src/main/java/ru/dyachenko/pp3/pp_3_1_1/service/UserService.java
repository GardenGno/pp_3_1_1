package ru.dyachenko.pp3.pp_3_1_1.service;



import ru.dyachenko.pp3.pp_3_1_1.model.User;

import java.util.List;

public interface UserService {
    public List<User> getAllUsers();
    public void saveUser(User user);
    public User getUserById(Long id);
    public void deleteUser(Long id);
    public void updateUser(User user);
}
