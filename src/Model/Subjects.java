/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.awt.Image;
import java.util.ArrayList;

/**
 *
 * @author linh
 */
public class Subjects {
   // public static String[] listSubject;
    
    public  String name;
    public ArrayList<Words> listWords = new ArrayList<>(); 
    public ArrayList<Quests> listQuests = new ArrayList<>();
    
    //Words words = new Words();
    //
    private String Image ;
    
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
