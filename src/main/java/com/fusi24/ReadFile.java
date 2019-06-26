package com.fusi24;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

import org.apache.commons.io.FileUtils;

public class ReadFile {

	public String readFile(String filepath) throws IOException {
		File file = new File(filepath);
		String isifile = FileUtils.readFileToString(file, Charset.defaultCharset());
		return isifile;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
