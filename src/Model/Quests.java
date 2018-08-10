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
public class Quests {
    private String ask;
    private String answer;

    public Quests(){
    }
    
    public Quests(String ask, String answer){
        this.ask = ask;
        this.answer = answer;
    }
    
    public String getAsk() {
        return ask;
    }

    public void setAsk(String ask) {
        this.ask = ask;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
