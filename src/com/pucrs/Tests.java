package com.pucrs;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Authors: Bianca C., Gabriel Löff
 */
import static org.junit.jupiter.api.Assertions.*;

class Tests {

    private Main payment;

    @BeforeEach
    public void init(){
        payment = new Main(31);
    }

    @Test
    public void testCalculateSalary() {
        double result = payment.CalculateSalary(25, 80);
        assertEquals(2000.0, result);
        System.out.println("testCalculateSalary");
    }

    @Test
    public void testCalculateWithZero() {
        double result = payment.CalculateSalary(0, 0);
        assertEquals(0, result);
        System.out.println("testCalculateWithZero");
    }

    @Test
    public void testCalculateWithNegativeValues() {
        double result = payment.CalculateSalary(-25, 50);
        assertEquals(0, result);
        System.out.println("testCalculateWithNegativeValues");
    }
}