package day22_Arrays;

import java.util.Arrays;

public class C07_Split {
    public static void main(String[] args) {

        String str="Java gün gectikce güzellesiyor";

       String kelimeler[]= str.split("gün ");
        System.out.println(Arrays.toString(kelimeler));//[Java , gectikce güzellesiyor]
        String harfler[]=str.split("");
        System.out.println(Arrays.toString(harfler));//[J, a, v, a,  , g, ü, n,  , g, e, c, t, i, k, c, e,
        //  , g, ü, z, e, l, l, e, s, i, y, o, r]



    }
}
