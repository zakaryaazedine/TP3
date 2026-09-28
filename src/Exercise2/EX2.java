package Exercise2;

public class EX2 {

    public static void main(String[] args){
        int[] a = {1, 2, 3, 4, 5};
        reverse(a);
    }

    public static void reverse(int [] arr){
        System.out.println("Original array :");
        for (int i=0;i<arr.length;i++) System.out.print(arr[i] + " ");
        for (int i=0;i<arr.length/2;i++){
            int x = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = x;
        }

        System.out.println("\nReversed array :");
        for (int i=0;i<arr.length;i++) System.out.print(arr[i] + " ");
    }


}
