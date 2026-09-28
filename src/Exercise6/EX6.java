package Exercise6;

import java.util.Arrays;

public class EX6 {

    public static void main(String[] args){
        int[] a = {5, 2, 4, 17, 55, 4, 3, 26, 18, 2, 17};
        int [] b = {42, 37, 1, 97, 1, 2, 7, 42, 3, 25, 89, 15, 10, 29, 27};
        System.out.println("Median of first  array: "+ median(a));
        System.out.println("Median of second  array: "+ median(b));

    }

    public static int median(int [] arr){
        Arrays.sort(arr);
        return arr[arr.length/2];
    }


}
