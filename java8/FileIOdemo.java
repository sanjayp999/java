package com.java8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileIOdemo {
	public static void main(String[] args) throws IOException {
		String filename= "file.txt";
		
		try (Stream<String> lines = Files.lines(Paths.get(filename))) {
			lines.forEach(line->System.out.println(line));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
