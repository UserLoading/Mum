/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Useful;
//import Game.Game;
//import static Game.GameOver.FileName;
//import static Game.GameOver.Lines;
//import static Game.GameOver.str;
//import static Game.GameOver.Exists;
//import static Game.HighScores.TextFile;

//import static Theatre.Movies.TextFile;
//import Theatre.NewShow;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;


/**
 *
 * @author lg171811
 */
public class FileStuff {
    public static void FileWrite(String FileName ,int Lines,ArrayList str ) 
        throws IOException {
            BufferedWriter writer = new BufferedWriter(new FileWriter(FileName+".txt"));
            int x =-1;
            System.out.println("Lines:"+Lines);
            while (x<Lines-1){
                x++;
                System.out.println(str.get(x));
                writer.write(str.get(x).toString());
                writer.newLine();
            }
            writer.close();
    }
    public static void FileRead(ArrayList TextFile, String FileName) throws IOException{
        ArrayList temp = new ArrayList();
        FileInputStream fstream = new FileInputStream("X:\\My Documents\\Subjects\\GitHub\\Mum\\"+FileName+".txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
        String strLine;
        while ((strLine = br.readLine()) != null)   {
            TextFile.add(strLine);
        }
        br.close();
    }
     
    public static void FileExist(String FileName,Boolean Exists){
        
        File file = new File("X:\\My Documents\\Subjects\\GitHub\\Mum\\"+FileName+".txt");
        if (file.exists()==true){
            Exists = true;
        }
        else {
            
        }
    }
    public static void FileDelete(String DeleteFile){
        File file = new File("X:\\My Documents\\Subjects\\GitHub\\Mum\\"+DeleteFile+".txt");
        if(file.delete()){
            System.out.println("File deleted successfully");
        }
        else{
            System.out.println("Failed to delete the file this could be due to the fact "+file+" doesnt exist" );
        }
            
    }
    public static void FileEdit(String FileName,int Lines , ArrayList str) throws IOException{
        try(FileWriter fw = new FileWriter(FileName+".txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter out = new PrintWriter(bw))
        {
        int x = 0;
        while (Lines>x){
            out.println(str.get(0));
            x++;
        }
        } catch (IOException e) {
            System.out.println("Error:"+e);
        }
           
    }
}
