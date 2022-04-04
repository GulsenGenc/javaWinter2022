package day34_accessModifier_encapsulatıon;

public class C03 {


        //encapsule edecegımız 2 varıable olusturalım

     private int sayı;
     private String str;

    @Override
    public String toString() {
        return "sayı=" + sayı +
                ", str=" + str ;

    }

    public int getSayı() {
        return sayı;
    }

    public void setSayı(int sayı) {
        this.sayı = sayı;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}

