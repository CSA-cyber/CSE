package CSE111.Lab.Week04;

public class Student {
    private String name="";
    private String id="";
    private String address="";
    private double cgpa=0.0;

    public Student(){
        this("","","",0.0);
    }

    public Student(String name){
        this(name,"","",0.0);
    }

    public Student(String name, String id){
        this(name,id,"",0.0);
    }

    public Student(String name, String id, String address){
        this(name,id,address,0);
    }

    public Student(String name, String id, String address, double cgpa){
        setName(name);
        setId(id);
        setAddress(address);
        setCgpa(cgpa);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }
    public String toString(){
        return String.format("Student's name : %-15s ID : %s Address : %-15s CGPA : %.2f",getName(),getId(),getAddress(),getCgpa());
    }
}
