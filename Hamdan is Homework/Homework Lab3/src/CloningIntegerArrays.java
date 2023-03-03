import java.util.Arrays;

public class CloningIntegerArrays {



    public static void main(String[] args) {

        int[] h={1,2,3,4,5};
        int[] k = new int[6];

        System.out.println(" Array 1:"+Arrays.toString(h));
        for (int i = 0; i < 5; i++) {
            k[i]=h[i];
        }
        /** OR **/
        k=h;

        System.out.println(" Array 2:"+Arrays.toString(h));
    }
}
