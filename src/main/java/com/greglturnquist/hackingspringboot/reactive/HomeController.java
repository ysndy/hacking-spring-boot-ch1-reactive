package com.greglturnquist.hackingspringboot.reactive;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import reactor.core.publisher.Mono;

@Controller //웹페이지 반환
public class HomeController {

    @GetMapping
    Mono<String> home() {
        return Mono.just("home");
    }

}
