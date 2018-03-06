/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Useful;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author LG171811
 */
public class Encrrypt { // 8 bit 
    public static int Found =0;
    public static void main(String[] args) throws IOException  {
       
       Scanner input = new Scanner(System.in);
       ArrayList Alpha = new ArrayList();
       ArrayList Encrypt = new ArrayList();
       for (char c = 'a'; c <= 'z'; c++) {
        Alpha.add(c);
        }
       for (char c = 'A'; c <= 'Z'; c++) {
        Alpha.add(c);
        }
       for (char c = 'a'; c <= 'z'; c++) {
        Alpha.add(c);
        }
       double K1=0;
       int K2=0;
       int K3=0;
       int Rand = 0;
       int Char =0;
       Random rand = new Random();
       System.out.println("Enter the key size you want to use mininum 1000");
       int UserKey = input.nextInt();
       K1 = rand.nextInt(UserKey);
       K2 = rand.nextInt(24);
       K3 = rand.nextInt(10);
       while (K1<1000){
            K1 = rand.nextInt(UserKey);
        }
       System.out.println("Enter the password:");
       String Pass = input.next();
       for (int i=0;i<Pass.length();i++){
           for (int x=0;x<(new Float( Math.round(K1/24)));x++){
               if (x==K3){
                   char d = Pass.charAt(Char);
                   for (int a=0; Alpha.get(a).equals(d)==false;a++){
                       Found =a;
                   }
                   Encrypt.add(Alpha.get(Found+K2));
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
