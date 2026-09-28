package Exercise3;

public class EX3 {

    public static void main(String[] args){
        int k=1;
        int[][] x = new int [5][];
        for (int i=0;i<5;i++){
            x[i] = new int [i+1];
            for (int j=0;j<i+1;j++) x[i][j] = k++;
        }

        for (int i=0;i<x.length;i++){
            for (int j=0;j<x[i].length;j++) System.out.print(x[i][j] + " ");
            System.out.print("\n");
        }

    }

}
