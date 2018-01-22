/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Useful;

//import Game.Game;
//import java.util.Random;
//import Game.Game.RandomLoops;

/**
 *Make it extend the file you want to implement a random number in 
 * @author LG171811
 */
public class RandomNumber   {
    public static int Pos=0;

    public static void NumberGen(int RandLoops){
        int Loop = 0;
        while (Loop<RandLoops){
            Loop++;
            Pos=(Pos+50);
        }
    }
}
/**Use this code when you want a random number in the other code and call upon it with RandomNumber.NumberGen 
 *  public static int min = 1;
    public static int max = 11;
    public static int RandLoops = 4;
 */