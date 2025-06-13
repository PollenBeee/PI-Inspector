package com.graph;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVWriter;

public class Nodes {
	public static List<V> nodes = new ArrayList<>();
	
	public static void generate() {
	    try {
	    	CSVWriter writer = new CSVWriter(new FileWriter("nodes.csv"));
		    
	    	for(V n : nodes) {
	    		String[] s = {n.source, n.target};
		        writer.writeNext(s);
	    	}
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void addNodes(String source, String target) {
		V n = new V(source, target);
		nodes.add(n);
	}
}