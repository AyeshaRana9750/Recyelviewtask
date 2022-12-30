package Modelclasses;

public class Playersmodel {

   private int playersimgs;
   private String playername;

    public Playersmodel(int playersimgs, String playername) {
        this.playersimgs = playersimgs;
        this.playername = playername;
    }

    public int getPlayersimgs() {
        return playersimgs;
    }

    public void setPlayersimgs(int playersimgs) {
        this.playersimgs = playersimgs;
    }

    public String getPlayername() {
        return playername;
    }

    public void setPlayername(String playername) {
        this.playername = playername;
    }
}
