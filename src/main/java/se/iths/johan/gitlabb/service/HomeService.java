package se.iths.johan.gitlabb.service;

import org.springframework.stereotype.Service;

@Service
public class HomeService {
    public String helloFromService() {
        return "Välkommen!";
    }
}
