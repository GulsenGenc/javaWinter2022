package Pratiklerim2;

public class Arrays {
    public static void main(String[] args) {
        //Soru 1 )
        //Asagidaki multi dimensional array’in tum elemanlarinin carpimini ekrana
        //yazdiran bir method yaziniz. { { 1,2,3}, {4,5},{6}}

        int arr[][]={{1,2,3},{4,5},{6} };

        int carpım =1;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                carpım*=arr[i][j];
                //System.out.println(arr[i][j]); //tüm elemanlarını tek tek yazdırmak istersek.
            }
        }
        System.out.println("verilen arrayin tüm elemanlarının çarpımı :" +carpım);
    }
}
