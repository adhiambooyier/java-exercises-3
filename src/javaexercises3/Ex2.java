/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexercises3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Adhiambo oyier
 */
public class Ex2 {
     public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        List<Details> deets = new ArrayList<>();
        String name, email;
       while(true){
        System.out.println("Input name");
        name = input.nextLine();
        if(name.equalsIgnoreCase("stop")){
            break;
        }
        else{
        System.out.println("Input email");
          email = input.nextLine();
        if (email.equalsIgnoreCase("stop")){
            break;
        }else
            if(!email.substring(email.length()-2).equalsIgnoreCase("us") && !email.substring(email.length()-2).equalsIgnoreCase("uk")){
                deets.add(new Details(name, email));
            }
            
        }
       }
       for(Details entry:deets){
           System.out.println(entry.name + "->" + entry.email);
       }
     }
    
}

class Details{
    String name;
    String email;

    Details(String name, String email){
        this.name = name;
        this.email = email;
    }


}