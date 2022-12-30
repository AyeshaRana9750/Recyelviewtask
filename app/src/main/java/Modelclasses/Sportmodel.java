package Modelclasses;

public class Sportmodel {

    private String sporttext;
   private int sportimg;


    public Sportmodel(String sporttext, int sportimg) {
        this.sporttext = sporttext;
        this.sportimg = sportimg;
    }



    public String getSporttext() {
        return sporttext;
    }

    public void setSporttext(String sporttext) {
        this.sporttext = sporttext;
    }

    public int getSportimg() {
        return sportimg;
    }

    public void setSportimg(int sportimg) {
        this.sportimg = sportimg;
    }
}
