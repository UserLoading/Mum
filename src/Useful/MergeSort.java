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
        ArrayList List = new ArrayList();
        List.add(5);List.add(1);List.add(3);List.add(7);List.add(2);
        boolean RList = false;
        boolean LList = false;
        int Holder=0;
        ArrayList R = new ArrayList();
        ArrayList L = new ArrayList();
        ArrayList RSplit = new ArrayList();
        ArrayList LSplit = new ArrayList();
        int Middle = (List.size()/2);
        for (int i=0 ;i<Middle;i++){
            R.add(List.get(i));
        }
        for (int p=1;p<List.size()-(Middle-1);p++){
            L.add(List.get(List.size()-p));
        }
        for (int y=2;y<R.size()+2;y++){
            if (y%2==0){
                if (Integer.valueOf(R.get(y-2).toString())>Integer.valueOf(R.get(y-1).toString())){
                    R.add(y-1, R.get(y-2));
                }
            }
        }//Started sorting the right splited part
    }
    
}
