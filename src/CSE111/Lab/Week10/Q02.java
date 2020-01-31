package CSE111.Lab.Week10;

abstract class Person {
    protected String name;

    Person(String name){
        this.name = name;
    }

    protected abstract String getName();
}

class Employee extends Person{
    private double salary;
    int joinYear;
    String insuranceNo;

    public Employee(String name, double salary, int joinYear, String insuranceNo){
        super(name);
        this.salary = salary;
        this.joinYear = joinYear;
        this.insuranceNo = insuranceNo;
    }

    public String getName() {
        return super.name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getJoinYear() {
        return joinYear;
    }

    public void setJoinYear(int joinYear) {
        this.joinYear = joinYear;
    }

    public String getInsuranceNo() {
        return insuranceNo;
    }

    public void setInsuranceNo(String insuranceNo) {
        this.insuranceNo = insuranceNo;
    }

    public boolean equals(Object anObject) {
        if (anObject.equals(this))
            return true;
        else if (anObject instanceof Employee){
            Employee anEmployee = (Employee)anObject;
            return this.getInsuranceNo().equals(anEmployee.getInsuranceNo());
        }

        return false;
    }
}

public class Q02 {
    public static void main(String[] args) {

    }
}
