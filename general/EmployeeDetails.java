package general;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDetails {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

       // Employee emp1 = new Employee("reena", 23, 47000);

        employees.add(new Employee("reena", 23, 47000));
        employees.add(new Employee("anu", 26, 50000));
        employees.add(new Employee("meena", 29, 52000));
        employees.add(new Employee("abi", 30,100000));
        employees.add(new Employee("sami", 48, 48000));

      for(Employee employee: employees){
          employee.displaySalarySlip();
      }

    }

}

//5% - tax
//2% - pf
//
//net salary = total
//
//grocessary:
//18%gst
//total bill
