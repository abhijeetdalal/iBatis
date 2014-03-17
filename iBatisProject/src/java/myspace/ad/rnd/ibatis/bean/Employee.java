package myspace.ad.rnd.ibatis.bean;

/**
 * Employee class used in all the queries in this project.
 * 
 * @author Abhijeet Dalal
 */
public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    /* Define constructors for the Employee class. */
    public Employee() {
    }

    public Employee(String fname, String lname, int salary) {
	this.firstName = fname;
	this.lastName = lname;
	this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String first_name) {
        this.firstName = first_name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String last_name) {
        this.lastName = last_name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

}
