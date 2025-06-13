package com.graph;

import java.util.ArrayList;
import java.util.List;

public class DatasetObject {
	String family = "noid";
	String appName = "";
	String appPackageName = "";

	String appName2 = "";
	String appSize = "";
	String noOfClz = "";
	String noOfMethods = "";
	String noOfIntents = "";
	String noOfPendingIntents = "";

	String FLAG_ONE_SHOT = "";
	String FLAG_NO_CREATE = "";
	String FLAG_CANCEL_CURRENT = "";
	String FLAG_UPDATE_CURRENT = "";
	String FLAG_IMMUTABLE = "";
	String unsafePICreation = "";
	String unsafeBroadcast = "";
	String unsafePITransfer = "";
	String NoOfProtectedBroadcast = "";
	String UnsafeProtectedBroadcast = "";
	String TotalBroadcast = "";
	String SharedUIDLabel = "";

	String QuantifySUID = "";
	String TotalPermissions = "";
	String minSDKVersion = "";
	String targetSDKVersion = "";
	String TotActivities = "";
	String TotServices = "";
	String TotBroadcastReceivers = "";
	String TotExposedActivities = "";
	String TotExposedServices = "";
	String TotExposedBroadcastReceivers = "";

	List<String> OutBroadcastTags;
	List<String> InBroadcastTags;
	List<String> permissions;

	public DatasetObject() {
		OutBroadcastTags = new ArrayList<>();
		InBroadcastTags = new ArrayList<>();
		permissions = new ArrayList<>();
	}

	@Override
	public String toString() {
		return "DatasetObject [appName=" + appName + ", appPackageName=" + appPackageName + ", appName2=" + appName2
				+ ", appSize=" + appSize + ", noOfClz=" + noOfClz + ", noOfMethods=" + noOfMethods + ", noOfIntents="
				+ noOfIntents + ", noOfPendingIntents=" + noOfPendingIntents + ", FLAG_ONE_SHOT=" + FLAG_ONE_SHOT
				+ ", FLAG_NO_CREATE=" + FLAG_NO_CREATE + ", FLAG_CANCEL_CURRENT=" + FLAG_CANCEL_CURRENT
				+ ", FLAG_UPDATE_CURRENT=" + FLAG_UPDATE_CURRENT + ", FLAG_IMMUTABLE=" + FLAG_IMMUTABLE
				+ ", unsafePICreation=" + unsafePICreation + ", unsafeBroadcast=" + unsafeBroadcast
				+ ", unsafePITransfer=" + unsafePITransfer + ", NoOfProtectedBroadcast=" + NoOfProtectedBroadcast
				+ ", UnsafeProtectedBroadcast=" + UnsafeProtectedBroadcast + ", TotalBroadcast=" + TotalBroadcast
				+ ", SharedUIDLabel=" + SharedUIDLabel + ", QuantifySUID=" + QuantifySUID + ", TotalPermissions="
				+ TotalPermissions + ", minSDKVersion=" + minSDKVersion + ", targetSDKVersion=" + targetSDKVersion
				+ ", TotActivities=" + TotActivities + ", TotServices=" + TotServices + ", TotBroadcastReceivers="
				+ TotBroadcastReceivers + ", TotExposedActivities=" + TotExposedActivities + ", TotExposedServices="
				+ TotExposedServices + ", TotExposedBroadcastReceivers=" + TotExposedBroadcastReceivers
				+ ", OutBroadcastTags=" + OutBroadcastTags + ", InBroadcastTags=" + InBroadcastTags + ", permissions="
				+ permissions + "]";
	}
}