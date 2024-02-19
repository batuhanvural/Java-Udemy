
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Çalışanlar programına hoşgeldiniz...");
        
        String islemler = "İşlemler... \n"
                        +"1. Yazılımcı İşlemleri \n"
                        +"2.Yönetici İşlemleri \n"
                        +"Çıkış için q'ya basın ";
        System.out.println("*******************");
        System.out.println(islemler);
        
        while (true) {   
            System.out.println("İşlemi Seçiniz : ");
            String islem = scanner.nextLine();
            
            if (islem.equals("q")) {
                
                System.out.println("Programdan çıkılıyor...");
                break;
                
            }
            else if(islem.equals("1")){
                Yazilimci yazilimci = new Yazilimci("Batuhan", "VURAL", 123, "JAVA,JS");
                String yazilimci_islem = "1. Format At \n"
                                        +"2. Bilgileri Göster \n"
                                        +"Çıkış için q'ya basın.";
                while (true) {
                    System.out.println("İşlemi seçiniz : \n" + yazilimci_islem);
                    String y_islem = scanner.nextLine();
                    
                    if(y_islem.equals("q")){
                    
                        System.out.println("Yazılımcı işlemlerinden çıkılıyor");
                        break;
                       }
                    else if (y_islem.equals("1")) {
                        
                        System.out.print("İşletim sistemi : ");
                        String isletim_sistemi = scanner.nextLine();
                        yazilimci.formatAt(isletim_sistemi);
                        
                    }
                    else if (y_islem.equals("2")) {
                        yazilimci.bilgileriGoster();
                                                
                    }
                    else{
                    
                        System.out.println("Hatalı yazılımcı işlemi yapıldı.");
                    }
                    
                }
            
            }
            else if (islem.equals("2")) {
                
                Yonetici yonetici = new Yonetici("Serhat", "Say", 1, 13);
                
                String yonetici_islem = "Yönetici işlemleri \n"
                                       +"1. Zam Yap \n"
                                       +"2. Bilgileri Göster \n"
                                       +"Çıkış için q'ya basın.";
                System.out.println(yonetici_islem);
                
                while (true) {
                    System.out.println("İşlem seçiniz : ");
                    String y_islem = scanner.nextLine();
                    
                    if (y_islem.equals("q")) {
                        
                        System.out.println("Yönetici İşlemlerinden Çıkılıyor...");
                        break;                
                    }
                    else if (y_islem.equals("1")) {
                        System.out.println("Yöneticinin ne kadar zam yapmasını istiyorsunuz ? :");
                        int zamMiktari = scanner.nextInt();
                        scanner.nextLine();
                        yonetici.zamYap(zamMiktari);                        
                    }
                    else if (y_islem.equals("2")) {
                        yonetici.bilgileriGoster();                        
                    }
                    else{
                        System.out.println("Geçersiz Yönetici İşlemi...");
                    }
                }
                
                
            }
            else{
                System.out.println("Geçersiz işlem ");
            }
            
        }
    }
    
}
