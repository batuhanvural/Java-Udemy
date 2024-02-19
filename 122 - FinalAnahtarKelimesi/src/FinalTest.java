
public class FinalTest {
    //public final int obje_sayisi; // sadece onje_sayisi = 4; de yapılabilir 
    public final int obje_sayisi;
    
    private static int say = 0;
    private final String isim;
    
    public FinalTest(String isim) {
        
        //obje_sayisi = 4;
        
        this.isim = isim;
        say++;
        obje_sayisi = say;
        
        
    }

    public static int getSay() {
        return say;
    }

    public static void setSay(int say) {
        FinalTest.say = say;
    }
    
    
}
