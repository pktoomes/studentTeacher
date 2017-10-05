package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<Student> students = new ArrayList<>();
        Student alice = new Student("Alice", "Barkley", 1,1 );
        Student clark = new Student("Clark", "Dunbar", 2,1);
        Student elery = new Student("Elery", "Ferguson", 3,1);
        Student greg = new Student("Greg", "Henderson", 4,1);
        Student ian = new Student("Ian", "Jacobs", 5,1);
        Student kelly = new Student("Kelly", "Lawson", 6,1);
        Student madison = new Student("Madison", "Nickles", 7,1);
        Student olsen = new Student("Olsen", "Peppers", 8,1);
        Student quinton = new Student("Quinton", "Rauls", 9,1);
        Student steph = new Student("Steph", "Todd", 10,1);
        Student umberto = new Student("Umberto", "Vestal", 11,1);
        Student wilson = new Student("Wilson", "Xavier", 12,1);
        Student yosef = new Student("Yosef", "Zellers", 13,1);
        Student august = new Student("August", "Baker", 14,1);
        Student claire = new Student("Claire", "Dillards", 15,1);
        students.add(alice);
        students.add(clark);
        students.add(elery);
        students.add(greg);
        students.add(ian);
        students.add(kelly);
        students.add(madison);
        students.add(olsen);
        students.add(quinton);
        students.add(steph);
        students.add(umberto);
        students.add(wilson);
        students.add(yosef);
        students.add(august);
        students.add(claire);
        System.out.println(students);


        List<Teacher> teachers = new ArrayList<>();
        Teacher agatha = new Teacher("Agatha", "Christie", 1,1);
        Teacher hercule = new Teacher("Hercule", "Poirot", 2,1);
        Teacher mark = new Teacher("Mark", "Twain", 3, 1);
        teachers.add(agatha);
        teachers.add(hercule);
        teachers.add(mark);
        System.out.println(teachers);

        Set<Student> studentSet1 = new HashSet<>();
        studentSet1.add(alice);
        studentSet1.add(clark);
        studentSet1.add(elery);
        studentSet1.add(greg);
        studentSet1.add(ian);

        Set<Student> studentSet2 = new HashSet<>();
        studentSet2.add(kelly);
        studentSet2.add(madison);
        studentSet2.add(olsen);
        studentSet2.add(quinton);
        studentSet2.add(steph);

        Set<Student> studentSet3 = new HashSet<>();
        studentSet3.add(umberto);
        studentSet3.add(yosef);
        studentSet3.add(august);
        studentSet3.add(claire);

        Map<Teacher, Set> teacherMap = new HashMap<>();
        teacherMap.put(agatha, studentSet1);
        teacherMap.put(hercule, studentSet2);
        teacherMap.put(mark, studentSet3);

        for( int i = 0; i < teacherMap.size(); i ++){
            System.out.println( teacherMap.keySet() + " " + teacherMap.values());

        }
        


    }
}
