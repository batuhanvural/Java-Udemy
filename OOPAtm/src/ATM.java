
import java.util.Scanner;


public class ATM {
    
    public void calis(Hesap hesap){
        
        Login login = new Login();
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bankamıza Hoşgeldiniz.");
        System.out.println("*******************");
        System.out.println("Kullanıcı Girişi");
        System.out.println("*******************");
        int giris_hakki=3;
        
        while (true) {     
            if(login.login(hesap)){
                
                System.out.println("Giriş Başarılı");
                break;
            }
            else{
                System.out.println("Giriş Başarısız.");
                giris_hakki-=1;
                System.out.println("Kalan giriş hakkı: " +giris_hakki);
            }
            if (giris_hakki==0) {
                
                System.out.println("Giriş hakkınız kalmadı.");
                return;
                
            }
        }
        
        System.out.println("**************************************");
        String islemler = "1. Bakiye Sorgulama \n"+
                          "2. Para Yatırma \n"+
                          "3. Para Çekme \n"+
                          "Çıkış için q'ya basın.";
        
        System.out.println(islemler);
        System.out.println("*****************************");
        
        while (true) {            
            
            System.out.println("İşlem Seçiniz : ");
            String islem = scanner.nextLine();
            
            if(islem.equals("q")){
                break;
            }
            else if (islem.equals("1")) {
                System.out.println(hesap.getBakiye());
            }
            else if (islem.equals("2")) {
                System.out.println("Yatırmak istediğiniz tutar: ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                
                hesap.paraYatir(tutar);
            }
            else if(islem.equals("3")){
                System.out.println("Çekmek istediğiniz tutar: ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                hesap.paraCek(tutar);
            }
            else {
                System.out.println("Geçersiz işlem...");
            }
        }
      
        
        
    }    
}
