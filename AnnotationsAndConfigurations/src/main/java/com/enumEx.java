package com;

public enum enumEx {
    low("low value"),
    medium("medium value"),
    high("high value");
    public final String label;
    private enumEx(String label) {
        this.label = label;
    }
}
