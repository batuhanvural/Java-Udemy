
public class Yonetici extends Calisan { //subclass
    
    private int sorumlu_kisi;
    
    public Yonetici(String isim, int maas, String departman,int sorumlu_kisi){

        super(isim,maas,departman);
        
        this.sorumlu_kisi = sorumlu_kisi;
    }
    
public void zam_yap(int zam_miktari){
    System.out.println("Çalışanlara " + zam_miktari + "₺ zam yapıldı.");
}

public void bilgilerigoster(){
        
        /*System.out.println("İsim: " + getIsim());
        System.out.println("Maas : " + getMaas());
        System.out.println("Departman : " + getDepartman());*/
        
        super.bilgilerigoster();
        System.out.println("Sorumlu Kişi Sayısı : " + this.sorumlu_kisi);
}

} 
