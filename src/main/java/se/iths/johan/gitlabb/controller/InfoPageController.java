package se.iths.johan.gitlabb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import se.iths.johan.gitlabb.model.InfoPage;

@Controller
@RequestMapping
public class InfoPageController {

    @GetMapping("/info")
    public String infoPage(Model model) {

        String about = "Information om våran hemsida";
        String address = "Trekantsvägen 1, 117 43 Stockholm";
        String phoneNumber = "08-557 683 53";

        InfoPage infoPage = new InfoPage(about, address, phoneNumber);

        model.addAttribute("infoPage", infoPage);
        return "infoPage";

    }


}
