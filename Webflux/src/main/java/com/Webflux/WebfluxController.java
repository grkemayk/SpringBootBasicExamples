package com.Webflux;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.time.Duration;

@RestController
@RequestMapping("/webflux")
public class WebfluxController {
    @GetMapping(path = "getAll", produces = MediaType.APPLICATION_STREAM_JSON_VALUE)
    public Flux<Employee> getAll() {

        return get().delayElements(Duration.ofSeconds(2)).log();
    }
    private Flux<Employee> get() {
        Flux<Employee> list = Flux.just(new Employee("A", "B", 12),
                new Employee("C", "D", 13),
                new Employee("E", "F", 14),
                new Employee("G" , "H", 15));
        return list;
    }
}
