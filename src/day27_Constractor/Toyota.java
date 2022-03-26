package day27_Constractor;

public class Toyota {
    String model;
    String marka="Toyota";
    int teker=4;
    boolean motorVarMı=true;
    String yakıt;
   int yıl;

   public void maxHız(){
       if (yakıt.equals("benzin")){
           System.out.println("benzinli araclar max 240 km hız yapar");
       } else if (yakıt.equals("dizel")){
           System.out.println("dizel araclar max 260 km hız yapar");
       }
   }

   public void renkScenekleri(){
       if (model.equals("corolla")){
           System.out.println("corolla renk secenekleri kırmızı beyaz");
       } else if (model.equals("Yaris")){
           System.out.println("yaris renk secenekleri sıyah gri");
       }
   }


}
