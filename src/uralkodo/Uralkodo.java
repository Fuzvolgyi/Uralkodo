

package uralkodo;

import java.util.ArrayList;

/**
Egy uralkodót jellemez uralkodásának kezdete (év), hossza (években), 
és a nép elégedettsége (0..10 skálaérték,
 0=zsarnok gyűlölt uralkodó, 10=kedvelt jóságos és igazságos). 
 Készítsünk véletlen értékekkel inicializált listát 30 uralkodóval. 
 Határozzuk meg a leghosszabban uralkodó királyunk adatait, 
 valamint hogy van-e átfedés az uralkodások között 
 (valaki még uralkodása folyamatban volt, mikor egy másik is elkezdte az 
 uralkodását). Írassuk ki az átfedő uralkodások adatait egymás mellé a 
 képernyőre. 
 * 
 * 
 */
public class Uralkodo {

   
    public static void main(String[] args) {
       int jelolo = 0; 
       
        
        UralkodoC uralkodo1=new UralkodoC();
        ArrayList<UralkodoC> uralkodoLista=UralkodoC.getUralkodok(30);
    
        jelolo = leghosszabbanUrkodo(uralkodoLista);
        kiirUralkodo(uralkodoLista, jelolo);
        
        kiirAtfedesbenUralkodok(uralkodoLista);
        
    }

    private static int leghosszabbanUrkodo(ArrayList<UralkodoC> uralkodoLista) {
        int max = 0;
        int jelolo = 0;
        for (int i = 0; i < uralkodoLista.size(); i++) {
            if (uralkodoLista.get(i).getUralkodasHossza() > max) {
                max = uralkodoLista.get(i).getUralkodasHossza();
                jelolo = i;
            }
        }
        return jelolo;
    }

    private static void kiirUralkodo(ArrayList<UralkodoC> uralkodoLista, int jelolo) {
        System.out.println(uralkodoLista.get(jelolo).getNev() + " uralkodott leghosszabban, " 
                + uralkodoLista.get(jelolo).getUralkodasHossza() + " évig.");
    }

    private static void kiirAtfedesbenUralkodok(ArrayList<UralkodoC> uralkodoLista) {
        
        for (int i = 0; i < uralkodoLista.size(); i++) {
            int kezdete = uralkodoLista.get(i).getUralkodasKezdete();
            int vege = uralkodoLista.get(i).getUralkodasVege();
            for (int j = 1; j < uralkodoLista.size(); j++) {
                int kezdete2 = uralkodoLista.get(j).getUralkodasKezdete();
                int vege2 = uralkodoLista.get(j).getUralkodasVege();
                if (vege >= kezdete2 && kezdete <= vege2 
                        || kezdete2 <= vege && kezdete2 >= kezdete ) {
                    System.out.println("Átfedésben uralkodtak: " + "\n"  
                            + uralkodoLista.get(i).toString() + "\n" 
                            + uralkodoLista.get(j).toString());
                }
            }
        }
    }

    
    
    
}
