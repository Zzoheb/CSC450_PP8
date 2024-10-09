/*--------------------------------------------------------
Program Name: Portfolio Project
Author: Zoheb Khan
Date: 10/01/24
----------------------------------------------------------
Pseudocode:
// Mutex to synchronize console output
// Simulate work
// Lock the mutex before printing to the console
// Simulate work
// Lock the mutex before printing to the console
// Create threads
// Wait for threads to finish
----------------------------------------------------------
Program Inputs: None
Program Outputs:  2 Thread Counting from 0 to 20 and 20 to 0
--------------------------------------------------------*/
package com.example.CSC450_PP8;

public class main {

    public static void main(String[] args) {
        // Thread for counting up
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i <= 20; i++) {
                try {
                    Thread.sleep(100); // Simulate work
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 1 counting up: " + i);
            }
        });

        // Thread for counting down
        Thread thread2 = new Thread(() -> {
            for (int i = 20; i >= 0; i--) {
                try {
                    Thread.sleep(100); // Simulate work
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 2 counting down: " + i);
            }
        });

        // Start both threads
        thread1.start();
        thread2.start();

        // Wait for both threads to finish
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
