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
       System.out.println("Enter the key size you want to use mininum 256");
       int UserKey = input.nextInt();
       K1 = rand.nextInt(UserKey);
       while (K1<100){
            K1 = rand.nextInt(UserKey);
        }
       System.out.println("Enter the password:");
       String Pass = input.next();
       for (int i=0;i<Pass.length();i++){
           for (int x=0;x<(new Float( Math.round(K1/24)));x++){
               if (x==1){
                   Encrypt.add(Pass.charAt(Char));
                   Char++;
               }
               else{
                Rand = rand.nextInt(Alpha.size());
                Encrypt.add(Alpha.get(Rand).toString());
               }
               
           }
           
       }
       String text = Encrypt.toString().replace("[", "").replace("]", "").replace(",", "");
       System.out.println(text);
       
   }
    public static void Decrypt (){
        
    }
}
