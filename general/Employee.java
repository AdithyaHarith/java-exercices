package general;

import org.w3c.dom.ls.LSOutput;

public class Employee {
    private String name;
    private int age;
    private int salary;
    private int tax, pf;

    private int netSalary,netSalary1;
    private int totalAmount;


    public Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;

    }

    public void displaySalarySlip() {
        System.out.println("Name:"+ name);
        System.out.println("Age:"+ age);
        System.out.println("BasicSalary:"+ salary);


//total salary -reduce pf and tax
 //employee total salary ,we can reduce the 5% of the tax and 2% of pf.

        if (salary > 40000) {
            tax = salary * 5 / 100;
            pf = salary * 2 / 100;
            netSalary = salary - tax;
            totalAmount = netSalary - pf;
        }
        if(salary>100000){
            tax=salary*10/100;
            pf=salary*5/100;
            netSalary=salary-tax;
            totalAmount=netSalary-pf;
        }

//        else {
//            totalAmount = salary;
//        }

        System.out.println("Tax:" +tax);
        System.out.println("PF:" +pf);
        System.out.println("NetSalary:" +totalAmount);
        System.out.println("-------------------------------------");

    }
}
