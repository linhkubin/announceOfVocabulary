/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import View.Login;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

/**
 *
 * @author linh
 */
public class ThreadMusic extends Thread {
    
    @Override
    public void run(){
        try {
        Player pla = new  Player(new FileInputStream("src//Resource//reality.mp3"));
        pla.play();
        //pla.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "error!");
        } catch (JavaLayerException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("  ===========================> HelloThread stopped");
    }
   
    public void finish(){
        
    }
    
    
}
