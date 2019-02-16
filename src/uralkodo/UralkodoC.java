
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
    
    private int uralkodasKezdete;
    private int uralkodasHossza;
    private int elegedetseg;

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
//</editor-fold>
    
    

    static ArrayList<UralkodoC> getUralkodok(int darabUralkodo) {
       ArrayList<UralkodoC> eredmeny=new ArrayList<>();
        UralkodoC temp;
       for (int i = 0; i < darabUralkodo; i++) {
            temp=new UralkodoC(); 
            temp.elegedetseg=RANDOM.nextInt(11);
            temp.uralkodasHossza=RANDOM.nextInt(50)+1;
            temp.uralkodasKezdete=RANDOM.nextInt(917)+1000;
            eredmeny.add(temp);
        }
       
       return eredmeny;
    }

    boolean atfedes(UralkodoC masikUralkodo) {
        int vege=uralkodasHossza+uralkodasKezdete;
        return false;
    }

}
