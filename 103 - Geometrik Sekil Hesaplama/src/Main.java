
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        String islemler = "İşlemler... \n"+
                         "1. Kare Alan Hesapla\n"+
                         "2. Üçgen Alan Hesapla\n"+
                         "3. Daire Alan Hesapla\n"+
                         "Çıkış için q'ya basın";
        
        while (true) {            
            System.out.println(islemler);
            System.out.println("Hangi şeklin alanını hesaplamak istiyorsun");
            String sekil_turu = scanner.nextLine();
            Sekil sekil = null;
            
            if (sekil_turu.equals("q")) {
                System.out.println("Programdan çıkılıyor.");
                break;
            }else if(sekil_turu.equals("1")){
                 System.out.print("Kare'nin kenarı: ");
                 int kenar = scanner.nextInt();
                 scanner.nextLine();
                 
                 sekil = new Kare("Kare 1", kenar);
                 sekil.alanHesapla(); 
                 
            }else if (sekil_turu.equals("2")) {
                System.out.print("Kenar 1: ");
                int kenar1 = scanner.nextInt();
                System.out.print("Kenar 2: ");
                int kenar2 = scanner.nextInt();
                System.out.print("Kenar 3");
                int kenar3 = scanner.nextInt();
                scanner.nextLine();
                
                sekil = new Ucgen("Üçgen 1", kenar1, kenar2, kenar3);
                sekil.alanHesapla();
                
            }else if(sekil_turu.equals("3")){
                System.out.print("Yarıçap: ");
                int yaricap = scanner.nextInt();
                scanner.nextLine();
                
                sekil = new Daire("Daire 1", yaricap);
                sekil.alanHesapla();
            }
            else{
                System.out.println("Geçersiz işlem...");
            }
            
        }
        
        
        
        
    }
}
