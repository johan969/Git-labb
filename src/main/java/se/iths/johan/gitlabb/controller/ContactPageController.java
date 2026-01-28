package se.iths.johan.gitlabb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import se.iths.johan.gitlabb.model.ContactPage;

import java.util.List;

@Controller
public class ContactPageController {

    @GetMapping("/contact")
    public String contact(Model model) {
        List<ContactPage> contacts = List.of(
                new ContactPage("0769836745", "joels@email.com", "Storgatan 1"),
                new ContactPage("0734563214", "shop32@live.se", "Kungsgatan 12"),
                new ContactPage("0736786543", "annan@outlook.com", "Drottninggatan 5")
        );
        model.addAttribute("contacts", contacts);
        return "contact";
    }
}
