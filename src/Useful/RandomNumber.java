/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Useful;

//import Game.Game;

import java.util.ArrayList;
import java.util.Random;

//import java.util.Random;
//import Game.Game.RandomLoops;

/**
 *Make it extend the file you want to implement a random number in 
 * @author LG171811
 */
public class RandomNumber   {
    public static int Pos=0;
    
    public static ArrayList <Integer> NumberGen(int Loops,int Max,int Min){
        ArrayList <Integer> List = new ArrayList<>();
        for (int i=0;i<Loops;i++){
            Random rand = new Random();
            int Result = rand.nextInt(Max-Min) + Min;
            List.add(Result);
        }
        return List;
    }
    
        
    
        
    
}
/**Use this code when you want a random number in the other code and call upon it with RandomNumber.NumberGen 
 * ArrayList List = NumberGen(Loops ->6, Max->99, Min->1);
 *  
 */