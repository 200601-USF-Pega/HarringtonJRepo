package com.revature.thursdaylunch_breakout.models;

import java.util.Random;

public class Philosopher implements Runnable {

    // The forks on either side of this Philosopher 
    private Object leftFork;
    private Object rightFork;
 
    //Ending condition
    private Boolean isFull;
    
    //How much it needs to eat
    private int hungerVal = new Random().nextInt(5);
    
    //Constructor Class of the Philosopher
    public Philosopher(Object leftFork, Object rightFork) {
        this.leftFork = leftFork;
        this.rightFork = rightFork;
    }
  
    //This is the 
    private void doAction(String action) throws InterruptedException {
        System.out.println(
          Thread.currentThread().getName() + " " + action);
        Thread.sleep(((int) (Math.random() * 100)));
    }
 
    // Rest of the methods written earlier
	
	
	@Override
    public void run() {
        try {
            while (hungerVal > 0) {
                 
                // thinking
                doAction(System.nanoTime() + ": Thinking");
                synchronized (leftFork) {
                    doAction(
                      System.nanoTime() 
                        + ": Picked up left fork");
                    synchronized (rightFork) {
                        // eating
                        doAction(
                          System.nanoTime() 
                            + ": Picked up right fork - eating"); 
                         
                        doAction(
                          System.nanoTime() 
                            + ": Put down right fork");
                        hungerVal--;
                    }
                     
                    // Back to thinking
                    doAction(
                      System.nanoTime() 
                        + ": Put down left fork. Back to thinking");
                }
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return;
        }

	}
	
}
