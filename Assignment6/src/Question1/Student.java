package Question1;

import java.util.Comparator;
import java.util.Date;

public class Student {
    private int id;
    private String name;
    private double gpa;
    private Date dateOfBirth;

    public Student(int id, String name, double gpa, Date dateOfBirth) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
        this.dateOfBirth = dateOfBirth;
    }

    public static final Comparator<Student> NameComparator = new Comparator<Student>(){

        @Override
        public int compare(Student s1, Student s2) {
            return s1.name.compareTo(s2.name);
        }

    };

    public static final Comparator<Student> GpaComparator = new Comparator<Student>(){

        @Override
        public int compare(Student s1, Student s2) {
            return Double.compare(s2.gpa, s1.gpa);
        }

    };

    public static final Comparator<Student> DateOfBirthComparator = new Comparator<Student>(){

        @Override
        public int compare(Student s1, Student s2) {
            return s1.dateOfBirth.compareTo(s2.dateOfBirth);
        }

    };

    public void printStudentInfo() {
        System.out.println("Id: " + this.id + " | Name: " + this.name
                + " | GPA: " + this.gpa +
                " | Date of Birth: " + this.dateOfBirth.getYear() + "." + this.dateOfBirth.getMonth() + "." + this.dateOfBirth.getDate());
    }

}
