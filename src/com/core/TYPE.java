package com.core;

public enum TYPE {
    V ("void"),
    Z ("boolean"),
    B ("byte"),
    S ("short"),
    C ("char"),
    I ("int"),
    J ("long"),
    F ("float"),
    D ("double")
    ;

    private final String name;

    private TYPE(String s) {
        name = s;
    }

    public String findType(String type){
        switch (type){
            case "V":
                return "V";
            case "Z":
                return "Z";
            case "B":
                return "B";
            case "S":
                return "S";
            case "C":
                return "C";
            case "I":
                return "I";
            case "J":
                return "J";
            case "F":
                return "F";
            case "D":
                return "D";
            default:
                return type;
        }
    }

    public boolean equalsName(String otherName) {
        // (otherName == null) check is not needed because name.equals(null) returns false
        return name.equals(otherName);
    }

    public String toString() {
        return this.name;
    }
}
/*
V void (can only be used for return value types)
Z boolean
B byte
S short
C char
I int
 J long (64 bit)
F float
 D double (64-bit)
 */