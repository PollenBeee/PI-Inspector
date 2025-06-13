package com.core;

import java.util.ArrayList;
import java.util.List;

public class FIELDS {
    public List<String> fieldModifiers = new ArrayList<>();
    public String fieldNameAndType;
    public String assignableValue;

    @Override
    public String toString() {
        return "FIELDS{" +
                "fieldModifiers=" + fieldModifiers +
                ", fieldNameAndType='" + fieldNameAndType + '\'' +
                ", assignableValue='" + assignableValue + '\'' +
                '}';
    }
}
