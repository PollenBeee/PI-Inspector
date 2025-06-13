package com.core.instructions;

import com.core.CELL;

import java.util.ArrayList;
import java.util.List;

public class SUPER {
    List<CELL> parameters = new ArrayList<>();

    public List<CELL> getParameters() {
        return parameters;
    }

    public void setParameters(CELL parameter) {
        if(this.parameters == null)
            this.parameters = new ArrayList<>();
        this.parameters.add(parameter);
    }
}
