package com.core;

import java.util.ArrayList;
import java.util.List;

public class CLASS {
    /*
    .class Lcom/arc/a1/MainActivity$1;
    .super Ljava/lang/Object;
    .source "MainActivity.java"
     */
    String classname;   //.class
    String clspath;
    List<String> classModifiers = new ArrayList<>();
    String superclassname;  //.super
    String sourceFileName; //.source
    List<String> implementsClasses = new ArrayList<>();
    List<METHOD> methods = new ArrayList<>();
    List<ANNOTATION> annotations = new ArrayList<>();
    List<FIELDS> fields = new ArrayList<>();
    public String getClassname() {
        return classname;
    }

    public String getSourceFileName() {
        return sourceFileName;
    }

    public void setSourceFileName(String sourceFileName) {
        this.sourceFileName = sourceFileName;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public List<String> getClassModifiers() {
        return classModifiers;
    }

    public void setClassModifiers(String classModifier) {
        if(this.classModifiers == null)
            this.classModifiers = new ArrayList<>();
        this.classModifiers.add(classModifier);
    }

    public String getSuperclassname() {
        return superclassname;
    }

    public void setSuperclassname(String superclassname) {
        this.superclassname = superclassname;
    }

    public List<METHOD> getMethods() {
        return methods;
    }

    public void setMethods(METHOD method) {
        if(this.methods == null)
            this.methods = new ArrayList<>();
        this.methods.add(method);
    }

    public List<String> getImplementsClasses() {
        return implementsClasses;
    }

    public void setImplementsClasses(String implementsClass) {
        if(this.implementsClasses == null)
            this.implementsClasses = new ArrayList<>();
        this.implementsClasses.add(implementsClass);
    }

    public List<ANNOTATION> getAnnotations() {
        return annotations;
    }

    public void setAnnotations(ANNOTATION annotation) {
        if(this.annotations == null)
            this.annotations = new ArrayList<>();
        this.annotations.add(annotation);
    }

    public List<FIELDS> getFields() {
        return fields;
    }

    public void setFields(FIELDS field) {
        if(this.fields == null)
            this.fields = new ArrayList<>();
        this.fields.add(field);
    }

    public String getClspath() {
        return clspath;
    }

    public void setClspath(String clspath) {
        this.clspath = clspath;
    }

    @Override
    public String toString() {
        return "CLASS{" +
                "classname='" + classname + '\'' +
                ", classModifiers=" + classModifiers +
                ", superclassname='" + superclassname + '\'' +
                ", sourceFileName='" + sourceFileName + '\'' +
                ", implementsClasses=" + implementsClasses +
                ", methods=" + methods +
                ", annotations=" + annotations +
                ", fields=" + fields +
                '}';
    }
}
