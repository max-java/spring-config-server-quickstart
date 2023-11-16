package by.jrr.configserver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @Autowired
    Environment environment;

    @GetMapping("/")
    public String test() {
        return environment.getProperty("spring.jpa.database");
    }
}
