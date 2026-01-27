package se.iths.johan.gitlabb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import se.iths.johan.gitlabb.model.Person;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/person")
public class PersonController {

    @GetMapping
    public String persons (Model model) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Pelle", 28, "Strandvägen 3"));
        personList.add(new Person("Svante", 12, "Blomgatan 42"));
        personList.add(new Person("Ragnar", 43, "Telegrafgränd 8"));
        model.addAttribute("personList", personList);
        return "person";
    }
}
