package Inheritance;

/**
 * Created by cody.mellon on 4/1/16.
 */
public class Person {
    //declare default variables for a person
    String name;
    String address;
    String phone;
    String email;
    //default person constructor
    public Person(String n, String add, String pn, String em){
        name = n;
        address = add;
        phone = pn;
        email = em;
    }
    //default person ToString method
    public String ToString(){
        return name + ", " + address + ", " + phone + ", " + email;
    }
}
class Student extends Person{
    String status;
    //student constructor
    public Student(String n, String add, String pn, String em, String st){
        super(n,add,pn,em);
        status = st;
    }
    //Student ToString method
    @Override
    public String ToString(){
        return name + ", " + address + ", " + phone + ", " + email + ", " + status;
    }
}
class Employee extends Person{
    String office;
    int salary;
    String hireDate;
    //Employee constructor
    public Employee(String n, String add, String pn, String em, String off, int sal, String hd){
        super(n,add,pn,em);
        office = off;
        salary = sal;
        hireDate = hd;
    }
    //Employee ToString method
    @Override
    public String ToString(){
        return name + ", " + address + ", " + phone + ", " + email + ", " + office + ", " + salary + ", " + hireDate;
    }
}
class Faculty extends Employee{
    String officeHours;
    String rank;
    //Faculty constructor
    public Faculty(String n, String add, String pn, String em, String off, int sal, String hd, String oh, String rnk){
        super(n,add,pn,em,off,sal,hd);
        officeHours = oh;
        rank = rnk;
        }
    //Faculty ToString method
    @Override
    public String ToString(){
        return name + ", " + address + ", " + phone + ", " + email + ", " + office + ", " + salary + ", " + hireDate + ", " + officeHours + ", " + rank;
    }
}
class Staff extends Employee{
    String title;
    //Staff constructor
    public Staff(String n, String add, String pn, String em, String off, int sal, String hd, String ti){
        super(n,add,pn,em,off,sal,hd);
        title = ti;
    }
    //Staff ToString method
    @Override
    public String ToString(){
        return name + ", " + address + ", " + phone + ", " + email + ", " + office + ", " + salary + ", " + hireDate + ", " + title;
    }
}
