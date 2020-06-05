package com.revature.models;

public class Calculator {
    long answer;

    public void calAdd(long d1, long d2){
    answer = Math.addExact(d1, d2);
        System.out.println("The Answer is: " + answer);
    }

    public void calSub(long d1, long d2){
    answer = Math.subtractExact(d1, d2);
        System.out.println(answer);
    }

    public void calMul(long d1, long d2){
    answer = Math.multiplyExact(d1, d2);
        System.out.println(answer);
    }

    public void calDiv(long d1, long d2){
    answer = Math.floorDiv(d1, d2);
        System.out.println(answer);
    }

}
