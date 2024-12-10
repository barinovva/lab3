package com.lists_analyze;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Класс вычисляет и предоставляет статистику
 * времени выполнения стандартных методов(add, get, remove, contains)
 * для контейнеров ArrayList и LinkedList
 *
 * @autor Barinov Vladimir
 */
public class ListsAnalyze {
    private static List<Integer> aList = new ArrayList<>();
    private static List<Integer> lList = new LinkedList<>();

    /**
     * Метод, предоставляющий данные о времени выполнения
     * методов контейнеров в виде контейнеров
     * @param n количество операций
     * @autor Barinov Vladimir
     */
    public static void analyze(int n) {
        Long addTimeArLs = addTiming(aList, n);
        Long addTimeLnLs = addTiming(lList, n);

        Long getTimeArLs = getTiming(aList, n);
        Long getTimeLnLs = getTiming(lList, n);

        Long containsTimeArLs = containsTiming(aList, n);
        Long containsTimeLnLs = containsTiming(lList, n);

        Long deleteTimeArLs = deleteTiming(aList, n);
        Long deleteTimeLnLs = deleteTiming(lList, n);
    }

    private static Long timeExecution(Runnable task) {
        Long timeBegin = System.currentTimeMillis();
        task.run();
        Long timeEnd = System.currentTimeMillis();
        return timeEnd - timeBegin;
    }

    public static Long addTiming(List<Integer> list, int n) {
        return timeExecution(() -> {
            for (int i = 0; i < n; i++) {
                list.add(i);
            }
        });
    }

    public static Long deleteTiming(List<Integer> list, int n) {
        return timeExecution(() -> {
            for (int i = 0; i < n; i++) {
                list.remove(Integer.valueOf(i));
            }
        });
    }

    public static Long getTiming(List<Integer> list, int n) {
        return timeExecution(() -> {
            for (int i = 0; i < n; i++) {
                list.get(i);
            }
        });
    }

    public static Long containsTiming(List<Integer> list, int n) {
        return timeExecution(() -> {
            for (int i = 0; i < n; i++) {
                list.contains(Integer.valueOf(i));
            }
        });
    }
}
