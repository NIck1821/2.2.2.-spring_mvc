package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.Service.UserService;
import web.model.User;


@Controller
public class UsersController {
    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
        userService.addUser(new User("Nikita", "Mikhenkov"));
        userService.addUser(new User("Daria", "Plotnikova"));
        userService.addUser(new User("Chychelo", "Moyo"));
    }

    @RequestMapping(value = "/")
    public String Firstpage() {
        return "hello";
    }

    @RequestMapping(value = "/users")
    public String listUsers(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        model.addAttribute("users", this.userService.allUsers());
        return "users";
    }

    @RequestMapping(value = "/users/add")
    public String addUser(@ModelAttribute("user") User user) {
        this.userService.addUser(user);
        return "redirect:/users";
    }

    @RequestMapping(value = "/edit/{id}")
    public String editUser(@PathVariable("id") int id) {
        User user = this.userService.getUserById(id);
        this.userService.addUser(new User(user.getFirstName(), user.getLastName()));
        return "redirect:/users";
    }

    @RequestMapping(value = "/remove/{id}")
    public String removeUser(@PathVariable("id") int id) {
        this.userService.removeUser(id);
        return "redirect:/users";
    }
}
