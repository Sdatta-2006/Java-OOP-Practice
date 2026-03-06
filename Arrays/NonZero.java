import java.util.Scanner;

public class NonZero {
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int l=sc.nextInt();
        int a[]=new int[l];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<l;i++){
            a[i]=sc.nextInt();
        }
        int c=0;
        for(int i=0;i<l;i++){
            if(a[i]!=0){
                c++;
            }
        }
        System.out.println("Number of non-zero elements in the array: "+c);
        sc.close();
    }
}
