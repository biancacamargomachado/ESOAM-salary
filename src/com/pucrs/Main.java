package com.pucrs;

public class Main {
    public int employeeCode;
    public static void main(String args[]) {
        // code here
    }
    public Main(int code) {
        employeeCode = code;
    }

    public double CalculateSalary(double hours, double hourValue){
        if (hours < 0 || hourValue <0)
            return 0;
        return hours*hourValue;
    }
}
