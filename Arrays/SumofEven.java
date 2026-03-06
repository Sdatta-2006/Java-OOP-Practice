import java.util.Scanner;

public class SumofEven {
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
        int sum=0;
        for(int i=0;i<l;i++){
            if(a[i]%2==0){
                sum=sum+a[i];
            }
        }
        System.out.printf("The sum of the even numbers of an array: %d",sum);
        sc.close();
    }
}
