package com.revature.models;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    public int answer;
    int num1;
    int num2;


    @Before  public void init() {
        int num1 = -10000;
        int num2 = 1000;
    }

@Test
    public void calcAddTest(){

answer = Math.addExact(num1, num2);
    System.out.println(answer);

}



}
