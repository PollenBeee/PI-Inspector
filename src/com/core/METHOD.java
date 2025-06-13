package com.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class METHOD {
    boolean isConstructor = false;
    String methodname;
    List<String> modifier = new ArrayList<>();
    String returntype;
    int noOfParams = 0;
    List<String> paramTypes = null;
    int noOfLocals = 0;
    HashMap<String, CELL> locals = new HashMap<>();
    List<ANNOTATION> annotations = new ArrayList<>();

    int noOfRegisterCells = 0;
    List<CELL> registerCells = new ArrayList<>();
    CELL returnvalue;
    boolean isVulnerable = false;
    
    
    public boolean isVulnerable() {
		return isVulnerable;
	}

	public void setVulnerable(boolean isVulnerable) {
		this.isVulnerable = isVulnerable;
	}

	public boolean isConstructor() {
        return isConstructor;
    }

    public void setConstructor(boolean constructor) {
        isConstructor = constructor;
    }

    public String getMethodname() {
        return methodname;
    }

    public void setMethodname(String methodname) {
        this.methodname = methodname;
    }

    public List<String> getModifier() {
        return modifier;
    }

    public void setModifier(List<String> modifier) {
        this.modifier = modifier;
    }
    public void setModifier(String modifier) {
    	if(this.modifier == null)
    		this.modifier = new ArrayList<>();
        this.modifier.add(modifier);
    }
    
    public String getReturntype() {
        return returntype;
    }

    public void setReturntype(String returntype) {
        this.returntype = returntype;
    }

    public int getNoOfParams() {
        return noOfParams;
    }
    public void setNoOfParams(int size) {
		noOfParams = size;
	}
    public List<String> getParamTypes() {
        return paramTypes;
    }

    public void setParamTypes(String param) {
        if(this.paramTypes == null)
            this.paramTypes = new ArrayList<>();
        this.paramTypes.add(param);
    }

    public int getNoOfRegisterCells() {
        return noOfRegisterCells;
    }

    public void setNoOfRegisterCells(int noOfRegisterCells) {
        this.noOfRegisterCells = noOfRegisterCells;
    }

    public List<CELL> getRegisterCells() {
        return registerCells;
    }

    public void setRegisterCells(CELL registerCell) {
        if(this.registerCells == null)
            this.registerCells = new ArrayList<>();
        this.registerCells.add(registerCell);
    }

    public int getNoOfLocals() {
        return noOfLocals;
    }

    public void setNoOfLocals(int noOfLocals) {
        this.noOfLocals = noOfLocals;
    }

    public HashMap<String,CELL> getAllRegistry() {
        return locals;
    }

    public CELL getRegistry(String cellId) {
        return locals.get(cellId);
    }

    public void setRegistry(String cellId, CELL local) {
        if(this.locals == null)
            this.locals = new HashMap<>();
        this.locals.put(cellId,local);
    }

    public CELL getReturnvalue() {
        return returnvalue;
    }

    public void setReturnvalue(CELL returnvalue) {
        this.returnvalue = returnvalue;
    }

    public List<ANNOTATION> getAnnotations() {
        return annotations;
    }

    public void setAnnotations(ANNOTATION annotation) {
        if(this.annotations == null)
            this.annotations = new ArrayList<>();
        this.annotations.add(annotation);
    }

    @Override
    public String toString() {
        return "METHOD{" +
                "methodname='" + methodname + '\'' +
                ", modifier='" + modifier + '\'' +
                ", returntype='" + returntype + '\'' +
                ", noOfParams=" + noOfParams +
                ", paramTypes=" + paramTypes +
                ", noOfLocals=" + noOfLocals +
                ", locals+params=" + locals +
                ", noOfRegisterCells=" + noOfRegisterCells +
                ", registerCells=" + registerCells +
                ", returnvalue=" + returnvalue +
                '}';
    }

	
}
