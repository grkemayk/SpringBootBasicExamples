package com.EqualHascode;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data//@Data -> @ToString + @Getter + @Setter + @EqualsAndHashCode + @RequiredArgsConstructor
//@RequiredArgsConstructor -> final keyword'e sahip tüm property'ler için constructor oluşturur.
//@AllArgsConstructor -> tüm property'ler için constructor oluşturur.
public class TestClazzz {
    String a;
    String b;
    final int ai;
    final int bi;
}
