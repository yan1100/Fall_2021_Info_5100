package Question1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(1000001,"Abby",4.0,new Date(2002, 5,12)));
        list.add(new Student(1000002,"Candice",3.0,new Date(1998, 4,01)));
        list.add(new Student(1000003,"Bryan",3.8,new Date(1996, 3,12)));
        list.add(new Student(1000004,"Cathy",3.5,new Date(1996, 3,18)));
        list.add(new Student(1000005,"Anderson",3.6,new Date(1999, 1,6)));

        System.out.println("List by Name:");
        Collections.sort(list,Student.NameComparator);
        for (Student student : list) {
            student.printStudentInfo();
        }

        System.out.println("\nList by GPA:");
        Collections.sort(list,Student.GpaComparator);
        for (Student student : list) {
            student.printStudentInfo();
        }

        System.out.println("\nList by Date of Birth:");
        Collections.sort(list,Student.DateOfBirthComparator);
        for (Student student : list) {
            student.printStudentInfo();
        }


    }
}
