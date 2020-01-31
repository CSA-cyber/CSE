package CSE111.Lab.Week10;

import java.util.Arrays;
import java.util.Scanner;

interface STInterface {
    void setName(String name);
    void setID(String id);
    String getName();
    String getID();
}

class Student implements STInterface, Comparable<Student> {
    private String name, id;

    public Student(String name, String id) {
        setName(name);
        setID(id);
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setID(String id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getID() {
        return this.id;
    }

    @Override
    public int compareTo(Student s) {
        return this.getName().compareTo(s.getName());
    }

    public String toString() {
        return String.format("Name: %s\nID: %s", getName(), getID());
    }
}

public class T09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Student array[] = new Student[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Student(in.next(), in.next());
        }

        Arrays.sort(array);
        for (Student s: array)
            System.out.println(s);
    }
}
