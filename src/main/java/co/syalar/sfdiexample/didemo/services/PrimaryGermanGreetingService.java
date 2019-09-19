package co.syalar.sfdiexample.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by jd.rodriguez
 */
@Service
@Primary
@Profile("de")
public class PrimaryGermanGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Primärer Grußdienst";
    }
}