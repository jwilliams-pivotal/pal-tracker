package io.pivotal.pal.tracker;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @Value("${WELCOME_MESSAGE}")
    String greeting;

    public WelcomeController(){}

    public WelcomeController(String greeting) {
         this.greeting = greeting;
    }

    @GetMapping("/")
    public String sayHello() {
        return greeting;
    }
}
