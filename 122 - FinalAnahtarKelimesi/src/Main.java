
public class Main {
    public static void main(String[] args) {
        
        // Final anahtar kelimesi tanımlanan bir özelliğin değeri sadece bir kere verilir
        // sadece bir kere verilir sonrasında değiştirilemez. Bu değer sadece tanımlanırken ya da
        // obje oluşturulurken verilir. Başka yerde ya da şekilde verilmez. Hata verir.
        
        //Amacı değiştirilmesini istemediğiniz değerler için kullanılır (ex. db password)
        
        /*FinalTest f1 = new FinalTest("Obje 1");
        FinalTest f2 = new FinalTest("Obje 2");
        
        System.out.println("Obje Sayısı = "+f1.obje_sayisi);
        System.out.println("Obje Sayısı = "+f2.obje_sayisi);*/
        
        // f2.obje_sayisi = 10; bu kod hata veriyor çünkü final yani  daha önce tanımlandı
        ///System.out.println(Math.PI);
        
        System.out.println("Database İsmi: "+Database.databaseIsmi);
        System.out.println("Username: "+Database.userName);
        System.out.println("Password: "+Database.password);
        
    }
}
