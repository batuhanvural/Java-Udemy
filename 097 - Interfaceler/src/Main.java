
public class Main {
    public static void main(String[] args) {
        
        IMuhendis muhendis1 = new PCMuhendisi(false , false);
        
        /*
        muhendis1.askerlik_durumu_sorgula();
        muhendis1.adli_sicil_sorgula();
        System.out.println(muhendis1.mezuniyet_ortalamasi(3.1));
        
        String[] tecrube = {"VESTEL","STM"};
        
        muhendis1.is_tecrubesi(tecrube);*/
        
        MakineMuhendisi muhendis2 = new MakineMuhendisi(true, false);
        
        String[] tecrube = {};
        String[] referans = {"Batuhan VURAL","Sadi Evren ŞEKER"};
        muhendis2.adli_sicil_sorgula();
        muhendis2.askerlik_durumu_sorgula();
        System.out.println(muhendis2.mezuniyet_ortalamasi(2.3));
        muhendis2.is_tecrubesi(tecrube);
        muhendis2.referans_getir(referans);
        muhendis2.calis();
        
    }
}
