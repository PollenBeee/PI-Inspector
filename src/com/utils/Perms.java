package com.utils;

import org.apache.xml.security.utils.ClassLoaderUtils;
import scala.language;

import java.io.*;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Perms {
	public static LinkedHashMap<String, Integer> permsMap = new LinkedHashMap<>();
	public static LinkedHashMap<String, Integer> processedHashMap = new LinkedHashMap<>();
	public static InputStreamReader fileReader = null;
	public static InputStreamReader processedHashFileReader = null;
	
	public static void build() {
		permsMap = new LinkedHashMap<>();
		ClassLoader classloader = Perms.class.getClassLoader();
		// URL is = classloader.getResource("permissionslist.txt");
//        URL resource = classloader.getResource("/test.txt");
//        String path = resource.getPath();
//        //System.out.println(path);
//
//		//System.out.println(new Perms().getClass().getResource("permissionslist.txt").getPath());
//		File fil = new File(new Perms().getClass().getResource("permissionslist.txt").getPath());
//		//System.out.println(fil.getAbsolutePath());
		
//		InputStreamReader fileReader = new InputStreamReader(
//				Perms.class.getClassLoader().getResourceAsStream("permissionslist.txt"));
		// FileReader fileReader = new FileReader("resources/permissionslist.txt");
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		Stream<String> lines = bufferedReader.lines();
		List<String> result = lines.collect(Collectors.toList());
		for (String s : result)
			permsMap.put(s, 0);
		
		BufferedReader bufferedReader1 = new BufferedReader(processedHashFileReader);
		Stream<String> lines1 = bufferedReader1.lines();
		List<String> result1 = lines1.collect(Collectors.toList());
		for (String s : result1)
			processedHashMap.put(s, 0);
	}
}
