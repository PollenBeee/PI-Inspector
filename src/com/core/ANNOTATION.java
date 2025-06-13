package com.core;

import java.util.HashMap;

public class ANNOTATION {
    public String annotationScope;
    public String annotationType;
    public HashMap<String, String> annotationField = new HashMap<>();

    @Override
    public String toString() {
        return "ANNOTATION{" +
                "annotationScope='" + annotationScope + '\'' +
                ", annotationType='" + annotationType + '\'' +
                ", annotationField=" + annotationField +
                '}';
    }
}
