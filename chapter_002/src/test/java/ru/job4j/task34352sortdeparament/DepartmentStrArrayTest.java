package ru.job4j.task34352sortdeparament;


import org.junit.Test;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class DepartmentStrArrayTest {

    @Test
    public void whendeleteGapAtdepartaments() {
        String[] departments = {"K1\\SK1", "K1\\SK2", "K1\\SK1\\SSK1", "K1\\SK1\\SSK2", "K2", "K2\\SK1\\SSK1", "K2\\SK1\\SSK2"};
        DepartmentStrArray testDepartments = new DepartmentStrArray();
        Map<String, List<String>> expectedMapDepartment = new TreeMap<>();
        Map<String, List<String>> result = new TreeMap<>();

        result = testDepartments.deleteGapAtdepartaments(departments);

        System.out.println(result);
    }

}