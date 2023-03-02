package com.Webflux;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class WebfluxMain {
    public static void main(String[] args) {
        SpringApplication.run(WebfluxMain.class, args);
        //Sping normalde gelen her requesti response!a gidene kadar async bir thread üzerinde çalıştırır ve o thread işlem süresince o request'e hizmet eder. Yani 5 sn db'den dta çekliyorsa 5sn o thread onu bekler.
        //Webflux ise request ve response'ı farklı thread'ler de görevlendirir ve bu şekilde threadler non-blocking konuma gelmiş olur ve beklemezler. Bu şekilde az kaynak yüksek verimlilik ve perfornmans elde edilebilir.

        List<String> streamData = new ArrayList<>();
        Flux<String> items = Flux.just("Gokhan", "Reader", "World");
        Mono<String> monoItem = Mono.just("Gorkem");
        monoItem.log().subscribe((item) -> {
            System.out.println(item);
        });
        items.log().subscribe((item) -> {
                    streamData.add(item);
                },
                (err) -> {
                    System.out.println(err);
                    ;
                });
        streamData.forEach(System.out::println);
    }
}