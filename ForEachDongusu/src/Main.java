
public class Main {
    
    public static void main(String[] args) {
        
        String[] array = {"Elma","Armut","Kiraz"};
        int[] array2 = {1,2,3,4,5,6};
        Deneme[] array3 = {new Deneme("Batuhan"), new Deneme("VURAL")};
        
        
        for(Deneme d :array3){
            d.yaz();
        
            
        }
        for(int i:array2){
            System.out.println(i);
        }
        
        for (String a : array){        
            System.out.println(a);
        }
        
        /*for(int i=0; i<array.length;i++){
        
            System.out.println(array[i]);*/
        }
    }
    
    

