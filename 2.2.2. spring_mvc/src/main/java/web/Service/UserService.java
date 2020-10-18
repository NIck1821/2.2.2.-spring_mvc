package web.Service;

import web.model.User;

import java.util.List;

public interface UserService {
    public void addUser(User user);
    public void updateUser(User user);
    public void removeUser(int id);
    public List<User> allUsers();
    public User getUserById(int id);
}
