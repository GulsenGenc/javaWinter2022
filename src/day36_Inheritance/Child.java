package day36_Inheritance;

public class Child extends Parent {

    Child(int i){

    }

    Child(){
        System.out.println("child constractor çalıştı.");
    }
    //extends keyword kullanan classlarda bız gormesek bıle javanın oluşturdugu default constractor vardır.
    //tum constractorların ılk satırında bız gormesek bıle super constractor call vardır.
    //yanı parent classın parametresız constractor call vardır

    public static void main(String[] args) {

        Child child= new Child();
    }
}
