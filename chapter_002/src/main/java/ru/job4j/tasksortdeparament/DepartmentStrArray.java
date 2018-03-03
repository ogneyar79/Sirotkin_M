package ru.job4j.tasksortdeparament;

import java.util.*;

import static java.util.Arrays.asList;

public class DepartmentStrArray {

    Map<String, List<String>> sortDepartmetns = new TreeMap<>();

    Map<String, List<String>> fillMapDepartments(String[] departments) {

        List<String> departmentsBest = new ArrayList<>();
        departmentsBest = asList(departments);

        for (String department : departmentsBest) {
            sortDepartmetns.put(department, asList(department.split("\\\\")));
        }

        return sortDepartmetns;
    }

    public Map<String, List<String>> deleteGapAtdepartaments(String[] departments) {

        Map<String, List<String>> tempDeportametnShouldAdd = new TreeMap<>();

        sortDepartmetns = fillMapDepartments(departments);

        for (List<String> oneDepartamentList : sortDepartmetns.values()) {
            if (oneDepartamentList.size() <= 1) {
                continue;
            } else {
                List<String> subListFromDepartmentMinusLast = new ArrayList<>();
                String append = "";
                subListFromDepartmentMinusLast = oneDepartamentList.subList(0, oneDepartamentList.size() - 1);

                if (!sortDepartmetns.containsValue(subListFromDepartmentMinusLast) && subListFromDepartmentMinusLast.size() == 1) {
                    append = subListFromDepartmentMinusLast.get(0);
                    tempDeportametnShouldAdd.put(append, subListFromDepartmentMinusLast);
                } else if (!sortDepartmetns.containsValue(subListFromDepartmentMinusLast) && subListFromDepartmentMinusLast.size() > 1) {
                    for (String element : subListFromDepartmentMinusLast) {
                        append += element + "\\";
                    }
                    String ap2 = append.substring(0, append.length() - 1);
                    tempDeportametnShouldAdd.put(ap2, subListFromDepartmentMinusLast);
                }
            }
        }
        sortDepartmetns.putAll(tempDeportametnShouldAdd);

        return sortDepartmetns;
    }

    public String[] returnDepartamentsArrayFromMap(Map<String, List<String>> mapTreDepartments) {

        String[] departments = new String[mapTreDepartments.size()];
        int i = 0;
        for (String departmentMap : mapTreDepartments.keySet()) {
            departments[i++] = departmentMap;
        }
        return departments;
    }

    public String[] deletAndSortArraysbyAscendingOrderHigh(String[] departments) {
        sortDepartmetns = deleteGapAtdepartaments(departments);
        return returnDepartamentsArrayFromMap(sortDepartmetns);
    }

    public String[] deletAndSortArraysbyDescendingOrederLow(String[] departments) {
        sortDepartmetns = deleteGapAtdepartaments(departments);
        Map<String, List<String>> ourTreMapDepartmentsForDescendingOr = new TreeMap<>(Collections.reverseOrder().thenComparing(new DescendingComporatorLow()));
        ourTreMapDepartmentsForDescendingOr.putAll(sortDepartmetns);

        departments = returnDepartamentsArrayFromMap(ourTreMapDepartmentsForDescendingOr);
        return departments;
    }

}