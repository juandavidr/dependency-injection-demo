package co.syalar.sfdiexample.didemo.services;

import org.springframework.stereotype.Service;
/**
 * Created by jd.rodriguez
 */
@Service
public class SetterGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello - I was injected by the setter";
    }
}