package ru.job4j.task34352sortdeparament;


import java.util.*;

import static java.util.Arrays.asList;


public class DepartmentStrArray {

    Map<String, String[]> departmenstSort = new TreeMap<>();
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
        DepartmentStrArray departmentStrArray = new DepartmentStrArray();

        Map<String, List<String>> mapTreeSortDepartmentsBeforeComporator = new TreeMap<>();

        Map<String, List<String>> tempDeportametnShouldAdd = new TreeMap<>();

        mapTreeSortDepartmentsBeforeComporator = departmentStrArray.fillMapDepartments(departments);

        for (List<String> oneDepartamentList : mapTreeSortDepartmentsBeforeComporator.values()) {
            if (oneDepartamentList.size() <= 1) {
                continue;
            } else {
                List<String> subListFromDepartmentMinusLast = new ArrayList<>();
                subListFromDepartmentMinusLast = oneDepartamentList.subList(0, oneDepartamentList.size() - 1);
                for (List<String> TwoDepartamentList : mapTreeSortDepartmentsBeforeComporator.values()) {
                    if (subListFromDepartmentMinusLast.equals(TwoDepartamentList)) {
                        continue;
                    } else {
                        String append = " ";
                        for (String element : subListFromDepartmentMinusLast) {
                            append += element + "\\";
                        }
                        tempDeportametnShouldAdd.put(append, subListFromDepartmentMinusLast);
                    }
                }
            }
        }

        mapTreeSortDepartmentsBeforeComporator.putAll(tempDeportametnShouldAdd);


        return mapTreeSortDepartmentsBeforeComporator;
    }

    public String[] returnOurDepartamentsArrayFromOurMap(Map<String, List<String>> mapTreDepartmentsAfterSortWithComporator) {
        Map<String, List<String>> mapDepartments;
        mapDepartments = mapTreDepartmentsAfterSortWithComporator;
        String[] departments = new String[mapDepartments.size()];

        for (String departmentMap : mapTreDepartmentsAfterSortWithComporator.keySet()) {
            int i = 0;
            departments[i] = departmentMap;
            i++;
        }
        return departments;
    }

    public String[] deletAndSortArraysbyAscendingOrderHigh(String[] departments) {

        DepartmentStrArray ourDepartments = new DepartmentStrArray();
        ourDepartments.deleteGapAtdepartaments(departments);

        departments = ourDepartments.returnOurDepartamentsArrayFromOurMap(ourDepartments.deleteGapAtdepartaments(departments));
        return departments;
    }

    public String[] deletAndSortArraysbyDescendingOrederLow(String[] departments) {
        DepartmentStrArray ourDepartments = new DepartmentStrArray();
        ourDepartments.deleteGapAtdepartaments(departments);
        Map<String, List<String>> ourTreMapDepartmentsForDescendingOr = new TreeMap<>(Collections.reverseOrder());
        ourTreMapDepartmentsForDescendingOr.putAll(ourDepartments.deleteGapAtdepartaments(departments));

        departments = ourDepartments.returnOurDepartamentsArrayFromOurMap(ourTreMapDepartmentsForDescendingOr);
        return departments;
    }

}