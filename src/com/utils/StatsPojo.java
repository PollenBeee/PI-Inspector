package com.utils;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class StatsPojo {
    String activeprojectname;
    String activePackagename;
    String activeName;
    Long activeprojectsize;
    Integer noOfClz;

    List<String> pendingIntentPointsTo = new ArrayList<>();
    Integer noOfMethods;
    Integer noOfIntents;
    Integer  noOfPendingIntents;
    Integer FLAG_ONE_SHOT;
    Integer  FLAG_NO_CREATE;
    Integer FLAG_CANCEL_CURRENT;
    Integer FLAG_UPDATE_CURRENT;
    Integer FLAG_IMMUTABLE;
    Integer unsafePICreation;
    Integer unsafeBroadcast;
    Integer unsafePITransfer;
    Integer noOfProtectedBroadcast;
    Integer unsafeProtectedBroadcast;
    Integer totBroadcasts;
    Integer quantifysuid;
    Integer totPermissions;

    String minSDKVersion;
    String targetSDKVersion;
    Integer totActivities;
    Integer totService;
    Integer totReceiver;
    Integer totExposedActivity;
    Integer totExposedService;
    Integer totExposedReceiver;
    LinkedHashMap<String, Integer> permsMap = new LinkedHashMap<>();

    public String getActivePackagename() {
        return activePackagename;
    }

    public void setActivePackagename(String activePackagename) {
        this.activePackagename = activePackagename;
    }

    public List<String> getPendingIntentPointsTo() {
        return pendingIntentPointsTo;
    }

    public void setPendingIntentPointsTo(String pendingIntentPointsTo) {
        if(this.pendingIntentPointsTo == null)
            this.pendingIntentPointsTo = new ArrayList<>();
        this.pendingIntentPointsTo.add(pendingIntentPointsTo);
    }

    public String getActiveprojectname() {
        return activeprojectname;
    }

    public void setActiveprojectname(String activeprojectname) {
        this.activeprojectname = activeprojectname;
    }

    public String getActiveName() {
        return activeName;
    }

    public void setActiveName(String activeName) {
        this.activeName = activeName;
    }

    public Long getActiveprojectsize() {
        return activeprojectsize;
    }

    public void setActiveprojectsize(Long activeprojectsize) {
        this.activeprojectsize = activeprojectsize;
    }

    public Integer getNoOfClz() {
        return noOfClz;
    }

    public void setNoOfClz(Integer noOfClz) {
        this.noOfClz = noOfClz;
    }

    public Integer getNoOfMethods() {
        return noOfMethods;
    }

    public void setNoOfMethods(Integer noOfMethods) {
        this.noOfMethods = noOfMethods;
    }

    public Integer getNoOfIntents() {
        return noOfIntents;
    }

    public void setNoOfIntents(Integer noOfIntents) {
        this.noOfIntents = noOfIntents;
    }

    public Integer getNoOfPendingIntents() {
        return noOfPendingIntents;
    }

    public void setNoOfPendingIntents(Integer noOfPendingIntents) {
        this.noOfPendingIntents = noOfPendingIntents;
    }

    public Integer getFLAG_ONE_SHOT() {
        return FLAG_ONE_SHOT;
    }

    public void setFLAG_ONE_SHOT(Integer FLAG_ONE_SHOT) {
        this.FLAG_ONE_SHOT = FLAG_ONE_SHOT;
    }

    public Integer getFLAG_NO_CREATE() {
        return FLAG_NO_CREATE;
    }

    public void setFLAG_NO_CREATE(Integer FLAG_NO_CREATE) {
        this.FLAG_NO_CREATE = FLAG_NO_CREATE;
    }

    public Integer getFLAG_CANCEL_CURRENT() {
        return FLAG_CANCEL_CURRENT;
    }

    public void setFLAG_CANCEL_CURRENT(Integer FLAG_CANCEL_CURRENT) {
        this.FLAG_CANCEL_CURRENT = FLAG_CANCEL_CURRENT;
    }

    public Integer getFLAG_UPDATE_CURRENT() {
        return FLAG_UPDATE_CURRENT;
    }

    public void setFLAG_UPDATE_CURRENT(Integer FLAG_UPDATE_CURRENT) {
        this.FLAG_UPDATE_CURRENT = FLAG_UPDATE_CURRENT;
    }

    public Integer getFLAG_IMMUTABLE() {
        return FLAG_IMMUTABLE;
    }

    public void setFLAG_IMMUTABLE(Integer FLAG_IMMUTABLE) {
        this.FLAG_IMMUTABLE = FLAG_IMMUTABLE;
    }

    public Integer getUnsafePICreation() {
        return unsafePICreation;
    }

    public void setUnsafePICreation(Integer unsafePICreation) {
        this.unsafePICreation = unsafePICreation;
    }

    public Integer getUnsafeBroadcast() {
        return unsafeBroadcast;
    }

    public void setUnsafeBroadcast(Integer unsafeBroadcast) {
        this.unsafeBroadcast = unsafeBroadcast;
    }

    public Integer getUnsafePITransfer() {
        return unsafePITransfer;
    }

    public void setUnsafePITransfer(Integer unsafePITransfer) {
        this.unsafePITransfer = unsafePITransfer;
    }

    public Integer getNoOfProtectedBroadcast() {
        return noOfProtectedBroadcast;
    }

    public void setNoOfProtectedBroadcast(Integer noOfProtectedBroadcast) {
        this.noOfProtectedBroadcast = noOfProtectedBroadcast;
    }

    public Integer getUnsafeProtectedBroadcast() {
        return unsafeProtectedBroadcast;
    }

    public void setUnsafeProtectedBroadcast(Integer unsafeProtectedBroadcast) {
        this.unsafeProtectedBroadcast = unsafeProtectedBroadcast;
    }

    public Integer getTotBroadcasts() {
        return totBroadcasts;
    }

    public void setTotBroadcasts(Integer totBroadcasts) {
        this.totBroadcasts = totBroadcasts;
    }

    public Integer getQuantifysuid() {
        return quantifysuid;
    }

    public void setQuantifysuid(Integer quantifysuid) {
        this.quantifysuid = quantifysuid;
    }

    public Integer getTotPermissions() {
        return totPermissions;
    }

    public void setTotPermissions(Integer totPermissions) {
        this.totPermissions = totPermissions;
    }

    public String getMinSDKVersion() {
        return minSDKVersion;
    }

    public void setMinSDKVersion(String minSDKVersion) {
        this.minSDKVersion = minSDKVersion;
    }

    public String getTargetSDKVersion() {
        return targetSDKVersion;
    }

    public void setTargetSDKVersion(String targetSDKVersion) {
        this.targetSDKVersion = targetSDKVersion;
    }

    public Integer getTotActivities() {
        return totActivities;
    }

    public void setTotActivities(Integer totActivities) {
        this.totActivities = totActivities;
    }

    public Integer getTotService() {
        return totService;
    }

    public void setTotService(Integer totService) {
        this.totService = totService;
    }

    public Integer getTotReceiver() {
        return totReceiver;
    }

    public void setTotReceiver(Integer totReceiver) {
        this.totReceiver = totReceiver;
    }

    public Integer getTotExposedActivity() {
        return totExposedActivity;
    }

    public void setTotExposedActivity(Integer totExposedActivity) {
        this.totExposedActivity = totExposedActivity;
    }

    public Integer getTotExposedService() {
        return totExposedService;
    }

    public void setTotExposedService(Integer totExposedService) {
        this.totExposedService = totExposedService;
    }

    public Integer getTotExposedReceiver() {
        return totExposedReceiver;
    }

    public void setTotExposedReceiver(Integer totExposedReceiver) {
        this.totExposedReceiver = totExposedReceiver;
    }

    public LinkedHashMap<String, Integer> getPermsMap() {
        return permsMap;
    }

    public void setPermsMap(LinkedHashMap<String, Integer> permsMap) {
        this.permsMap = permsMap;
    }
}
