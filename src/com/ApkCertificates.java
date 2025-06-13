package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class ApkCertificates {
	public String owner;
	public String issuer;
	public String serialnumber;
	public String algorithm;
	public String bit;
	public String version;
	
	public ApkCertificates() {}
	
	public ApkCertificates(File file) {
		System.out.println("APKCERT>> "+file.getAbsolutePath());
		String filepath = file.getAbsolutePath();
//		ProcessBuilder   ps=new ProcessBuilder("keytool -printcert -jarfile "+filepath);

		Process p;
		try {
			p = Runtime.getRuntime().exec("keytool -printcert -jarfile " + filepath, null, new File(file.getParent()));
			BufferedReader stdError = new BufferedReader(new InputStreamReader(p.getInputStream()));
			BufferedReader stdError1 = new BufferedReader(new InputStreamReader(p.getErrorStream()));

			String s = null;
			System.out.println("Here is the standard error of the command (if any):\n");
			while ((s = stdError.readLine()) != null) {				
				if(s.startsWith("Owner:")) {
					String[] s1 = s.split(":");
					owner = s1[1].trim();
				}
				if(s.startsWith("Issuer:")) {
					String[] s1 = s.split(":");
					issuer = s1[1].trim();
				}
				if(s.startsWith("Serial number:")) {
					String[] s1 = s.split(":");
					serialnumber = s1[1].trim();
				}
				if(s.startsWith("Signature algorithm name:")) {
					String[] s1 = s.split(":");
					algorithm = s1[1].trim();
				}
				if(s.startsWith("Subject Public Key Algorithm:")) {
					String[] s1 = s.split(":");
					bit = s1[1].trim();
				}
				if(s.startsWith("Version:")) {
					String[] s1 = s.split(":");
					version = s1[1].trim();
				}
				
				System.out.println(s);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
//		
//		//From the DOC:  Initially, this property is false, meaning that the 
//		//standard output and error output of a subprocess are sent to two 
//		//separate streams
//		ps.redirectErrorStream(true);
//
//		Process pr;
//		try {
//			pr = ps.start();
//			BufferedReader in = new BufferedReader(new InputStreamReader(pr.getInputStream()));
//			String line;
//			while ((line = in.readLine()) != null) {
//			    System.out.println(line);
//			}
//			pr.waitFor();
//			System.out.println("ok!");
//
//			in.close();
//
//		} catch (IOException | InterruptedException e) {
//			e.printStackTrace();
//		}  

		
	}

}
