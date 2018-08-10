/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import View.Login;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import javax.security.auth.Subject;

/**
 *
 * @author linh
 */
public class TextFile {
    
    
    public ArrayList<Subjects> readSubject() throws FileNotFoundException, IOException, ClassNotFoundException
    {
        File f = new File("src//Resource//subject.txt");
        ArrayList<Subjects> list= new ArrayList<>();
        FileReader fin = new FileReader(f);
        BufferedReader br = new  BufferedReader(fin);
        
        String line;
        while((line = br.readLine())!=null){
            Subjects sub = new Subjects();
            sub.setName(line);
            list.add(sub);
            System.out.println(""+line);
        }
        br.close();

        return list; 
    }

    public ArrayList<Words> readWords(String nameSubject)  throws FileNotFoundException, IOException, ClassNotFoundException{
        //add words vaof subject        
        ArrayList<Words> list = new ArrayList<>();
                
        File f = new File("src//Resource//"+nameSubject+"//listWords.txt");
        FileReader fin = new FileReader(f);
        BufferedReader br = new  BufferedReader(fin);
        br.readLine();//bo qua dong dau tien
        
        do{
            String word = br.readLine();
            String prononciation = br.readLine();
            String mean = br.readLine();
            String category = br.readLine();   
            String example = br.readLine();
            String meanExample = br.readLine();
            Words member = new Words(word, prononciation, mean, category, example, meanExample);
            list.add(member);
//            
//            Subjects sub = new Subjects();
//            sub.setName(line);
            
            System.out.println("aa"+word);
            System.out.println("aa"+prononciation);
            System.out.println("aa"+mean);
            System.out.println("aa"+category);
            System.out.println("aa"+example);
            System.out.println("aa"+meanExample);
            System.out.println("");
        }while(br.readLine()!=null);
        br.close();

        return list; 
    }
    
    public ArrayList<Quests> readQuests(Subjects sub)  throws FileNotFoundException, IOException, ClassNotFoundException{
        //add words vaof subject        
        ArrayList<Quests> list = new ArrayList<>();
                
            for (int i = 0; i < sub.listWords.size(); i++) {
            String ask = sub.listWords.get(i).getWord();
            String answer = sub.listWords.get(i).getCategory();
            //check
            System.out.println("aa"+ask);
            System.out.println("aa"+answer);
            System.out.println("");
            
            Quests member = new Quests(ask, answer);
            
            list.add(member);
        }
            
//            
//            Subjects sub = new Subjects();
//            sub.setName(line);
            
            
        

        return list; 
    }

}