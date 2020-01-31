package CSE111.Theory.Assignment03;

import java.util.ArrayList;
import java.util.List;

class Teacher{

    String name;
    private String department;
    private List <Course> course = new ArrayList<>();
    private int courseCount=0;

    public Teacher(String name, String department){
        this.name = name;
        this.department = department;
    }

    public void addCourse(Course course){
        this.course.add(course);
        this.courseCount++;
    }
    public void printDetail(){
        System.out.printf("========================\n");
        System.out.printf("Name: %s\n",this.name);
        System.out.printf("Department: %s\n",this.department);
        System.out.printf("List of courses\n");
        System.out.printf("========================\n");
        for (int i = 0; i <course.size(); i++) {
            System.out.printf("%s\n",course.get(i));
        }
        System.out.printf("========================\n");
    }
}

class Course {

    public String name;

    public Course(String name){
        this.name = name;
    }

    public String toString(){
        return this.name;
    }
}

public class TestTeacher{
    public static void main(String [] args){
        Teacher t1 = new Teacher("Saad Abdullah", "CSE");
        Teacher t2 = new Teacher("Mumit Khan", "CSE");
        Teacher t3 = new Teacher("Sadia Kazi", "CSE");
        Course c1 = new Course("CSE 110 Programming Language I");
        Course c2 = new Course("CSE 111 Programming Language-II");
        Course c3 = new Course("CSE 220 Data Structures");
        Course c4 = new Course("CSE 221 Algorithms");
        Course c5 = new Course("CCSE 230 Discrete Mathematics");
        Course c6 = new Course("CSE 310 Object Oriented Programming");
        Course c7 = new Course("CSE 320 Data Communications");
        Course c8 = new Course("CSE 340 Computer Architecture");
        t1.addCourse(c1);
        t1.addCourse(c2);
        t2.addCourse(c3);
        t2.addCourse(c4);
        t2.addCourse(c5);
        t3.addCourse(c6);
        t3.addCourse(c7);
        t3.addCourse(c8);
        t1.printDetail();
        t2.printDetail();
        t3.printDetail();
    }
}

