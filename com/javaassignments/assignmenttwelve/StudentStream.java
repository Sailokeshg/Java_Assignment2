package com.javaassignments.assignmenttwelve;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentStream {
      List<Student> studentList;
    public StudentStream() {
        studentList = new ArrayList<>();
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

    }

    public static void main(String[] args) {
        StudentStream parser = new StudentStream();
        parser.printDepartment();
        parser.printEnrollmentsAfter2018();
        parser.printAllMalesInCS();
        parser.printTotalNumberOfMaleAndFemale();
        parser.printAverageAge();
        parser.printHighestPercentage();
        parser.printNumberOfStudentsInEachDepartment();
        parser.printAveragePercentageInDepartments();
        parser.printYoungestMaleInElectronicDepartment();
        parser.printCountOfMaleAndFemaleInCS();


    }
    public void printDepartment(){
        studentList.stream()
                .map(i -> i.getEngDepartment())
                .distinct()
                .forEach(System.out::println);
    }
    public void printEnrollmentsAfter2018(){
        studentList.stream().filter(s -> s.getYearOfEnrollment() > 2018)
                .map(s -> s.getName())
                .forEach(System.out::println);
    }
    public void printAllMalesInCS(){
        studentList.stream()
                .filter(s -> s.getGender().equals("Male"))
                .filter(s -> s.getEngDepartment().equals("Computer Science"))
                .forEach(s -> System.out.println("id: " + s.getId()+ ", name: " + s.getName() + ", age: " + s.getAge() + ", gender: " + s.getGender() + ", engDepartment: " + s.getEngDepartment() + ", year of enrollment: " + s.getYearOfEnrollment() + ", percentage till date: " + s.getPercentageTillDate()));

    }
    public void printTotalNumberOfMaleAndFemale(){
        Map<Object, Long> maleAndFemaleCount = studentList.stream().collect(Collectors.groupingBy(s -> s.getGender(), Collectors.counting()));
        System.out.println(maleAndFemaleCount);
    }
    public void printAverageAge(){
        studentList.stream().filter(s -> s.getGender().equals("Male"))
                .mapToInt(s -> s.getAge()).average()
                .ifPresent(s -> System.out.println("Average age of male students is: " + s));
        studentList.stream().filter(s -> s.getGender().equals("Female"))
                .mapToInt(s -> s.getAge()).average()
                .ifPresent(s -> System.out.println("Average age of female students is: " + s));
    }
    public void printHighestPercentage(){
        studentList.stream().max(Comparator.comparing(s -> s.getPercentageTillDate()))
                .ifPresent(s -> System.out.println("Maximum percentage is having by the student named" + s.getName()));
    }
    public void printNumberOfStudentsInEachDepartment(){
        Map<Object, Long> studentCountByDept = studentList.stream().collect(Collectors.groupingBy(s -> s.getEngDepartment(), Collectors.counting()));
        System.out.println(studentCountByDept);
    }
    public void printAveragePercentageInDepartments(){
        Map<Object, Double> averageOfEachDepartment = studentList.stream()
                .collect(Collectors.groupingBy(s -> s.getEngDepartment(), Collectors.averagingDouble(s -> s.getPercentageTillDate())));
        System.out.println(averageOfEachDepartment);
    }
    public void printYoungestMaleInElectronicDepartment(){
        studentList.stream().filter(e -> e.getGender().equals("Male") && e.getEngDepartment().equals("Electronic"))
                .min(Comparator.comparingInt(s -> s.getAge())).ifPresent(s -> System.out.println("Youngest male student in Electronic department is " + s.getName()));
    }
    public void printCountOfMaleAndFemaleInCS(){
        Map<String, Long> countMaleFemaleStudentsInComputerScience = studentList.stream().filter(s -> s.getEngDepartment().equals("Computer Science"))
                .collect(Collectors.groupingBy(s -> s.getGender(), Collectors.counting()));
        System.out.println(countMaleFemaleStudentsInComputerScience);
    }

}
