package com.utils;

import com.core.ACTIVITY;
import com.core.CLASS;
import com.core.METHOD;

public class R {
    public  METHOD method;
    public  CLASS cls;
    public  ACTIVITY activity;

    public  METHOD newMethod(){
        method = new METHOD();
        return method;
    }
    public  void finalizeMethod(){
        method = null;
    }
    public  METHOD getMethod(){
        return method;
    }

    public  CLASS newClass(){
        cls = new CLASS();
        return cls;
    }
    public  void finalizeClass(){
        cls = null;
    }
    public  CLASS getCls(){
        return cls;
    }

    public  ACTIVITY newActivity(){
        activity = new ACTIVITY();
        return activity;
    }
    public  void finalizeActivity(){
        activity = null;
    }
    public  ACTIVITY getActivity(){
        return activity;
    }
}
