/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexercises3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Adhiambo oyier
 */
public class JavaExercises3 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
      choose();            
    }
    private static void choose(){
        System.out.println("Choose a question\n");
        //questions go here
        Scanner input = new Scanner(System.in);
        System.out.print("\n");
        
        int question = input.nextInt();
        switch (question){
            case 1:
               // Ex1.main(null);
                break;

            case 2:
                Ex2.main(null);
                break;

            case 3:
              Ex3.main(null);
                break;

            case 4:
                Ex4.main(null);
                break;
            case 5:
                Ex5.main(null);
                break;
            default:
                System.out.println("\nInvalid choice");
                choose();
                break;
        
    }
    }
    
}
