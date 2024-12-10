package com.lists_analyze;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ListsAnalyzeTest {

    // Определяем размер тестового набора данных
    private static final int TEST_SIZE = 1000;

    /**
     * Тест проверки времени выполнения метода addTiming для ArrayList и LinkedList.
     * Убедимся, что время выполнения не отрицательное.
     */
    @Test
    public void testAddTiming() {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        long arrayListTime = ListsAnalyze.addTiming(arrayList, TEST_SIZE);
        long linkedListTime = ListsAnalyze.addTiming(linkedList, TEST_SIZE);

        // Проверяем, что время выполнения не отрицательное
        assertTrue(arrayListTime >= 0, "Add timing should be non-negative");
        assertTrue(linkedListTime >= 0, "Add timing should be non-negative");
    }

    /**
     * Тест проверки времени выполнения метода getTiming для ArrayList.
     * Убедимся, что время выполнения не отрицательное.
     */
    @Test
    public void testGetTiming() {
        List<Integer> list = new ArrayList<>();
        // Заполняем список данными для теста
        for (int i = 0; i < TEST_SIZE; i++) {
            list.add(i);
        }

        long time = ListsAnalyze.getTiming(list, TEST_SIZE);
        // Проверяем, что время выполнения не отрицательное
        assertTrue(time >= 0, "Get timing should be non-negative");
    }

    /**
     * Тест проверки времени выполнения метода deleteTiming для ArrayList и LinkedList.
     * Убедимся, что время выполнения не отрицательное.
     */
    @Test
    public void testDeleteTiming() {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        // Заполняем списки данными для теста
        for (int i = 0; i < TEST_SIZE; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        long arrayListTime = ListsAnalyze.deleteTiming(arrayList, TEST_SIZE);
        long linkedListTime = ListsAnalyze.deleteTiming(linkedList, TEST_SIZE);

        // Проверяем, что время выполнения не отрицательное
        assertTrue(arrayListTime >= 0, "Delete timing should be non-negative");
        assertTrue(linkedListTime >= 0, "Delete timing should be non-negative");
    }

    /**
     * Тест проверки времени выполнения метода containsTiming для ArrayList.
     * Убедимся, что время выполнения не отрицательное.
     */
    @Test
    public void testContainsTiming() {
        List<Integer> list = new ArrayList<>();
        // Заполняем список данными для теста
        for (int i = 0; i < TEST_SIZE; i++) {
            list.add(i);
        }

        long time = ListsAnalyze.containsTiming(list, TEST_SIZE);
        // Проверяем, что время выполнения не отрицательное
        assertTrue(time >= 0, "Contains timing should be non-negative");
    }

    /**
     * Тест производительности методов ArrayList.
     * Проверяем, что время выполнения методов get, delete и contains не отрицательное.
     */
    @Test
    public void testArrayListPerformance() {
        List<Integer> arrayList = new ArrayList<>();
        // Выполняем операции добавления, затем тестируем get, delete и contains
        ListsAnalyze.addTiming(arrayList, TEST_SIZE);
        long getTime = ListsAnalyze.getTiming(arrayList, TEST_SIZE);
        long deleteTime = ListsAnalyze.deleteTiming(arrayList, TEST_SIZE);
        long containsTime = ListsAnalyze.containsTiming(arrayList, TEST_SIZE);

        // Проверяем времена выполнения для каждого метода
        assertTrue(getTime >= 0, "Get timing should be non-negative for ArrayList");
        assertTrue(deleteTime >= 0, "Delete timing should be non-negative for ArrayList");
        assertTrue(containsTime >= 0, "Contains timing should be non-negative for ArrayList");
    }

    /**
     * Тест производительности методов LinkedList.
     * Проверяем, что время выполнения методов get, delete и contains не отрицательное.
     */
    @Test
    public void testLinkedListPerformance() {
        List<Integer> linkedList = new LinkedList<>();
        // Выполняем операции добавления, затем тестируем get, delete и contains
        ListsAnalyze.addTiming(linkedList, TEST_SIZE);
        long getTime = ListsAnalyze.getTiming(linkedList, TEST_SIZE);
        long deleteTime = ListsAnalyze.deleteTiming(linkedList, TEST_SIZE);
        long containsTime = ListsAnalyze.containsTiming(linkedList, TEST_SIZE);

        // Проверяем времена выполнения для каждого метода
        assertTrue(getTime >= 0, "Get timing should be non-negative for LinkedList");
        assertTrue(deleteTime >= 0, "Delete timing should be non-negative for LinkedList");
        assertTrue(containsTime >= 0, "Contains timing should be non-negative for LinkedList");
    }
}
