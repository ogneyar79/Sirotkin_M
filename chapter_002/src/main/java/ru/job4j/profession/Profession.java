package ru.job4j.profession;


/**
 * Класс Profession общий для других профессий.
 *
 * @author Sirotkin.
 */
public class Profession {

    /**
      * name value of field for class Profession(The name that person has).
      */
    String name;

    /**
      * speciality value of field for class Profession.
      */
    String speciality;

    /**
     * salary value of field for class Profession.
     */
   int salary;

    /**
     * speciality value of field for class Profession(minimum salary).
     */
    int baseSal;

int hours;


public Profession (String name, String speciality, int baseSal){

    this.name = name;
    this.speciality = speciality;
    this.baseSal = baseSal;
}
    public int paySal() {
        return salary;

    }






}

