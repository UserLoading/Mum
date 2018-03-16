/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Useful;

import java.util.ArrayList;

/**
 *
 * @author LG171811
 */
public class MergeSort {
    public static void main(String[] args){
        ArrayList <Integer> List = new ArrayList();
        List.add(1);List.add(5);List.add(3);List.add(7);List.add(2);List.add(6);List.add(3);
        boolean RList = false;
        boolean LList = false;
        int Holder=0;
        ArrayList <Integer>R  = new ArrayList();
        ArrayList <Integer> L = new ArrayList();
        ArrayList RSplit = new ArrayList();
        ArrayList LSplit = new ArrayList();
        int Middle = (List.size()/2);
        System.out.println(List);
        for (int i=0 ;i<Middle;i++){
            R.add(List.get(i));
        }
        for (int p=1;p<List.size()-(Middle-1);p++){
            L.add(List.get(List.size()-p));
        }
        System.out.println(R+"/n"+L);
        for (int y=0;y<L.size()-1+0;y++){
            if ((y+2)%2==0){
                if ((L.get(y))<(L.get(y+1))){
                    System.out.println("Even");
                    Holder = L.get(y);
                    L.set(y, L.get(y+1));
                    L.set(y+1, Holder);
                }
                else{
                    System.out.println("No bigger");
                }
            }
            else{
                System.out.println("Not even");
            }
        }
        System.out.println(L);
        for (int z=0;z<R.size()-1+0;z++){
            if ((z+2)%2==0){
                if ((R.get(z))<(R.get(z+1))){
                    System.out.println("Even");
                    Holder = R.get(z);
                    R.set(z, R.get(z+1));
                    R.set(z+1, Holder);
                }
                else{
                    System.out.println("No bigger");
                }
            }
            else{
                System.out.println("Not even");
            }
        }
        System.out.println(R);
    }
    
}
