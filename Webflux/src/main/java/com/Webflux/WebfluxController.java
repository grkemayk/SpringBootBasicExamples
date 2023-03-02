package com.Webflux;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.IntStream;

@RestController
@RequestMapping("/webflux")
public class WebfluxController {
    @Autowired
    EmployeeRepository employeeRepository;
    @GetMapping(path = "getAll", produces = MediaType.APPLICATION_STREAM_JSON_VALUE)
    public Flux<Employee> getAll() {

        return get().delayElements(Duration.ofSeconds(2)).log();
    }
    @PostMapping(path = "save")
    public Mono<Employee> save(@RequestBody Employee employee) {
        Mono<Employee> emp = employeeRepository.save(employee);
        return null;
    }

    @GetMapping(path = "getAllString")
    public Flux<String> getAllString() {

        List<Mono<String>> list = new ArrayList<>();
        IntStream.range(0, 10).forEach((item) -> list.add(Mono.just(String.valueOf(item))));
        Flux<String> fluxList = Flux.concat(list);
        return fluxList.log();

    }
    private Flux<Employee> get() {
        Flux<Employee> list = Flux.just(new Employee("A", "B", 12),
                new Employee("C", "D", 13),
                new Employee("E", "F", 14),
                new Employee("G" , "H", 15));
        return list;
    }
}
