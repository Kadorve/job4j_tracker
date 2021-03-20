package ru.job4j.pojo;

import java.time.LocalDate;
import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Ivan Ivanov");
        student.setGroup("EN - 101");
        LocalDate date = LocalDate.of(2011,8,5);
        student.setAdmission(date);

        System.out.println(student.getName() + " enrolled to group: " + student.getGroup() + " since " + student.getAdmission());
    }
}
