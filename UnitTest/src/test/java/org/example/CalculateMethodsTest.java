package org.example;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class CalculateMethodsTest {

    private CalculateMethods calculateMethods;
    @BeforeEach
    public void initTest(){
        calculateMethods = new CalculateMethods();
    }

    @Test
    public void testDivide(){
        assertEquals(10, calculateMethods.divide(100, 10));
    }
}