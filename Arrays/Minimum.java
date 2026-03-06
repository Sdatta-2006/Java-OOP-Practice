import java.util.Scanner;

public class Minimum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int l=sc.nextInt();
        int a[]=new int[l];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<l;i++){
            a[i]=sc.nextInt();
        }
        sc.close();
        int min=a[0];
        for(int i=1;i<l;i++){
            if(min>a[i]){
                min=a[i];
            }
        }
        System.out.printf("The minimum element in the array: %d",min);
    }
}

