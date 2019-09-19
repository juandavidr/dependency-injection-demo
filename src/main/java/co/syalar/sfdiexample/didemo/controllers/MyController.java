package co.syalar.sfdiexample.didemo.controllers;

import org.springframework.stereotype.Controller;

/**
 * Created by jd.rodriguez
 */
@Controller
public class MyController {

    public String hello(){
        System.out.println("Hello");
        return "foo";
    }
}
