/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexercises3;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Adhiambo oyier
 */
public class Ex1 {
    public static void main(String[] args) {
     int set[] = new int[10];
        Random rand = new Random();
        for(int i = 0; i<set.length; i++){
            set[i] = rand.nextInt(1000);
        }
        System.out.println("Randomly Generated array used" + Arrays.toString(set));
        
        int sum = 0;
        for(int i=0; i<set.length; i++){
            sum += set[i];
        }
        int avg = (sum/set.length);
     System.out.println("Average is:" + avg);
    }
}
