package com.example.emicalculator;

public class EMI_Model {
    private double loan;
    private double interest;
    private double no_of_month;

    public EMI_Model(double loan, double interest, double no_of_month) {
        this.loan = loan;
        this.interest = interest;
        this.no_of_month = no_of_month;
    }

    public double getLoan()
    {
        return loan;
    }

    public void setLoan(double loan)
    {
        this.loan = loan;
    }

    public double getInterest()
    {
        return interest;
    }

    public void setInterest(double interest)
    {
        this.interest = interest;
    }

    public double getNo_of_month() {
        return no_of_month;
    }

    public void setNo_of_month(double no_of_month) {
        this.no_of_month = no_of_month;
    }
}
