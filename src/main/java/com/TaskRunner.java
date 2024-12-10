package com;

import com.lists_analyze.ListsAnalyze;

public class TaskRunner {
    public static void run() {
        for (int i = 10; i <= 100000; i *= 10) {
            ListsAnalyze.analyze(i);
            System.out.print("\n\n\n");
        }
    }
}
