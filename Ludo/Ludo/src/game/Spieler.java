package game;

import java.io.PrintStream;


public class Spieler {
  gameKim.Kegel[] spieler;
  gameKim.Kegel gelb;
  gameKim.Kegel gruen;
  gameKim.Kegel blau;
  gameKim.Kegel schwarz;
  gameKim.Kegel lila;
  gameKim.Kegel rot;

  private String name;
  private String farbe;
  private String rival;

  
  public Spieler() {
    spieler = new gameKim.Kegel[6];
    gelb = new gameKim.Kegel("/pictures/Yellow.jpg");
    gruen = new Kegel("/pictures/Green.jpg");
    blau = new Kegel("/pictures/Blue.jpg");
    schwarz = new Kegel("/pictures/Black.jpg");
    lila = new Kegel("/pictures/Purple.jpg");
    rot = new Kegel("/pictures/Red.jpg");
  }
  
  void initSpieler(String name, String farbe, String rival){
    setName(name);
    setFarbe(farbe);
    setRival(rival);
  }



  /*public void setColor()
  {
    spieler[0] = gelb;
    spieler[1] = gruen;
    spieler[2] = blau;
    spieler[3] = schwarz;
    spieler[4] = lila;
    spieler[5] = rot;
  }*/
  

  public Kegel getSpieler1bis6(int i)
  {
    if (i <= spieler.length)
    {
      return spieler[(i - 1)];
    }
    System.out.println("Spieler " + (i - 1) + " existiert nicht.");
    return null;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getFarbe() {
    return farbe;
  }

  public void setFarbe(String farbe) {
    this.farbe = farbe;
  }

  public String getRival() {
    return rival;
  }

  public void setRival(String rival) {
    this.rival = rival;
  }
}
