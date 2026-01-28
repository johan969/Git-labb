package se.iths.johan.gitlabb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import se.iths.johan.gitlabb.model.Checkout;

import java.util.List;

@Controller
public class CheckoutController {

    @GetMapping("/checkouts")
    public String checkouts(Model model) {
        List<Checkout> checkouts = List.of(
                new Checkout("Card", List.of("Keyboard", "Mouse", "Monitor"), "SEK"),
                new Checkout("Swish", List.of("Coffee", "Cookies", "Tea"), "SEK"),
                new Checkout("PayPal", List.of("Book", "Pen", "Notebook"), "USD")
        );
        model.addAttribute("checkouts", checkouts);
        return "checkouts";
    }
}
