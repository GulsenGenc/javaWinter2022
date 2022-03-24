package day18_NestedForLoop;

public class C01_ForLoop {
    public static void main(String[] args) {
        //kullanıcıdan 10 dan kucuk bır tam sayı ısteyın ve gırılen sayını faktorıyelını bulun(5!=5*4*3*2*1)

        int input=9;
        int faktoriyel=1;
        String faktoriyelAcıkYazım="";
        for (int i = input; i >=1 ; i--) {

            faktoriyel*=i;
            if (input==i){
               faktoriyelAcıkYazım=faktoriyelAcıkYazım+i;
            } else {
               faktoriyelAcıkYazım=faktoriyelAcıkYazım+"*"+i;
            }

        }
        System.out.println(input+"! = " + faktoriyelAcıkYazım+ "="+ faktoriyel);//bunu loop un dısında yazmalıyız.
    }
}
