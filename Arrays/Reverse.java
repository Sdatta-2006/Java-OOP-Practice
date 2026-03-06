import java.util.Scanner;

public class Reverse {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int l=sc.nextInt();
        int a[]=new int[l];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<l;i++){
            a[i]=sc.nextInt();
        }
        System.out.print("\nThe original array: ");
        for(int i=0;i<l;i++){
            System.out.print(a[i]+" ");
        }
        System.out.print("\nThe reversed array: ");
        for(int i=l-1;i>=0;i--){
            System.out.print(a[i]+" ");
        }
        sc.close();
    }
}
