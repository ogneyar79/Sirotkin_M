package ru.job4j.task34352sortdeparament;

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
        DepartmentStrArray departmentStrArray = new DepartmentStrArray();


        Map<String, List<String>> tempDeportametnShouldAdd = new TreeMap<>();

        sortDepartmetns = fillMapDepartments(departments);

        for (List<String> oneDepartamentList : sortDepartmetns.values()) {
            if (oneDepartamentList.size() <= 1) {
                continue;
            } else {
                List<String> subListFromDepartmentMinusLast = new ArrayList<>();
                subListFromDepartmentMinusLast = oneDepartamentList.subList(0, oneDepartamentList.size() - 1);

                for (List<String> oneListFromMapDepartments : sortDepartmetns.values()) {

                    List<String> oneListFromDepartmentsGet = new ArrayList<>();
                    int i = 0;
                    oneListFromDepartmentsGet = oneListFromMapDepartments;
                    i++;
                    if (subListFromDepartmentMinusLast.equals(oneListFromDepartmentsGet)) {
                        break;
                    } else if (!subListFromDepartmentMinusLast.equals(oneListFromDepartmentsGet) && i == sortDepartmetns.size() - 1 && subListFromDepartmentMinusLast.size() == 1) {
                        String append = " ";
                        append = subListFromDepartmentMinusLast.get(0);
                        tempDeportametnShouldAdd.put(append, subListFromDepartmentMinusLast);

                    } else if (!subListFromDepartmentMinusLast.equals(oneListFromDepartmentsGet) && i == sortDepartmetns.size() - 1 && subListFromDepartmentMinusLast.size() > 1) {
                        String appendd2 = " ";
                        for (String element : subListFromDepartmentMinusLast) {
                            appendd2 += element + "\\";
                        }
                        tempDeportametnShouldAdd.put(appendd2, subListFromDepartmentMinusLast);

                    }
                }
            }
        }
        sortDepartmetns.putAll(tempDeportametnShouldAdd);

        return sortDepartmetns;
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