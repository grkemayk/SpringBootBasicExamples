package com.Caching;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class CacheService {
    @Cacheable(value = "myCache")//Ilk olarak myCache'e bakar eğer içinde data varsa methodu çalıştırmaz ve veriyi buradan alır. Eğer için boşsa methodu çalıştırır ve içini doldurur.
    public String myMethod() {
        System.out.println("Cacheable Method Work!");
        return "Gorkem";
    }
    @Cacheable(value = "myCache", key = "#id")//Ilk olarak myCache'e bakar eğer içinde data varsa methodu çalıştırmaz ve veriyi buradan alır. Eğer için boşsa methodu çalıştırır ve içini doldurur.
    public String myMethodWithParam(String id) {
        System.out.println("Cacheable Method Work!".concat("  -  ").concat(id));
        return "Gorkem".concat(id);
    }
    @CacheEvict("myCache")//myCache'in içini boşaltır.
    public String deleteCache() {
        System.out.println("CacheEvict Method Work!");
        return "Delete";
    }

    @CachePut("myCache")//Method her çağrıldığında çalışır ve myCache'i kendi return value'su ile doldurur.
    public String putCache() {
        return "AYKAC";
    }
}
