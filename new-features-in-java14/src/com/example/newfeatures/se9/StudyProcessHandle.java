package com.example.newfeatures.se9;

import java.util.Optional;

public class StudyProcessHandle {
    public static void main(String[] args) {
        var pid = ProcessHandle.current().pid();
        System.out.println(pid);
        ProcessHandle.allProcesses()
                .map(ProcessHandle::info)
                .map(ProcessHandle.Info::command)
                .filter(Optional::isPresent)
                .map(Optional::get)
                .forEach(System.out::println);
    }
}
