package com.Webflux;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebfluxMain {
    public static void main(String[] args) {
        SpringApplication.run(WebfluxMain.class, args);
        //Sping normalde gelen her requesti response!a gidene kadar async bir thread üzerinde çalıştırır ve o thread işlem süresince o request'e hizmet eder. Yani 5 sn db'den dta çekliyorsa 5sn o thread onu bekler.
        //Webflux ise request ve response'ı farklı thread'ler de görevlendirir ve bu şekilde threadler non-blocking konuma gelmiş olur ve beklemezler. Bu şekilde az kaynak yüksek verimlilik ve perfornmans elde edilebilir.
        }
}