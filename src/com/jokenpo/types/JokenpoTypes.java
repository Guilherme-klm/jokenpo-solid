package com.jokenpo.types;

public enum JokenpoTypes {
    PEDRA ("PEDRA"),
    PAPEL ("PAPEL"),
    TESOURA ("TESOURA");

    private String value;

    JokenpoTypes(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
