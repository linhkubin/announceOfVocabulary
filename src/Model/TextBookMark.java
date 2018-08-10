/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import View.Login;
import static View.Login.listSubject;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author linh
 */
public class TextBookMark extends TextFile{
    public int checkWord(String wordCheck){//check theo word//tra ve vi tri neu co.k thi tra ve -1
        for (int i = 0; i < listSubject.get(0).listWords.size(); i++) {
            if (listSubject.get(0).listWords.get(i).getWord() == wordCheck) {
                return i;
            }
        }
        return -1;
    } 
    
    public boolean writeBoorMark(){ //1 thanh cong.0 that bai
        File f = new File("src//Resource//bookmark//list.txt");
        
        try{
            FileOutputStream fout = new FileOutputStream(f);
            PrintWriter pw = new PrintWriter(fout,true);
            
            ArrayList<Words> list = new ArrayList<>();
            list = listSubject.get(0).listWords;
            
            for(int i=0;i<list.size();i++){
                pw.println(list.get(i).getWord());
                pw.println(list.get(i).getPrononciation());
                pw.println(list.get(i).getMean());
                pw.println(list.get(i).getCategory());
                pw.println(list.get(i).getExample());
                pw.println(list.get(i).getMeanExample());
                pw.println("");
            }
            pw.close();
        }   
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "write error!");
            return false;
        }
        return true;
    }
    
    public boolean deleteBookMark(String word){//xoa theo word, xoa thanh cong true.that bai false
         
        int i = checkWord(word);
        ArrayList<Words> list = new ArrayList<>();
        list = listSubject.get(0).listWords;
        if (i == 0) {
            listSubject.get(0).listWords = null;
            writeBoorMark();
            return true;
        }
        if( i > 0 ){ //nhieu hon 1 gia tri
           // list.get(i) = list.get(0);
        } 
        return false;
    }
    
    public boolean addBookMark(Words words){
        return true;
    }
}
