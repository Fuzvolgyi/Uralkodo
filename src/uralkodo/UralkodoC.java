
package uralkodo;

import java.util.ArrayList;
import java.util.Random;

/**
 * Bug!
 * In my code?
 * Bitch! That is a feature.
 * @author G
 */
public class UralkodoC {
    private static final Random RANDOM=new Random();
    
    private String nev;
    private int uralkodasKezdete;
    private int uralkodasHossza;
    private int uralkodasVege;
    private int elegedetseg;

    @Override
    public String toString() {
        return "UralkodoC{" + "nev=" + nev + ", uralkodasKezdete=" + uralkodasKezdete + ", uralkodasHossza=" + uralkodasHossza + ", uralkodasVege=" + uralkodasVege + ", elegedetseg=" + elegedetseg + '}';
    }

    //<editor-fold defaultstate="collapsed" desc="getters-setters">
    public int getUralkodasKezdete() {
        return uralkodasKezdete;
    }
    
    public void setUralkodasKezdete(int uralkodasKezdete) {
        this.uralkodasKezdete = uralkodasKezdete;
    }
    
    public int getUralkodasHossza() {
        return uralkodasHossza;
    }
    
    public void setUralkodasHossza(int uralkodasHossza) {
        this.uralkodasHossza = uralkodasHossza;
    }
    
    public int getElegedetseg() {
        return elegedetseg;
    }
    
    public void setElegedetseg(int elegedetseg) {
        this.elegedetseg = elegedetseg;
    }
    
    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }
    
    public int getUralkodasVege() {
        return uralkodasVege;
    }

    public void setUralkodasVege(int uralkodasVege) {
        this.uralkodasVege = uralkodasVege;
    }
//</editor-fold>
    
    

    static ArrayList<UralkodoC> getUralkodok(int darabUralkodo) {
       ArrayList<UralkodoC> eredmeny=new ArrayList<>();
       int szamolo = 0;
       UralkodoC temp;
       for (int i = 0; i < darabUralkodo; i++) {
            temp=new UralkodoC(); 
            temp.elegedetseg=RANDOM.nextInt(11);
            temp.uralkodasHossza=RANDOM.nextInt(50)+1;
            temp.uralkodasKezdete=RANDOM.nextInt(917)+1000;
            temp.nev = szamolo + ".Laszlo";
            temp.uralkodasVege = temp.uralkodasKezdete + temp.uralkodasHossza;
            szamolo++;
            eredmeny.add(temp);
        }
       
       return eredmeny;
    }

   

}
