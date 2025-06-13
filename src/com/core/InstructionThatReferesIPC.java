package com.core;

import java.util.ArrayList;
import java.util.List;

public class InstructionThatReferesIPC {
	public List<String> listOfPointers = new ArrayList<>();

	private InstructionThatReferesIPC() {}
	
	public InstructionThatReferesIPC(String pointers) {
		if(listOfPointers == null)
			listOfPointers = new ArrayList<>();
		listOfPointers.add(pointers);
	}

	@Override
	public String toString() {
		return "InstructionThatReferesIPC [listOfPointers=" + listOfPointers + "]";
	}
	
}
