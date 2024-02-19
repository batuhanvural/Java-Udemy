
public class Main {
    public static void main(String[] args) {
        
        String a = "Batuhan";
        
        String b = new String("BatuhaN");
        
        /*System.out.println(b);
        
        System.out.println("Harf Sayısı: "+ b.length());
        System.out.println("0. indeks " +b.charAt(0));*/
        
        /*for(int i = 0; i<b.length();i++){
        
            System.out.println(b.charAt(i));
        }*/
        
        //System.out.println(b.startsWith("Ba")); //"" içi ile mi başlıyor
        //System.out.println(b.endsWith("N")); // "" içindeki ile mi bitiyor ikisinin de çıktısı true false
        
        //System.out.println(b.indexOf('t')); // '' İçine girdiğimiz değer ilk kaçıncı indekste olduğunu söylüyor.
        //System.out.println(b.lastIndexOf('a')); // '' içine girdiğimiz değerle son kaçıncı indekste karşılaşıyor.
        
        //System.out.println(b.toLowerCase()); // bütün harfleri küçültüyor.
        //System.out.println(b.toUpperCase()); // bütün harfleri küçültüyor
        
        /*
        String a1 = "1923";
        
        int b1 = Integer.parseInt(a1);
        
        System.out.println(b1-32); 
        */
        
        /*
        int b2 = 1932;
        String a2 = String.valueOf(b2);
        System.out.println(a2);
        */
        
        /*
String a1 = "Batuhan";
        String a2 = "Batuhan";
       
        
        if (a1 == a2) {
            System.out.println("Eşitler"); //Bilgisayar aynı yerde depoluyor
            
        }
        */
        
        String b1 = new String("Batuhan");
        String b2 = new String("Batuhan");
        
        if (b1 == b2) {
            System.out.println("Eşitler"); //eşit değiller çünkü içeriğine bakmıyor
        }
        if(b1.equals(b2)){
            System.out.println("Eşitler 2"); // içine baktığı için eşitler yazısını göreceğiz
        }
        
    }
    
}
