package Modelclasses;

public class Teamsmodel {

  private   int teamimg;
   private String teamname;
   private String Teamname2;
    private String Color;





    public Teamsmodel(int teamimg, String teamname, String teamname2,String color) {
        this.teamimg = teamimg;
        this.teamname = teamname;
        Teamname2 = teamname2;
        Color = color;
    }

    public int getTeamimg() {
        return teamimg;
    }

    public void setTeamimg(int teamimg) {
        this.teamimg = teamimg;
    }

    public String getTeamname() {
        return teamname;
    }

    public void setTeamname(String teamname) {
        this.teamname = teamname;
    }

    public String getTeamname2() {
        return Teamname2;
    }

    public void setTeamname2(String teamname2) {
        Teamname2 = teamname2;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }
}
