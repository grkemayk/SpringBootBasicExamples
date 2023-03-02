package com.Webflux;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class Employee {
    private String name;
    private String surname;
    private Integer age;

}
