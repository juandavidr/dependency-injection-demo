package co.syalar.sfdiexample.didemo.controllers;

import co.syalar.sfdiexample.didemo.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * Created by jd.rodriguez
 */
@Controller
public class MyController {

    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello() {
        System.out.println("Hello");
        return greetingService.sayGreeting();
    }
}
