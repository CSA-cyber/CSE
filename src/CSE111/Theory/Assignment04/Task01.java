package CSE111.Theory.Assignment04;


import java.util.LinkedList;

class Student{

    private static int numberOfStudents;
    private String name, typeOfStudent, id, university;
    public LinkedList<Course> course = new LinkedList<Course>();


    public Student(String name){
        this(name,"Regular Student");
    }

    public Student(String name, String typeOfStudent) {
        this.name=name;
        this.typeOfStudent=typeOfStudent;
        this.id=""+numberOfStudents;
        this.numberOfStudents++;
    }

    public void addCourse(Course c1, Course c2, Course c3, Course c4) {
        course.add(c1);
        course.add(c2);
        course.add(c3);
        course.add(c4);
    }

    public void addCourse(Course c1, Course c2, Course c3) {
        course.add(c1);
        course.add(c2);
        course.add(c3);
    }

    public String getID() {
        return this.id;
    }

    public void setUniversity(String university){
        this.university = university;
    }

    public boolean isNSU(){
        return this.university.equals("BRAC University");
    }

    public String  getName() {
        return this.name;
    }

    public boolean isPreUni(){
        return typeOfStudent.equals("Pre-Uni");
    }

    public void completePreUni(){
        this.typeOfStudent="Regular";
    }


    public String toString(){
        String s = "";
//        for (int i = 0; i < course.size(); i++) {
//            s += " " + course.get(i);
//        }

        for (Course c: course){
            s+=" "+c;
        }
        return String.format("Name: %s\nID: %s\n%s\nUniversity: %s\nList of courses:%s\n", getName(), getID(), this.typeOfStudent, this.university, s);
    }
}

class Course{

    private String name;

    public Course(String name){
        this.name=name;
    }

    public String toString(){
        return this.name;
    }
}

class University{

    private String name;
    private boolean hasCampus;
    private LinkedList<Student> students= new LinkedList<>();

    public University(String name){
        this(name, false);
    }

    public University(String name, boolean hasCampus){
        this.name=name;
        this.hasCampus=hasCampus;
    }

    public void add(Student student){
        this.students.add(student);
        student.setUniversity(this.name);
    }

    public int totalStudents(){
        return this.students.size();
    }

    public boolean needCampus(){
        return !this.hasCampus;
    }

    public String toString(){
        return String.format("University{name='%s', hasCampus=%s}", this.name, this.hasCampus);
    }
}

public class Task01 {
    public static void main(String[] args) {

        //Parameters: name, ID
        Student studentOne = new Student("A");

        //Parameters: name, typeOfStudent
        Student studentTwo = new Student("B","Pre-Uni");

        Student studentThree = new Student("C");
        Student studentFour = new Student("D","Pre-Uni");
        Student studentFive = new Student("E");
        Student studentSix = new Student("F","Pre-Uni");
        Student studentSeven = new Student("G");
        Student studentEight = new Student("H","Pre-Uni");
        Student studentNine = new Student("I");
        Student studentTen = new Student("J","Pre-Uni");
        Student studentEleven = new Student("K");
        Student studentTwelve = new Student("L","Pre-Uni");
        Student studentThirteen = new Student("M");
        Student studentFourteen = new Student("N","Pre-Uni");
        Student studentTwenty = new Student("N","Pre-Uni");

        //Parameters: name
        Course c1 = new Course("CSE110");
        Course c2 = new Course("CSE111");
        Course c3 = new Course("CSE220");
        Course c4 = new Course("CSE221");
        Course c5 = new Course("CSE320");
        Course c6 = new Course("CSE321");
        Course c7 = new Course("CSE330");
        Course c8 = new Course("CSE331");
        Course c9 = new Course("CSE340");
        Course c10 = new Course("CSE341");
        Course c11 = new Course("CSE420");


        //A student can either take 3 or 4 courses. Fixed.
        studentOne.addCourse(c1,c2,c3,c4);
        studentThree.addCourse(c5,c6,c7,c8);
        studentFive.addCourse(c9,c10,c11);


        System.out.println(studentOne);
        System.out.println(studentOne.course.size());
        System.out.println(studentTwo.getID());
        System.out.println(studentTwenty.getID());


        //Parameters: name
        University brac = new University("BRAC University");

        //Parameters: name, hasCampus
        University nsu = new University("BRAC University", true);


        brac.add(studentOne);
        brac.add(studentTwo);
        brac.add(studentThree);
        brac.add(studentFour);
        brac.add(studentFive);
        brac.add(studentSix);
        brac.add(studentSeven);
        brac.add(studentEight);

        nsu.add(studentNine);
        nsu.add(studentTen);
        nsu.add(studentEleven);
        nsu.add(studentTwelve);
        nsu.add(studentThirteen);
        nsu.add(studentFourteen);

        System.out.println(brac);
        System.out.println(nsu);

        if(studentOne.isNSU()) {
            System.out.printf("Yes, %s is of NSU\n", studentOne.getName());
        }
        else {
            System.out.printf("No, %s is not of NSU\n", studentOne.getName());
        }

        if(studentTwo.isPreUni()) {
            System.out.println("This guy needs time");
        }
        else {
            System.out.println("Congrats, less money to spend.");
        }

        if(nsu.totalStudents() > brac.totalStudents()) {
            System.out.println("NSU has the highest number of students");
        }
        else {
            System.out.println("East or west amra best.");
        }

        System.out.println(brac.needCampus());
        System.out.println(nsu.needCampus());

        studentFourteen.completePreUni();

        if(studentFourteen.isPreUni()) {
            System.out.println("This guy needs time");
        }
        else {
            System.out.println("Congrats, less money to spend.");
        }
    }
}
