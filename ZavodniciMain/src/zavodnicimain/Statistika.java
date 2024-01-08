package zavodnicimain;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringJoiner;


public class Statistika {
    String jmeno;
    ZavodnikZaznam[] zavodniky;
    int pocet;

    public Statistika(String jmeno, int kapacita) {
        this.jmeno = jmeno;
        this.zavodniky = new ZavodnikZaznam[kapacita];
        this.pocet = 0;
    }
    
    public void PridejZavodnika(ZavodnikZaznam zaznam){
        if(pocet<zavodniky.length){
    zavodniky[pocet] = zaznam;
    pocet++;
        }
    }
    
    
    
    
    public void Vypis(){
        System.out.println(jmeno + " Vypis Zavodniku: ");
        for(int i =0; i<pocet; i++){
        if(zavodniky[i]!=null){
            System.out.println(zavodniky[i]);

        }
        }
    }
    
    
    
    double Prumer(){
    double prumer = 0;
    for(int i =0; i<pocet; i++){
    prumer += zavodniky[i].prvniCas + zavodniky[i].druhyCas;
    
    }
    return prumer/(pocet*2);
    }
    
    
    double PrumerZavodnika(){
    double PrumerZavodnika =0;
    
     for(int i =0; i<pocet; i++){
    PrumerZavodnika = ((double)zavodniky[i].prvniCas + (double)zavodniky[i].druhyCas)/2;
    System.out.println("Prumer zavodnika " + zavodniky[i].getJmenoZavodnila() + " :" + PrumerZavodnika);
    }
    return PrumerZavodnika;
    }
    
    
    public ZavodnikZaznam NejRychlejsiZavodnik(){
    ZavodnikZaznam NejRychlejsiZavodnik = zavodniky[0];
    for(int i=0; i<pocet; i++){

    if(zavodniky[i].getLepsiCas()<NejRychlejsiZavodnik.getLepsiCas()){
        NejRychlejsiZavodnik = zavodniky[i];
    
    
    }
    }
    return NejRychlejsiZavodnik;
    }
    
    
    
    public String ulozzavodnika(int casovaHranice, String FilePath){
 //   StringBuilder content = new StringBuilder();
    StringJoiner content = new StringJoiner("\n");
    for(int i=0; i<pocet; i++){
    if(zavodniky[i].getLepsiCas()<=casovaHranice){
       // content.append(zavodniky[i].getJmenoZavodnila()).
         //       append(";").
           //     append(zavodniky[i].getPrvniCas()).
             //   append(";").
               // append(zavodniky[i].getDruhyCas()).
                 //append(";\n");
        
    content.add(zavodniky[i].getJmenoZavodnila() + ";" + zavodniky[i].getPrvniCas() + ";" + zavodniky[i].getDruhyCas());
        
        
    }
    
    }
    return content.toString();
    }
    
    
    public void CtiSoubor(String FilePath){
    try{
        FileReader fileReader = new FileReader(FilePath);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        
        String Line;
        
        while((Line = bufferedReader.readLine())!=null){
            System.out.println(Line);
        
        }
        bufferedReader.close();
    
    } catch(IOException e){
      e.printStackTrace();
    
    }
    
    
    }
    
    
    
     public void WriteSoubor(String FilePath){
    try{
        FileWriter fileWriter = new FileWriter(FilePath, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        
      
        String newContent = ulozzavodnika(50,  "zavodnizaznamy.csv");
        bufferedWriter.write(newContent);
       
        bufferedWriter.close();
    
    } catch(IOException e){
      e.printStackTrace();
    
    }
    
    
    }
    
}
