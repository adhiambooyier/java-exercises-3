/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexercises3;

import java.util.Scanner;


/**
 *
 * @author Adhiambo oyier
 */
public class Ex5 {
     public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);
    System.out.println("enter the value of a:\n");
    int a = input.nextInt();
    System.out.println("enter the value of b:\n");
    int b = input.nextInt();
    System.out.println("enter the value of a:\n");
    int c = input.nextInt();
    System.out.println("The equation to be solved is:" + a + "x2" + "+" + b + "x"+ "+" + c);
    
    
    double d = (b*b)-(4*a*c);
    
    if (d >= 0){
    double x1 = (-b+Math.sqrt(d))/ (2*a);
    double x2 = (-b-Math.sqrt(d))/ (2*a);
      System.out.println("Roots are"+ " " + x1 + " "+ "and" + " " + x2);
    }
    else{
         System.out.println("The equation has no real roots");
    }
  }  
}
