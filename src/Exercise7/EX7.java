package Exercise7;

public class EX7 {


    public static void main(String[] args){
        int [] x = {1, -2, 4, -4, 9, -6, 16, -8, 25, -10};
        System.out.print(stdev(x));
    }

    public static double stdev (int [] arr){
        double sum = 0;
        for (int i=0;i< arr.length;i++) sum+=arr[i];
        double avg = (double) sum/arr.length;
        double sumOfDiff = 0;
        for (int i=0;i<arr.length;i++) sumOfDiff += ((double)arr[i] - avg)*((double)arr[i] - avg);
        double res = sumOfDiff/(arr.length-1);
        return Math.sqrt(res);
    }

}
