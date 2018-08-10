/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author linh
 */
public class Options {
    private int delayTime;
    private int numberOfWords;
    private int numberOfQuests;

    public int getNumberOfWords() {
        return numberOfWords;
    }

    public void setNumberOfWords(int numberOfWords) {
        this.numberOfWords = numberOfWords;
    }
    
    
    public Options(){//defaults
        this.delayTime = 5;
        this.numberOfWords = 10;
        this.numberOfQuests = 10;
    }

    public int getDelayTime() {
        return delayTime;
    }

    public void setDelayTime(int delayTime) {
        this.delayTime = delayTime;
    }

    public int getNumberOfQuests() {
        return numberOfQuests;
    }

    public void setNumberOfQuests(int numberOfQuests) {
        this.numberOfQuests = numberOfQuests;
    }
    
    
}
