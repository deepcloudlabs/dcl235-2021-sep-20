package com.example.newfeatures.se9;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

public class StudyWatchDog {
    public static void main(String[] args) throws IOException, ExecutionException, InterruptedException {
        while (true) {
            String command = "mspaint.exe";
            var process = Runtime.getRuntime().exec(command);
            var processHandle = process.toHandle();
            var onExit = processHandle.onExit();
            onExit.get();
        }
    }
}
