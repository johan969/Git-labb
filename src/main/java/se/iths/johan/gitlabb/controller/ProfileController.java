package se.iths.johan.gitlabb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import se.iths.johan.gitlabb.model.Profile;

@Controller
@RequestMapping
public class ProfileController {

    @GetMapping("/profile")
    public String profile(Model model) {

        String biography = "information om mig synlig på min profil";
        String profilepic = "url.ProfilePic";
        String name = "Johan";

        Profile profile = new Profile(biography, profilepic, name);

        model.addAttribute("profile", profile);

        return "profile";
    }
}
