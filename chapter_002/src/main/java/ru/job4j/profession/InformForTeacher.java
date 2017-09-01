package ru.job4j.profession;

/**
 * Created by maksi on 27.08.2017.
 */
public   class InformForTeacher {


    String[] array = {"a_4", "b-5"};

    public class Form {

        public Form(String calledForm){
            this.calledForm=calledForm;

        }

         private String calledForm="";

         Form b6=new Form("b_6");
         Form a4=new Form("a_4");


        public String getCalledForm() {
            return this.calledForm;
        }

    }


}
