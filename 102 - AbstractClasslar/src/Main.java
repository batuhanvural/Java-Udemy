
public class Main {
    public static void main(String[] args) {
        
        //Sekil sekil = new Sekil("Şekil");  //Sekil abstract class olduğu için nesne oluşturamıyoruz. Hata alıyoruz
        
        Sekil sekil;
        sekil = new Kare("Kare 2", 6);
        
        sekil.alan_hesapla();
        
        
        Kare kare1 = new Kare("Kare 1", 5);
        Daire daire1  = new Daire("Daire 1", 3);
        
        
        kare1.alan_hesapla();
        daire1.alan_hesapla();
        kare1.cevre_hesapla();
        
        
        
        
    }
}
