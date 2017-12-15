package com.overview.bianxietest;

import com.overview.bianxietest_1.EmpBusinessLogic;
import com.overview.bianxietest_1.EmployeeDetails;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by renwujie on 2017/12/15 at 14:12
 */
public class TestEmployeeDetails {
    EmpBusinessLogic empBusinessLogic = new EmpBusinessLogic();
    EmployeeDetails employee = new EmployeeDetails();

    //test to check appraisa
    @Test
    public void testCalculateAppriasal(){
        employee.setName("renwujie");
        employee.setAge(23);
        employee.setMonthlySalyry(2000);
        double appraisal = empBusinessLogic.calculateeAppraisal(employee);
        assertEquals(500, appraisal, 0.0);

    }


    // test to check yearly salary
    @Test
    public void testCalculateYearlySalary(){
        employee.setName("renwujie");
        employee.setAge(24);
        employee.setMonthlySalyry(11000);
        double salary = empBusinessLogic.calculateYearlySalary(employee);
        assertEquals(132000, salary, 0.0);
    }

}
