package com.fusi24;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.apache.commons.io.IOUtils;
import org.apache.commons.io.FileUtils;

public class Common {

	public static void readURL() throws MalformedURLException, IOException{
		InputStream in = new URL("http://commons.apache.org").openStream();
		try {
			System.out.println(IOUtils.toString(in));
		} finally {
			IOUtils.closeQuietly(in);
		}	
		}
	public static void readFile() throws IOException {
		File file  = new File("D:/tekssaya.txt");
		List<String> lines = FileUtils.readLines(file);
		ReadFile rf = new ReadFile();
		for(String s : lines) {
			System.out.println(s);
		}
}
	
	public static void main(String[]args) throws IOException {
		try {
			//readURL();
			readFile();
		} catch (Exception e) {
		e.printStackTrace();
		}
		
	}
}
