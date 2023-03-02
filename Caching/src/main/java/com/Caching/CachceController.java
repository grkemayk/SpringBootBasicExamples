package com.Caching;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("cache")
@Data
@RequiredArgsConstructor
public class CachceController {
    private final CacheService cacheService;
    @GetMapping("cacheableWithParam/{id}")
    public String getMethodWithParam(@PathVariable(value = "id") String id) {
        return cacheService.myMethodWithParam(id);
    }

    @GetMapping("cacheable")
    public String getMethod() {
        return cacheService.myMethod();
    }
    @GetMapping("cacheevict")
    public String evict() {
        return cacheService.deleteCache();
    }
    @GetMapping("putCache")
    public String put() {
        return cacheService.putCache();
    }

}
