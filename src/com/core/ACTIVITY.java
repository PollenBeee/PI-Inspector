package com.core;

import java.util.ArrayList;
import java.util.List;

public class ACTIVITY {
    public String name;
    public static List<CLASS> classes = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static List<CLASS> getClasses() {
        return classes;
    }

    public static void setClasses(List<CLASS> classes) {
        ACTIVITY.classes = classes;
    }

    @Override
    public String toString() {
        String classDescription = new String();

        for(CLASS c : classes){
            classDescription += c.toString() +"\n";
        }
        return "ACTIVITY{" +
                "name='" + name + '\'' +
                '}';
    }
}
