/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Useful;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author LG171811
 */
public class Operations {
    public static Scanner input = new Scanner(System.in);
     public static void Or (){
         System.out.println("Please type in your input A");
         String A = input.next();
         System.out.println("Please type in your input B");
         String B = input.next();
         ArrayList Out = new ArrayList();
         for (int i=0;i<=4;i++){
             if (String.valueOf(A.charAt(i)).equals("1")==true){
                 Out.add("1");
             }
             if (String.valueOf(A.charAt(i)).equals("1")==false){
                 if (String.valueOf(B.charAt(i)).equals("1")){
                    Out.add("1");
                }
                 else{
                     Out.add("0");
                 }
             }
             
         }
    
    }
     public static void And (){
    
    }
     public static void Not (){
    
    }
     public static void main(String[] args)  {
         System.out.println("Please enter what operation you want to do\nType 1 for Or\nType 2 for And\nType 3 for Not");
         int Option = input.nextInt();
         if (Option == 1){
             
         }
     }
}
