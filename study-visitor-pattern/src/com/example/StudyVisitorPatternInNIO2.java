package com.example;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class StudyVisitorPatternInNIO2 {

	public static void main(String[] args) {
		Path path = Paths.get("c:\\tmp");
		if (!Files.isDirectory(path)) {
			System.err.println("This is not a directory");
			System.exit(1);
		}
		try {
			Files.walkFileTree(path, new DeleteTextFileVisitor());
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}

}

class DeleteTextFileVisitor implements FileVisitor<Path> {

	@Override
	public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
		System.err.println("Entering the directory: "+dir.getFileName());
		return FileVisitResult.CONTINUE;
	}

	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
		System.err.println("Deleting the file "+file.getFileName());
		return FileVisitResult.CONTINUE;
	}

	@Override
	public FileVisitResult visitFileFailed(Path file, IOException e) throws IOException {
		System.err.println("Error while deleting the file "+file.getFileName()+", reason: "+e.getMessage());
		return FileVisitResult.CONTINUE;
	}

	@Override
	public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
		System.err.println("Leaving the directory: "+dir.getFileName());
		return FileVisitResult.CONTINUE;
	}}