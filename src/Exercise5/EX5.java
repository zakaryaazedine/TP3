package Exercise5;

public class EX5 {


    public static void main(String[] args){
        int[][] x = {
                {2,6},
                {1,9}
        };
        int[][] y = {
                {-14,16},
                {-1,0}
        };

        int [][] z = matrixAdd(x,y);
        for (int i=0;i<z.length;i++){
            for (int j=0;j<z[i].length;j++) System.out.print(z[i][j]+ " ");
            System.out.print("\n");
        }
    }


    public static int[][] matrixAdd(int [][] a,int [][] b){
        int[][] c = new int [a.length][a[0].length];
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[0].length;j++){
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        return c;
    }

}
