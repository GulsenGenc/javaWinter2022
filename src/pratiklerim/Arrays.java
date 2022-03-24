package pratiklerim;

public class Arrays {
    public static void main(String[] args) {
        //Have the function DistinctList(arr) take the array of numbers stored in arr
        // and determine the total number of duplicate entries. For example if the input is[1,2,2,2,3]
        // then your program should output 2 because there are two duplicates of one of the elements.
        // Input: new int[] {0,-2,-2,5,5,5}  Output: 3
        // Input: new int[] {100,2,101,4}   Output: 0`


        int input[]={0,-2,-2,5,5,5};
        int sayı=5;
        tekrarEdenleriBul(input ,sayı);
    }
    public static void tekrarEdenleriBul(int[] input, int sayı) {

       int sayac=0;
        for (int i = 0; i <input.length ; i++) {

            if (sayı==input[i]){
                sayac++;
            }
        }
        System.out.println(sayı+ " sayısının "+ (sayac-1)+ "adet kopyası vardır.");
    }
}
