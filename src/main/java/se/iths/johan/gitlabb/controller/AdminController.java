package se.iths.johan.gitlabb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import se.iths.johan.gitlabb.model.Admin;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @GetMapping
    public String adminInfo(Model model) {
        List<Admin> admins = List.of(
                new Admin(
                        "admin1",
                        "password123",
                        true),
                new Admin(
                        "admin2",
                        "password123",
                        true),
                new Admin(
                        "admin3",
                        "password123",
                        true));

        model.addAttribute("admins", admins);
        return "admin";
    }
}
