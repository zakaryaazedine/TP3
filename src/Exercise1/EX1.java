package Exercise1;

public class EX1 {
    public static void main(String [] args){
        int[] a = {106, 26, 81, 5, 15};
        printArray(a);
        int[] b =  sortIntegers(a);
        printArray(b);
    }

    public static void printArray(int [] arr){
        for (int i=0;i<arr.length;i++) System.out.println("Element "+ i+ " contents "+ arr[i]);
    }

    public static int [] sortIntegers(int [] arr){
        int [] s = arr.clone();
        for (int i=0;i< s.length;i++) {
            for (int j=i+1;j<s.length;j++) {
                if (s[j] > s[i]) {
                    int x = s[i];
                    s[i] = s[j];
                    s[j] = x;
                }
            }
        }
        return s;
    }


}

