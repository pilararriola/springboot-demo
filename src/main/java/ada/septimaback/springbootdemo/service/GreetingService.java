package ada.septimaback.springbootdemo.service;

import ada.septimaback.springbootdemo.model.Greeting;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;

@Service
public class GreetingService {

    private static final String TEMPLATE = "Hola, %s!";
    private final AtomicLong counter = new AtomicLong();

    public Greeting createGreeting(String name) {
        return new Greeting(counter.incrementAndGet(),
                String.format(TEMPLATE, name));
    }
}

