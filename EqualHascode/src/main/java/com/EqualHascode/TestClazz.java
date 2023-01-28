package com.EqualHascode;

public class TestClazz {
    private String a;
    private int b;
    private Long identityNumber;

    public TestClazz(String a, int b, long number){
        this.a = a;
        this.b = b;
        this.identityNumber = number;
    }

    @Override
    public int hashCode() {
        return identityNumber.hashCode();
    }
}
