package web.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.Dao.UserDao;
import web.model.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {


    private UserDao usersDao;

    @Autowired
    public void setUsersDao(UserDao usersDao) {
        this.usersDao = usersDao;
    }

    @Override
    public void addUser(User user) {
        this.usersDao.addUser(user);
    }

    @Override
    public void updateUser(User user) {
        this.usersDao.updateUser(user);
    }

    @Override
    public void removeUser(int id) {
        this.usersDao.removeUser(id);
    }

    @Override
    public List<User> allUsers() {
        return usersDao.allUsers();
    }

    @Override
    public User getUserById(int id) {
        return usersDao.getUserById(id);
    }
}
