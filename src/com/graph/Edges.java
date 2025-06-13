package com.graph;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVWriter;

public class Edges {
	
public static List<V> edges = new ArrayList<>();
	
	public static void generate() {
	    try {
	    	CSVWriter writer = new CSVWriter(new FileWriter("edges.csv"));
		    
	    	for(V n : edges) {
	    		String[] s = {n.source, n.target};
		        writer.writeNext(s);
	    	}
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void addEdge(String source, String target) {
		V n = new V(source, target);
		edges.add(n);
	}		
}
