import java.util.Scanner;

public class Addition {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows and columns: ");
        int n=sc.nextInt();
        int[][] ar1=new int[n][n];
        int[][] ar2=new int[n][n];
        int[][] c=new int[n][n];
        System.out.println("Enter the first array:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                ar1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the second array:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                ar2[i][j]=sc.nextInt();
            }
        }
        //addition part//
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                c[i][j]=ar1[i][j]+ar2[i][j];
            }
        }
        System.out.println("the resultant 2D array:");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.printf("\n");
        }
        sc.close();
    }
}
