package org.hellokube.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("api/hello")
public class HelloKubeController {

    @Value("${app.message.country}")
    private String messageCountry;

    @GetMapping("/{name}")
    public String sayHello(@PathVariable("name") String name) {
        log.info("Saying hello to {}", name);
        return "Hello, " + name + "!" + " Greetings from " + messageCountry + ".";
    }

}
