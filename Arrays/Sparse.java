import java.util.Scanner;

public class Sparse {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n=sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int m=sc.nextInt();
        int[][] ar1=new int[m][n];
        int e=m*n;
        int c=0;
        System.out.println("Enter the array:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                ar1[i][j]=sc.nextInt();
            }
        }
        System.out.println("The original matrix: ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(ar1[i][j]+" ");
            }
            System.out.printf("\n");
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(ar1[i][j]==0){
                    c++;
                }
            }
        }
        if(c>=(e/2)){
            System.out.println("The matrix is a sparse matrix!");
        }
        else{
            System.out.println("The matrix is not a sparse matrix!");
        }
    }
}
