package com.core;

import java.util.ArrayList;
import java.util.List;

public class CELL {
    String cellId;
    String declaredVariableName;
    String declaredVariableType;
    String directiveGenericHint;
    String presentVariableType;
    String actualVariableType;
    String keytypename;
    boolean isVulnerable = false;
    VulnerabilityType vulnerabilityType;
    boolean isGoogleCDM = false;

    public void setvulnerabilityType(final VulnerabilityType status) {
        this.vulnerabilityType = status;
    }
    public VulnerabilityType getvulnerabilityType() {
        return this.vulnerabilityType;
    }
    
    
    public boolean isGoogleCDM() {
		return isGoogleCDM;
	}
	public void setGoogleCDM(boolean isGoogleCDM) {
		this.isGoogleCDM = isGoogleCDM;
	}

	public String getKeytypename() {
		return keytypename;
	}
	public void setKeytypename(String keytypename) {
		this.keytypename = keytypename;
	}


	List<CELL_DESCRIPTION> previous_descriptions = new ArrayList<>();
    CELL_DESCRIPTION current_descriptions;
	public String keymethodname = null;

    private CELL(){}
    public CELL(String id){
        this.cellId = id;
        CELL_DESCRIPTION cell_description = new CELL_DESCRIPTION();
        this.current_descriptions = cell_description;
    }
    public CELL(String id, String initval, String descType){
        this.cellId = id;
        this.declaredVariableType = descType;
        this.presentVariableType = descType;
        this.actualVariableType = descType;

        CELL_DESCRIPTION cell_description = new CELL_DESCRIPTION(initval, "", descType);
        this.current_descriptions = cell_description;
    }

    public void setCell(CELL source) {
    	if(source != null) {
    		declaredVariableType = source.declaredVariableType;
    		declaredVariableName = source.declaredVariableName;
    		if(source.keymethodname != null)
    			keymethodname = source.keymethodname;
    		setVulnerable(source.isVulnerable, source.vulnerabilityType);
    	}
    }
    public boolean isVulnerable() {
        return isVulnerable;
    }

    public void setVulnerable(boolean vulnerable, VulnerabilityType vtype) {    	
        isVulnerable = vulnerable;
        setvulnerabilityType(vtype);
    }

    public String getCellId() {
        return cellId;
    }

    public void setCellId(String cellId) {
        this.cellId = cellId;
    }

    public String getDeclaredVariableName() {
        return declaredVariableName;
    }

    public void setDeclaredVariableName(String declaredVariableName) {
        this.declaredVariableName = declaredVariableName;
    }

    public String getDeclaredVariableType() {
        return declaredVariableType;
    }

    public void setDeclaredVariableType(String declaredVariableType) {
        this.declaredVariableType = declaredVariableType;
    }

    public String getDirectiveGenericHint() {
        return directiveGenericHint;
    }

    public void setDirectiveGenericHint(String directiveGenericHint) {
        this.directiveGenericHint = directiveGenericHint;
    }

    public List<CELL_DESCRIPTION> getPrevious_descriptions() {
        return previous_descriptions;
    }

    void setPrevious_descriptions(CELL_DESCRIPTION previous_descriptions) {
        if(this.previous_descriptions == null)
            this.previous_descriptions = new ArrayList<>();
        this.previous_descriptions.add(previous_descriptions);
    }

    public CELL_DESCRIPTION getCurrent_descriptions() {
        return current_descriptions;
    }

    public void setCurrent_descriptions(CELL_DESCRIPTION current_description) {
        setPrevious_descriptions(new CELL_DESCRIPTION(this.current_descriptions));
        this.current_descriptions = current_description;
    }

    public String getPresentVariableType() {
        return presentVariableType;
    }

    public void setPresentVariableType(String presentVariableType) {
        this.presentVariableType = presentVariableType;
    }

    public String getActualVariableType() {
        return actualVariableType;
    }

    public void setActualVariableType(String actualVariableType) {
        this.actualVariableType = actualVariableType;
    }

    @Override
    public String toString() {
        return "CELL{" +
                "cellId='" + cellId + '\'' +
                ", declaredVariableName='" + declaredVariableName + '\'' +
                ", declaredVariableType='" + declaredVariableType + '\'' +
                ", directiveGenericHint='" + directiveGenericHint + '\'' +
                ", previous_descriptions=" + previous_descriptions +
                ", current_descriptions=" + current_descriptions +
                '}';
    }
}
