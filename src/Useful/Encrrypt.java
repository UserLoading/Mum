/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Useful;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author LG171811
 */
public class Encrrypt { // 8 bit 
    public static void main(String[] args)  {
       Scanner input = new Scanner(System.in);
       ArrayList Alpha = new ArrayList();
       ArrayList Encrypt = new ArrayList();
       for (char c = 'a'; c <= 'z'; c++) {
        Alpha.add(c);
        }
       for (char c = 'A'; c <= 'Z'; c++) {
        Alpha.add(c);
        }
       System.out.println(Alpha);
       double K1=0;
       double K2=0;
       double K3=0;
       int Rand = 0;
       int Char =0;
       Random rand = new Random();
       K1 = rand.nextInt(256);
       K2 = rand.nextInt(256);
       K3 = rand.nextInt(256);
       System.out.println("Enter the password:");
       String Pass = input.next();
       for (int i=0;i<Pass.length();i++){
           for (int x=0;x<(new Float( Math.round(K1/24)));x++){
               System.out.println("");
               if (x==(new Float( Math.round(K1/12)))){
                   Encrypt.add(Pass.charAt(Char));
                   System.out.println("Testing");
               }
               else{
                Rand = rand.nextInt(Alpha.size());
                Encrypt.add(Alpha.get(Rand).toString());
               }
               System.out.println(Encrypt);
           }
       }
       
   }
}
