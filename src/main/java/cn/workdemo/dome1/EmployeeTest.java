package cn.workdemo.dome1;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];

        staff[0]= new Employee("Sun",2200,2019,8,25);
        staff[1]= new Employee("Hacker",3200,2019,9,25);
        staff[2]= new Employee("Tony",4200,2019,10,25);

        for(Employee e : staff){
            e.raiseSalary(5);
        }

        for(Employee e : staff){
            System.out.println("name="+e.getName()+", salary="+e.getSalary()+", hireDay="+e.getHireDay());
        }

        System.out.println(staff[0].equals(staff[2]));

    }
}
