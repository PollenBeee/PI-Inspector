package com.projects;

import com.core.CLASS;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Project {
    File androidmanifest = null;
    List<File> smaliFiles = new ArrayList<>();
    HashMap<String, List<CLASS>> activities = new HashMap<>();

    public File getAndroidmanifest() {
        return androidmanifest;
    }

    public void setAndroidmanifest(File androidmanifest) {
        this.androidmanifest = androidmanifest;
    }

    public List<File> getSmaliFiles() {
        return smaliFiles;
    }

    public void setSmaliFiles(File smaliFile) {
        if(this.smaliFiles == null)
            this.smaliFiles = new ArrayList<>();
        this.smaliFiles.add(smaliFile);
    }

    public HashMap<String, List<CLASS>> getActivities() {
        return activities;
    }

    public void setActivities(HashMap<String, List<CLASS>> activities) {
        this.activities = activities;
    }

    public void setActivities(String key, List<CLASS> value) {
        this.activities.put(key, value);
    }
}
