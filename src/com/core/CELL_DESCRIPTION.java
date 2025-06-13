package com.core;

import com.core.libs.PendingIntent;
import com.core.type.ICCObjects;
import com.utils.Env;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CELL_DESCRIPTION {
	public static final String T_NUMERIC = "numericType";
	public static final String T_STRING = "stringType";
	public static final String T_REFERENCE = "referenceOrArrayType";
	public static final String T_ARROWREFERENCE = "sget_arrowRefType";
	public static final String T_PARAMDIRECTIVES = "param_directives";

	boolean isPublicBroadcast = false;
	String pointsTo;
	List<String> pointsFrom;
	String initValue;
	String flagValue;
	String actionTag;
	String descType;
	String actualDescType;
	String rhs;
	String clsType;
	String objType;
	String invokeMethodName;
	public ICCObjects iccObjects;
	List<String> methodParamsType = new ArrayList<>();

	public CELL_DESCRIPTION() {
	}

	public CELL_DESCRIPTION(String initval, String type, String descType) {
		this.initValue = initval;
		this.descType = descType;
		this.actualDescType = descType;
		this.rhs = "";
		this.clsType = type;
		this.objType = "";
		this.invokeMethodName = "";
	}

	public CELL_DESCRIPTION(CELL_DESCRIPTION cell_description) {
		if (cell_description != null) {
			this.pointsTo = cell_description.pointsTo;

			this.initValue = cell_description.initValue;

			this.descType = cell_description.descType;
			this.rhs = cell_description.rhs;
			this.clsType = cell_description.clsType;
			this.objType = cell_description.objType;
			this.invokeMethodName = cell_description.invokeMethodName;
		}
	}

	public void setInvokeMethodName(String invokeMethodName) {
		this.invokeMethodName = invokeMethodName;
	}

	public String getRhs() {
		return rhs;
	}

	public void setRhs(String rhs) {
		this.rhs = rhs;
		parseValue(rhs);
	}

	public void parseValue(String value) {
		if (value != null) {
			String[] str = value.split("->");
			clsType = str[0];
			String[] strx = str[1].split("\\)");
			invokeMethodName = strx[0];

			objType = strx[1];
		}
	}

	public String getActualDescType() {
		return actualDescType;
	}

	public void setActualDescType(String actualDescType) {
		this.actualDescType = actualDescType;
	}

	public String getActionTag() {
		return actionTag;
	}

	public void setActionTag(String actionTag) {
		this.actionTag = actionTag;
	}

	public String getFlagValue() {
		return flagValue;
	}

	// public void newPendingIntent(){
	// Env.stats.noOfPendingIntents++;
	// }
	public void setFlagValue(String flagValue) {
		this.flagValue = flagValue;
		setFlagValuePI(flagValue, true);
	}

	public void setFlagValueNoIncrement(String flagValue) {
		//// System.out.println(">>>>>>FLAG_NO_INCREMENT "+Env.activeSmaliFileName);
		this.flagValue = flagValue;
		setFlagValuePI(flagValue, false);
	}

	public List<String> getPointsFrom() {
		return pointsFrom;
	}

	public void setPointsFrom(String pointsFrm) {
		if (this.pointsFrom == null)
			this.pointsFrom = new ArrayList<>();
		this.pointsFrom.add(pointsFrm);
	}

	public String getInitValue() {
		return initValue;
	}

	public void setInitValue(String inValue) {
		this.initValue = inValue;
	}

	public void setFlagValuePI(String inValue, boolean isstatsneeded) {
		if (inValue != null) {

			switch (inValue) {
			case "40000000":// FLAG_ONE_SHOT
				initValue = "PendingIntent.FLAG_ONE_SHOT";
				if (isstatsneeded) {
					Env.stats.FLAG_ONE_SHOT++;
					Env.stats.oneshotfiles.add(Env.activeprojectname);
					Env.stats.allFlags.add("PendingIntent.FLAG_ONE_SHOT");
					Env.stats.setFlag2fileMap("PendingIntent.FLAG_ONE_SHOT", Env.activeSmaliFileName);
				}
				break;
			case "20000000":// FLAG_NO_CREATE
				initValue = "PendingIntent.FLAG_NO_CREATE";
				if (isstatsneeded) {
					Env.stats.FLAG_NO_CREATE++;
					Env.stats.nocreatefiles.add(Env.activeprojectname);
					Env.stats.allFlags.add("PendingIntent.FLAG_NO_CREATE");
					Env.stats.setFlag2fileMap("PendingIntent.FLAG_NO_CREATE", Env.activeSmaliFileName);
				}
				break;
			case "10000000":// FLAG_CANCEL_CURRENT
				initValue = "PendingIntent.FLAG_CANCEL_CURRENT";
				if (isstatsneeded) {
					Env.stats.FLAG_CANCEL_CURRENT++;
					Env.stats.cancelcurrentfiles.add(Env.activeprojectname);
					Env.stats.allFlags.add("PendingIntent.FLAG_CANCEL_CURRENT");
					Env.stats.setFlag2fileMap("PendingIntent.FLAG_CANCEL_CURRENT", Env.activeSmaliFileName);
				}
				break;
			case "8000000":// FLAG_UPDATE_CURRENT
				initValue = "PendingIntent.FLAG_UPDATE_CURRENT";
				if (isstatsneeded) {
					Env.stats.FLAG_UPDATE_CURRENT++;
					Env.stats.updatecurrentfiles.add(Env.activeprojectname);
					Env.stats.allFlags.add("PendingIntent.FLAG_UPDATE_CURRENT");
					Env.stats.setFlag2fileMap("PendingIntent.FLAG_UPDATE_CURRENT", Env.activeSmaliFileName);
				}
				break;
			case "4000000":// FLAG_IMMUTABLE
				initValue = "PendingIntent.FLAG_IMMUTABLE";
				if (isstatsneeded) {
					Env.stats.FLAG_IMMUTABLE++;
					Env.stats.immutablefiles.add(Env.activeprojectname);
					Env.stats.allFlags.add("PendingIntent.FLAG_IMMUTABLE");
					Env.stats.setFlag2fileMap("PendingIntent.FLAG_IMMUTABLE", Env.activeSmaliFileName);
				}
				break;

			default:
				hexToBin(inValue, isstatsneeded);
			}
		}
	}

	// Integer oneshotBin = 1073741824;
	// Integer nocreatBin = 536870912;
	// Integer cancelBin = 268435456;
	// Integer updateBin = 134217728;
	// Integer immutaBin = 67108864;
	// Integer[] flagsarray = {268435456, 1073741824, 536870912, 134217728,
	// 67108864};
	//
	private void hexToBin(String inValue, boolean isstatsneeded) {
		try {
			Integer flags = new BigInteger(inValue, 16).intValue();
			final boolean noCreate = (flags & PendingIntent.FLAG_NO_CREATE) != 0;
			final boolean cancelCurrent = (flags & PendingIntent.FLAG_CANCEL_CURRENT) != 0;
			final boolean updateCurrent = (flags & PendingIntent.FLAG_UPDATE_CURRENT) != 0;
			final boolean immutable = (flags & PendingIntent.FLAG_IMMUTABLE) != 0;
			final boolean oneshot = (flags & PendingIntent.FLAG_ONE_SHOT) != 0;

			// Integer flags1 = flags & ~(PendingIntent.FLAG_NO_CREATE |
			// PendingIntent.FLAG_CANCEL_CURRENT
			// | PendingIntent.FLAG_UPDATE_CURRENT);
			if (isstatsneeded) {
				if (noCreate) {
					Env.stats.FLAG_NO_CREATE++;
					Env.stats.nocreatefiles.add(Env.activeprojectname);
					Env.stats.allFlags.add("PendingIntent.FLAG_NO_CREATE");
					Env.stats.setFlag2fileMap("PendingIntent.FLAG_NO_CREATE", Env.activeSmaliFileName);
				}
				if (cancelCurrent) {
					Env.stats.FLAG_CANCEL_CURRENT++;
					Env.stats.cancelcurrentfiles.add(Env.activeprojectname);
					Env.stats.allFlags.add("PendingIntent.FLAG_CANCEL_CURRENT");
					Env.stats.setFlag2fileMap("PendingIntent.FLAG_CANCEL_CURRENT", Env.activeSmaliFileName);
				}
				if (updateCurrent) {
					Env.stats.FLAG_UPDATE_CURRENT++;
					Env.stats.updatecurrentfiles.add(Env.activeprojectname);
					Env.stats.allFlags.add("PendingIntent.FLAG_UPDATE_CURRENT");
					Env.stats.setFlag2fileMap("PendingIntent.FLAG_UPDATE_CURRENT", Env.activeSmaliFileName);
				}
				if (immutable) {
					Env.stats.FLAG_IMMUTABLE++;
					Env.stats.immutablefiles.add(Env.activeprojectname);
					Env.stats.allFlags.add("PendingIntent.FLAG_IMMUTABLE");
					Env.stats.setFlag2fileMap("PendingIntent.FLAG_IMMUTABLE", Env.activeSmaliFileName);
				}
				if (oneshot) {
					Env.stats.FLAG_ONE_SHOT++;
					Env.stats.oneshotfiles.add(Env.activeprojectname);
					Env.stats.allFlags.add("PendingIntent.FLAG_ONE_SHOT");
					Env.stats.setFlag2fileMap("PendingIntent.FLAG_ONE_SHOT", Env.activeSmaliFileName);
				}
			}
		} catch (NumberFormatException e) {
			return;
		}
	}
	//
	//// private void rec(Integer bin, boolean isstatsneeded){
	//// Integer value = 0;
	//// for (Integer i : flagsarray) {
	//// path = new ArrayList<>();
	//// value = (bin ^ i);
	//// boolean contains = Arrays.stream(flagsarray).anyMatch(value::equals);
	//// //////System.out.println("a^b = " + String.valueOf(value) + ":" + contains
	// + ":" + Integer.toHexString(value));
	//// if (contains) {
	//// setFlagValuePI(Integer.toHexString(value), isstatsneeded);
	//// setFlagValuePI(Integer.toHexString(i), isstatsneeded);
	//// break;
	//// }
	//// if(!contains){
	//// backtrack.add(i);
	//// path.add(i);
	//// int index = path.size() - 1;
	//// if(index !=0)
	//// path.remove(index);
	//// i.add(j);
	////
	//// recXor(backtrack, value, isstatsneeded);
	////// break;
	//// }
	//// }
	//// }
	//
	// List<Integer> backtrack = new ArrayList<>();
	// List<Integer> path = new ArrayList<>();
	//
	// private void recXor(List<Integer> blacklist, Integer bin, boolean
	// isstatsneeded) {
	// Integer value = 0;
	// for(Integer j:flagsarray){
	// if(blacklist.contains(j)){ continue; }
	// path.add(j);
	// blacklist.add(j);
	// value = (bin ^ j);
	// boolean contains = Arrays.stream(flagsarray).anyMatch(value::equals);
	//// //////System.out.println("a^b = " + String.valueOf(value) + ":" + contains
	// + ":" + Integer.toHexString(value));
	// if (contains) {
	// for(Integer x : path)
	// setFlagValuePI(Integer.toHexString(x), isstatsneeded);
	// setFlagValuePI(Integer.toHexString(value), isstatsneeded);
	// path = new ArrayList<>();
	// blacklist = new ArrayList<>();
	// break;
	// }
	// if(!contains){
	// int index = path.size() - 1;
	// if(index > 0) {
	// path.remove(index);
	// }
	// boolean isAllDone = doesnotContain(value, blacklist, isstatsneeded);
	// path = new ArrayList<>();
	// blacklist = new ArrayList<>();
	// blacklist.add(j);
	// if(isAllDone){
	// return;
	// }
	// }
	// }
	// }
	//
	//// boolean isAllDone = false;
	// private boolean doesnotContain(Integer value, List<Integer> blacklist,
	// Boolean isstatsneeded) {
	// for(Integer x : flagsarray){
	// if(blacklist.contains(x)){ continue; }
	// path.add(x);
	// Integer valuex = (value ^ x);
	// boolean contains = Arrays.stream(flagsarray).anyMatch(valuex::equals);
	// if (contains) {
	// for(Integer y : path)
	// setFlagValuePI(Integer.toHexString(y), isstatsneeded);
	// setFlagValuePI(Integer.toHexString(value), isstatsneeded);
	// path = new ArrayList<>();
	// blacklist = new ArrayList<>();
	// return true;
	//// break;
	// }
	// if(!contains) {
	// blacklist.add(x);
	// int index = path.size() - 1;
	// if(index > 0) {
	// path.remove(index);
	// }
	// boolean flagcheck = doesnotContain(value, blacklist, isstatsneeded);
	// index = path.size() - 1;
	// if(index > 0) {
	// path.remove(index);
	// }
	// blacklist.remove(x);
	// return flagcheck;
	//// break;
	// }
	// }
	// return false;
	// }

	public boolean isPublicBroadcast() {
		return isPublicBroadcast;
	}

	public void setPublicBroadcast(boolean publicBroadcast) {
		isPublicBroadcast = publicBroadcast;
	}

	public String getPointsTo() {
		return pointsTo;
	}

	public void setPointsTo(String pointsTo) {
		this.pointsTo = pointsTo;
	}

	public String getClsType() {
		return clsType;
	}

	public String getObjType() {
		return objType;
	}

	public String getInvokeMethodName() {
		return invokeMethodName;
	}

	public String getDescType() {
		return descType;
	}

	public void setDescType(String descType) {
		this.descType = descType;
	}

	public void setClsType(String clsType) {
		this.clsType = clsType;
	}

	public void setObjType(String objType) {
		this.objType = objType;
	}

	public void setCellInvocationType(String clstype, String methodName, List<String> methodArgs, String methodReturn) {
		this.clsType = clstype;
		this.invokeMethodName = methodName;
		this.methodParamsType = methodArgs;
		this.objType = methodReturn;
	}

	@Override
	public String toString() {
		return "CELL_DESCRIPTION{" + "isPublicBroadcast=" + isPublicBroadcast + ", pointsTo='" + pointsTo + '\''
				+ ", pointsFrom=" + pointsFrom + ", initValue='" + initValue + '\'' + ", flagValue='" + flagValue + '\''
				+ ", actionTag='" + actionTag + '\'' + ", descType='" + descType + '\'' + ", rhs='" + rhs + '\''
				+ ", clsType='" + clsType + '\'' + ", objType='" + objType + '\'' + ", invokeMethodName='"
				+ invokeMethodName + '\'' + ", methodParamsType=" + methodParamsType + '}';
	}
}
