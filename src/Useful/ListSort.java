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
public class ListSort   {
     public static Scanner input = new Scanner(System.in);
     public static void  ListSort(ArrayList<Integer>  List  ){            
         //System.out.println("This is before sorting "+List);
         int Loops =0;
         int Loops2 =1;
         int Holder =0;
         while (Loops<List.size()){
             if (Loops2==List.size()){
                 Loops++;
                 Loops2=(Loops+1);
             }
             else if (List.get(Loops)<List.get(Loops2)){
                 Holder=List.get(Loops);
                 List.set(Loops, List.get(Loops2));
                 List.set(Loops2, Holder);
             }
             else if (List.get(Loops)>List.get(Loops2)-1){
                 Loops2++;
             }
          
        }
         
     }
}


