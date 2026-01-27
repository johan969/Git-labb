package se.iths.johan.gitlabb.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import se.iths.johan.gitlabb.model.User;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping
public class UserController {

    @GetMapping("/users")
    public String user(Model model) {

        List<User> users = new ArrayList<User>();

        users.add(new User("Joel", "joelPassword", "joel@email.com"));
        users.add(new User("Jimmy", "jimmyPassword", "jimmy@email.com"));
        users.add(new User("Johan", "johanPassword", "johan@email.com"));

        model.addAttribute("users", users);
        return "user";
    }

}
