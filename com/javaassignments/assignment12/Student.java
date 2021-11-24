package com.javaassignments.assignment12;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Student {
    int id;
    String name;
    int age;
    String gender;
    String engDepartment;
    int yearOfEnrollment;
    Double percentageTillDate;

    public Student(int id, String name, int age, String gender, String engDepartment, int yearOfEnrollment, Double percentageTillDate) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.engDepartment = engDepartment;
        this.yearOfEnrollment = yearOfEnrollment;
        this.percentageTillDate = percentageTillDate;
    }
}

class StreamOfStudents {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(111, "Jiya Brein", 17, "Female", "Computer Science", 2018, 70.8));
        studentList.add(new Student(111, "Jiya Brein", 17, "Female", "Computer Science", 2018, 70.8));
        studentList.add(new Student(133, "Martin Theron", 17, "Male", "Electronic", 2017, 90.3));
        studentList.add(new Student(144, "Murali Gowda", 18, "Male", "Electrical", 2018, 80.0));
        studentList.add(new Student(155, "Nima Roy", 19, "Female", "Textile", 2016, 70.0));
        studentList.add(new Student(166, "Iqbal Hussain", 18, "Male", "Security", 2016, 70.0));
        studentList.add(new Student(177, "Manu Sharma", 16, "Male", "Chemical", 2018, 70.0));
        studentList.add(new Student(188, "Wang Liu", 20, "Male", "Computer Science", 2015, 80.0));
        studentList.add(new Student(199, "Amelia Zoe", 18, "Female", "Computer Science", 2016, 85.0));
        studentList.add(new Student(200, "Jaden Dough", 18, "Male", "Security", 2015, 82.0));
        studentList.add(new Student(211, "Jasna Kaur", 20, "Female", "Electronic", 2019, 83.0));
        studentList.add(new Student(222, "Nitin Joshi", 19, "Male", "Textile", 2016, 60.4));
        studentList.add(new Student(233, "Jyothi Reddy", 16, "Female", "Computer Science", 2015, 45.6));
        studentList.add(new Student(244, "Nicolus Den", 16, "Male", "Electronic", 2017, 95.8));
        studentList.add(new Student(255, "Ali Baig", 17, "Male", "Electronic", 2018, 88.4));
        studentList.add(new Student(266, "Sanvi Pandey", 17, "Female", "Electric", 2019, 72.4));
        studentList.add(new Student(277, "Anuj Chettiar", 18, "Male", "Computer Science", 2017, 57.5));


        System.out.println("Task -1");
        // Print the name of all departments in the college
        studentList.stream()
                .map(i -> i.engDepartment)
                .distinct()
                .forEach(System.out::println);

        System.out.println("Task -2");
        //Get the names of all students who have enrolled after 2018
        studentList.stream().filter(s -> s.yearOfEnrollment > 2018)
                .map(s -> s.name)
                .forEach(System.out::println);

        System.out.println("Task -3");
        //Get the details of all male student in the computer sci department
        studentList.stream().filter(s -> s.gender.equals("Male"))
                .filter(s -> s.engDepartment.equals("Computer Science"))
                .forEach(s -> System.out.println("id: " + s.id + ", name: " + s.name + ", age: " + s.age + ", gender: " + s.gender + ", engDepartment: " + s.engDepartment + ", year of enrollment: " + s.yearOfEnrollment + ", percentage till date: " + s.percentageTillDate));

        System.out.println("Task -4");
        //How many male and female student are there
        Map<Object, Long> maleFemaleCount = studentList.stream().collect(Collectors.groupingBy(s -> s.gender, Collectors.counting()));
        System.out.println(maleFemaleCount);

        System.out.println("Task -5");
        //What is the average age of male and female students
        studentList.stream().filter(s -> s.gender.equals("Male"))
                .mapToInt(s -> s.age).average()
                .ifPresent(s -> System.out.println("Average age of male students is: " + s));
        studentList.stream().filter(s -> s.gender.equals("Female"))
                .mapToInt(s -> s.age).average()
                .ifPresent(s -> System.out.println("Average age of female students is: " + s));


        System.out.println("Task -6");
        //Get the name of  student having the highest percentage.
        studentList.stream().max(Comparator.comparing(s -> s.percentageTillDate))
                .ifPresent(s -> System.out.println("Maximum percentage is having by the student named" + s.name));

        System.out.println("Task -7");
        //Count the number of students in each department?
        Map<Object, Long> studentCountByDept = studentList.stream().collect(Collectors.groupingBy(s -> s.engDepartment, Collectors.counting()));
        System.out.println(studentCountByDept);


        System.out.println("Task-8");
        //What is the average percentage achieved in each department
        Map<Object, Double> averageOfEachDepartment = studentList.stream().collect(Collectors.groupingBy(s -> s.engDepartment, Collectors.averagingDouble(s -> s.percentageTillDate)));
        System.out.println(averageOfEachDepartment);

        System.out.println("Task -9");
        //Get the details of the youngest male student in the Electronic department
        studentList.stream().filter(e -> e.gender.equals("Male") && e.engDepartment.equals("Electronic"))
                .min(Comparator.comparingInt(s -> s.age)).ifPresent(s -> System.out.println("Youngest male student in Electronic department is " + s.name));

        System.out.println("Task -10");
        //How many male and female students are there in the computer science department?
        Map<String, Long> countMaleFemaleStudentsInComputerScience = studentList.stream().filter(s -> s.engDepartment.equals("Computer Science"))
                .collect(Collectors.groupingBy(s -> s.gender, Collectors.counting()));
        System.out.println(countMaleFemaleStudentsInComputerScience);
    }

}


