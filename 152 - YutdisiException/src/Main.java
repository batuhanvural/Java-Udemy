
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        
        System.out.println("Sabiha Gökmen Havalimanına Hoşgeldiniz");
        
        String sartlar = "Yurtdışı Çıkış Kuralları.. \n"
                        +"Herhangi bir siyasi yasağınız bulunmaması gerekiyor. \n"+
                        "15 ₺ Harç Bedeli'ni tam olarak yatırmanız gerekiyor. \n"+
                        "Gideceğiniz ülkeye vizenizin bulunması gerekiyor...";
        String message ="Yurtdışı şartlarından hepsini sağlamanız gerekiyor.";
        
        while (true) {
            
            System.out.println("***********************************");
            System.out.println(sartlar);
            System.out.println("***********************************");
            
            
            Yolcu yolcu = new Yolcu();
            
            System.out.println("Harç Bedeli Kontrol Ediliyor...");
            Thread.sleep(3000);
            
            try {
                yolcu.yurtdisi_harciKontrol();
            } catch (HarcException ex) {
                ex.printStackTrace();
                continue;
            }
            
            System.out.println("Siyasi Yasak Kontrol Ediliyor...");
            Thread.sleep(3000);
            
            try {
                yolcu.siyasiYasakKontrol();
            } catch (SiyasiException ex) {
                ex.printStackTrace();
                continue;
            }
            
            
            System.out.println("Vize Durumu Kontrol Ediliyor...");
            Thread.sleep(3000);
            
            try {
                yolcu.vizeDurumuKontrol();
            } catch (VizeException ex) {
                ex.printStackTrace();
                continue;
            }
            
            System.out.println("İşlemlerinin tamam! Yurtdışına çıkabilirsiniz...");
            break;
        }
        
                
    }
    
}
