
package zavodnicimain;

public class ZavodniciMain {

    public static void main(String[] args) {
        Statistika pico = new Statistika("Turnaj", 10);
        
        ZavodnikZaznam a1 = new ZavodnikZaznam("Dencik", 69, 60);
        ZavodnikZaznam a2 = new ZavodnikZaznam("NEDencik", 71, 59);
        ZavodnikZaznam a3 = new ZavodnikZaznam("JineDencik",59, 50);
        ZavodnikZaznam a4 = new ZavodnikZaznam("Sambocka",49, 52);
        
        pico.PridejZavodnika(a1);
        pico.PridejZavodnika(a2);
        pico.PridejZavodnika(a3);
        pico.PridejZavodnika(a4);
        
        pico.Vypis();
        
        ZavodnikZaznam Vitez = pico.NejRychlejsiZavodnik();
        
        System.out.println( "Nejrychleisi Zavodnik:  " + Vitez.getJmenoZavodnila());
        
        
        pico.PrumerZavodnika();
        
        double prumer = pico.Prumer();
        System.out.println(prumer);
        System.out.println();
        
        String FilePath = "zavodnizaznamy.csv";
        pico.CtiSoubor(FilePath);
         System.out.println();
        
        pico.WriteSoubor(FilePath);
         System.out.println();
        
        
        pico.CtiSoubor(FilePath);
        
        
    }
    
}
