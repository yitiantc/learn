package cn.workdemo.dome1;

import java.time.LocalDate;

public class Employee {

    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String n,double s,int year ,int month ,int day){
        name = n;
        salary = s;
        hireDay = LocalDate.of(year,month,day);
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void setHireDay(LocalDate hireDay) {
        this.hireDay = hireDay;
    }

    public void raiseSalary(double byPercent){
        double raise = salary*byPercent/100;
        salary+=raise;
    }

    public boolean equals(Employee other){
        return name.equals(other.name);
    }
}
