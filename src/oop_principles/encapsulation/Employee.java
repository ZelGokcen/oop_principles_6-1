package oop_principles.encapsulation;

public class Employee {

    public Employee(){}

    // Create 4-args constructors
    public Employee(String fullName, String title, int age, Company company) {
        this.fullName = fullName;
        this.title = title;
        this.age = age;
        this.company = company;
    }

    // Create 4 instance variables -> fullName, title, age, company (Company{name=Apple, address=California, phone=(000) 000-0000})
    private String fullName;
    private String title;
    private int age;
    private Company company;


    // Encapsulate all the fields
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }


    // Override toString() method

    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", title='" + title + '\'' +
                ", age=" + age +
                ", company=" + company +
                '}';
    }
}
