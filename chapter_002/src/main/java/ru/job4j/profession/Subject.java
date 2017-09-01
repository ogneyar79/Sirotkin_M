package ru.job4j.profession;


/**
 * Created by maksi on 27.08.2017.
 */
public class Subject {

    public Subject() {

    }

    int qvantity = 3;
    int number;
    private String calledSubject = " Math ";
    String name;


    public Subject(String calledSubject, int number) {
        this.calledSubject = calledSubject;
        this.number = number;
    }


    public Subject(String calledSubject, int number, String name) {
        this.calledSubject = calledSubject;
        this.number = number;
        this.name = name;
    }

    Subject[] subLissts = new Subject[qvantity];
    Subject sub=new Subject();
    subLissts[0]=new Subject("Math",0,"Ivanov Vasiliy");


    // Как сделать чтобы в объект данного класса могло быть несколько имен или не одного?
    sub.subLissts[1]=new Subject("Chemistry", 1, "Petrov Matvey");

    subLissts[2] = ("Geometry",2 , "Ivanov Vasiliy");

    public String getCalledSubj(String name) {
        String ansered = " ";
        for (Subject predmet : SuLissts) {
            if (this.name == name) {
                 ansered=this.calledSubject;

                             }
else {
                ansered="Преподователь"+" "+ name + " " + "Не ведет ни один предмет в нашей школе ";

            }

        }
        return ansered;
    }
}