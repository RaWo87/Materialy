package com.company;


    public class Employee implements Cloneable {
        private String name;

        private Obowiazki kompetencje = new Obowiazki();


        public Obowiazki getObowiazki(){
            return kompetencje;
        }

        public Employee(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        // in case "clone is protected in package" error ->
        // rightClick -> generate -> Override -> ObjectClone
        // in case of different package -> change to public
        // SHALLOW COPY
//        @Override
//        protected  Object clone() throws CloneNotSupportedException{
//            return super.clone();
//        }
        // DEEP COPY
        @Override
        protected Object clone() throws CloneNotSupportedException {
            Employee pracownik = (Employee)super.clone();
            pracownik.kompetencje = (Obowiazki)kompetencje.clone();
            return pracownik;
        }



    }

