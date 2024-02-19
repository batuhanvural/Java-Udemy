/*
dosyayı UID 1000 ile yazdık, sonradan private String = dersler'i ekleyip UId 2000 yaptık. Okuyunca bize OIException hatası verdi
serialVersşonUID yapmamızın amacı tamamen budur. Yani hash almak gibi düşün. Bozulma ya da değşiklik yapılıp yapılmadığını
kontrol ediyoruz.
*/

import java.io.Serializable;


public class Ogrenci implements Serializable{
    
    private static final long serialVersionUID = 1000; //serialVersionUID = 1000; dememizin sebebi değiştirilmemesini istemediğimiz için.
    private String isim;
    private int id;
    private String bolum;
    //private String dersler;

    public Ogrenci(String isim, int id, String bolum) {
        this.isim = isim;
        this.id = id;
        this.bolum = bolum;
    }

    @Override
    public String toString() {
        
        String bilgiler = "Öğrenci İsmi: " + isim + 
                          "\nÖğrenci Numarası: " + id+
                          "\nÖğrenci Bölüm: " +bolum;
        
        return bilgiler;
        
    }
    
    
    
}
