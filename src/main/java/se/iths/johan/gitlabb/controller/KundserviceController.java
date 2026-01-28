package se.iths.johan.gitlabb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import se.iths.johan.gitlabb.model.Kundservice;
import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/kundservice")
public class KundserviceController {

    @GetMapping
    public String kundserviceInfo(Model model) {
        List<String> phoneNumbers1 = List.of("0701234567", "0700876543");
        List<String> phoneNumbers2 = List.of("0701234567", "0701876543");
        List<String> phoneNumbers3 = List.of("0701234567", "0702876543");

        List<Kundservice> kundserviceDetails = List.of(
                new Kundservice(
                        "mr.cool@example.com",
                        phoneNumbers1,
                        "07:00"),
                new Kundservice(
                        "hej@example.com",
                        phoneNumbers2,
                        "04:00"),
                new Kundservice(
                        "ikea@example.com",
                        phoneNumbers3,
                        "09:00"));
        model.addAttribute("kundserviceDetails", kundserviceDetails);
        return "kundservice";
    }

}
