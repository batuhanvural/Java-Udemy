
import java.util.Scanner;


public class BasitATM{
    
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        int bakiye = 1000;
        String islemler = "1. işlem : Bakiye öğrenme \n" + "2. işlem : Para çekme \n" + "3. işlem : para yatırma \n" + "Çıkış için q'ya basın \n";
        System.out.println("Lütfen işleminizi seçiniz");
        System.out.println("********************************");
        System.out.println(islemler);
        System.out.println("********************************");
        
        while (true) {     
            System.out.println("İşlemi seçiniz :");
            
            String islem = scanner.nextLine();
            
            if (islem.equals("q")) {
                System.out.println("Programdan çıkılıyor ....");
                break;                
            }
            else if (islem.equals("1")){
                
                System.out.println("Bakiyeniz : " +bakiye);
                
                
            }
            else if (islem.equals("2")){
                System.out.println("Çekmek istediğiniz tutarı girin : ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                
                
                if (bakiye - tutar <0) {
                    System.out.println("Bakiyeniz yetersiz... Var olan bakiyeniz : " + bakiye);
                    
                }else{
                    bakiye = bakiye - tutar;
                    System.out.println("İşleminiz başarılı. Yeni bakiyeniz = " + bakiye);
                    
                }
            
            }
            else if (islem.equals("3")){
                System.out.println("Yatırmak istediğiniz tutarı giriniz : ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                bakiye = bakiye + tutar;
                System.out.println("Tutar hesabınıza aktarılmıştır. Yeni bakiyeniz : " + bakiye);
                
            }
            else {
                System.out.println("Geçersiz işlem ...");
            }
        }
        
       
            
        
    
    
    
        }        
    }            


 