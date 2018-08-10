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
public class Words {
    private String word;
    private String prononciation;
    private String mean;
    private String category;   
    private String example;
    private String meanExample;
    //private int appearance = 0;
    private String imageWord;
    private String soundWord;
    
    public Words(){};
    
    public Words(String word, String prononciation, String mean, String category, String example, String meanExample/*, String imageWord,String soundWord*/ ){
        this.word = word;
        this.prononciation = prononciation;
        this.mean = mean;
        this.category = category;
        this.example = example;
        this.meanExample  = meanExample;
//        this.imageWord = imageWord;
//        this.soundWord = soundWord;
    }

    
    
    public String getWord() {
        return word;
    }

    public String getPrononciation() {
        return prononciation;
    }

    public String getMean() {
        return mean;
    }

    public String getCategory() {
        return category;
    }

    public String getExample() {
        return example;
    }

    public String getMeanExample() {
        return meanExample;
    }
    
    

//    public String getImageWord() {
//        return imageWord;
//    }
//
//    public String getSoundWord() {
//        return soundWord;
//    }

    public void setWord(String word) {
        this.word = word;
    }

    public void setPrononciation(String prononciation) {
        this.prononciation = prononciation;
    }

    public void setMean(String mean) {
        this.mean = mean;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setExample(String example) {
        this.example = example;
    }

    public void setMeanExample(String meanExample) {
        this.meanExample = meanExample;
    }
    
    
    
}
