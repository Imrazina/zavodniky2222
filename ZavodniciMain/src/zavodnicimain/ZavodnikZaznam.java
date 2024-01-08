package zavodnicimain;

public class ZavodnikZaznam {
    String jmenoZavodnika;
    int prvniCas;
    int druhyCas;
    int lepsiCas;

  
   

    public ZavodnikZaznam(String jmenoZavodnika, int prvniCas, int druhyCas) {
        this.jmenoZavodnika = jmenoZavodnika;
        this.prvniCas = prvniCas;
        this.druhyCas = druhyCas;
        this.lepsiCas = dejlepsiCas();
    }
    
      public int getLepsiCas() {
        return lepsiCas;
    }


    public String getJmenoZavodnila() {
        return jmenoZavodnika;
    }

    public int getPrvniCas() {
        return prvniCas;
    }

    public int getDruhyCas() {
        return druhyCas;
    }
    
    
   int dejlepsiCas(){
   if(prvniCas<druhyCas){
   lepsiCas = prvniCas;
   } else{
   lepsiCas = druhyCas;
   }
    return lepsiCas;
    }
    
    @Override
    public String toString() {
        return "Zaznam {" + "jmenoZavodnila = " + jmenoZavodnika + ", prvniCas = " + prvniCas + ", druhyCas = " + druhyCas + ", lepsiCas = " + lepsiCas +'}';
        
    }
 
    
    
}
