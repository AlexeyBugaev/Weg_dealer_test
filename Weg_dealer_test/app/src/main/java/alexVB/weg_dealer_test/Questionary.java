package alexVB.weg_dealer_test;

import java.util.ArrayList;
import java.util.HashMap;

public class Questionary {
    private long id;
    private String question;
    private String pictureURL;
    private ArrayList<String> variants;
    private int indexOfTrue;
    private int indexOfChoosed;

    public Questionary(long id, String question, String pictureURL, ArrayList<String> variants, int indexOfTrue, int indexOfChoosed) {
        this.id = id;
        this.question = question;
        this.pictureURL = pictureURL;
        this.variants = variants;
        this.indexOfTrue = indexOfTrue;
        this.indexOfChoosed = indexOfChoosed;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getPictureURL() {
        return pictureURL;
    }

    public void setPictureURL(String pictureURL) {
        this.pictureURL = pictureURL;
    }

    public ArrayList<String> getVariants() {
        return variants;
    }

    public void setVariants(ArrayList<String> variants) {
        this.variants = variants;
    }

    public int getIndexOfTrue() {
        return indexOfTrue;
    }

    public void setIndexOfTrue(int indexOfTrue) {
        this.indexOfTrue = indexOfTrue;
    }

    public int getIndexOfChoosed() {
        return indexOfChoosed;
    }

    public void setIndexOfChoosed(int indexOfChoosed) {
        this.indexOfChoosed = indexOfChoosed;
    }
}
