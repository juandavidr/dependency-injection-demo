package co.syalar.sfdiexample.didemo.services;

import org.springframework.stereotype.Service;

/**
 * Created by jd.rodriguez
 */
@Service
public class GreetingServiceImpl implements GreetingService {

    public static final String HELLO_GURUS = "Hello Gurus!!!! - Original";

    @Override
    public String sayGreeting() {
        return HELLO_GURUS;
    }
}