package Lectia11;

import java.util.Date;

public class Ex1 {
    class Person {
        protected String name;
        protected int yearOfBirth;
        protected String address;
    }

    class Employee extends Person {
        protected Date startDate;
        protected Long salary;
    }

    class Doctor extends Employee {
        private String specialization;
    }

    class Patient extends Person {
        private String diagnosis;
    }

}

