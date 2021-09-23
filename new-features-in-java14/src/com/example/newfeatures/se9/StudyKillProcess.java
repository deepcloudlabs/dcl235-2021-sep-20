package com.example.newfeatures.se9;

import java.io.IOException;
import java.util.Optional;

public class StudyKillProcess {
	public static void main(String[] args) throws IOException {
		var command = "C:\\Windows\\System32\\mspaint.exe";
		ProcessHandle.allProcesses().filter(ph -> {
			Optional<String> cmd = ph.info().command();
			if (cmd.isPresent()) {
				String name = cmd.get();
				System.err.println(name);
				return name.equalsIgnoreCase(command);
			}
			return false;
		}).forEach(ProcessHandle::destroy);
//        File dir = new File("c:/tmp");
//        Files.list(Paths.get("c:/tmp"))
//       
//             .takeWhile(path->path.startsWith(Paths.get("c:/tmp/figures")))
//             .forEach(System.out::println);
	}
}
