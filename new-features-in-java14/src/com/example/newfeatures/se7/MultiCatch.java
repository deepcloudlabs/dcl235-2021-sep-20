package com.example.newfeatures.se7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


@SuppressWarnings("resource")
public class MultiCatch {
	public static void main(String[] args) {
		File in = new File("c:/tmp","a.txt");
		File out = new File("c:/tmp","b.txt");
		try {
			FileInputStream fis = new FileInputStream(in);
			FileOutputStream fos = new FileOutputStream(out);
			var x = fis.read();
			fos.write(x);
		} catch(IOException | 
				IllegalArgumentException e) {
			
		} finally {
			
		}
	}
}
