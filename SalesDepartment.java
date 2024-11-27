package org.example;

public class SalesDepartment {
    private String deptID;

    public SalesDepartment(String deptID) {
        this.deptID = deptID;
    }

    public boolean verifyCredit(Customer customer) {
        double creditScore = customer.getCreditScore();
        return creditScore >= 700; // Example logic: credit score must be 700 or higher
    }
}
