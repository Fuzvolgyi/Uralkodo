

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
        UralkodoC uralkodo1=new UralkodoC();
        ArrayList<UralkodoC> uralkodoLista=UralkodoC.getUralkodok(30);
        boolean erdmeny=uralkodo1.atfedes(uralkodo1);
        
    }

}
