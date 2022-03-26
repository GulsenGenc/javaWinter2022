package day27_Constractor;

public class Volvo {

    String marka="Volvo";
    String mensei="İsveç";
    String model;
    boolean elektrikliMi;
    int yıl;
    String yakıt;
    boolean otomatıkPilot=otomotikPilotSorgusu();
    int maxHız=maxiHızAta();

    public Volvo(String mdl, boolean elk, int yl, String ykt) {
        model=mdl;
        elektrikliMi=elk;
        yıl=yl;
        yakıt=ykt;

    }
    Volvo(){

    }


    public String torString(){

        String arabaOzellıklerı="Model :"+model+ " Yakıt :"+yakıt+
                " max hız :"+maxHız;
        return arabaOzellıklerı;
    }



   public int maxiHızAta() {
        int maxHız=0;
        if (elektrikliMi){
            maxHız=160;
        }
        else{
            maxHız=240;
        }
        return maxHız;
    }

    private boolean otomotikPilotSorgusu() {
        boolean sonuc=false;

        if(elektrikliMi){
            sonuc=true;
        }
        return sonuc;

    }
}
