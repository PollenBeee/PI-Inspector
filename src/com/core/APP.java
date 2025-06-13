package com.core;

import java.util.ArrayList;
import java.util.List;

public class APP {
    public List<ACTIVITY> activities = new ArrayList<>();

    public List<ACTIVITY> getActivities() {
        return activities;
    }

    public void setActivities(List<ACTIVITY> acts) {
        activities = acts;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        for(ACTIVITY a : activities){
            sb.append(a.toString() + "\n");
        }
        return "APP{" +
                "activities=" + sb.toString() +
                '}';
    }
}
