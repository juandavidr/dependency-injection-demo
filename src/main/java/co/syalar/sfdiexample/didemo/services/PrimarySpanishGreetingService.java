package co.syalar.sfdiexample.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by jd.rodriguez
 */
@Service
@Profile("es")
@Primary
public class PrimarySpanishGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Servicio de Saludo Primario";
    }
}