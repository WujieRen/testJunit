package com.overview.bianxietest_1;

/**
 * Created by renwujie on 2017/12/15 at 14:06
 */
public class EmpBusinessLogic {
    // Calculate the yearly salary of employee
    public double calculateYearlySalary(EmployeeDetails employeeDetails){
        double yearlySalary = 0;
        yearlySalary = employeeDetails.getMonthlySalyry() * 12;
        return yearlySalary;
    }

    // Calculate the appraisal amount of employee
    public double calculateeAppraisal(EmployeeDetails employeeDetails){
        double appraisal = 0;
        if(employeeDetails.getMonthlySalyry() < 10000){
            appraisal = 500;
        } else {
            appraisal = 1000;
        }
        return appraisal;
    }

}
