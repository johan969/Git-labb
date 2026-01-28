package se.iths.johan.gitlabb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import se.iths.johan.gitlabb.model.AdminUser;

import java.util.List;

@Controller
public class AdminUserController {

    @GetMapping("/admin-users")
    public String adminUsers(Model model) {
        List<AdminUser> adminUsers = List.of(
                new AdminUser("Joel", "abc123", true),
                new AdminUser("John", "abc123", false),
                new AdminUser("Jane", "abc123", true)
        );
        model.addAttribute("adminUsers", adminUsers);
        return "admin-users";
    }
}
