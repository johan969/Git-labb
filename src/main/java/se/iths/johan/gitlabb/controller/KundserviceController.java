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
        List<Kundservice> kundserviceDetails = List.of(
                new Kundservice(
                        "mr.cool@example.com",
                        "0701234567",
                        "07:00"),
                new Kundservice(
                        "hej@example.com",
                        "0702234567",
                        "04:00"),
                new Kundservice(
                        "ikea@example.com",
                        "0703234567",
                        "09:00"));
        model.addAttribute("kundserviceDetails", kundserviceDetails);
        return "kundservice";
    }

}
