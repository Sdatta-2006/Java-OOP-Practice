import java.util.Scanner;

public class SecondHighest {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int l=sc.nextInt();
        int a[]=new int[l];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<l;i++){
            a[i]=sc.nextInt();
        }
        //sort in descending//
        for(int i=0;i<l-1;i++){
            for(int j=0;j<l-i-1;j++){
                if(a[j]<a[j+1]){
                    int t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
        System.out.println("The second highest element of the array: "+a[1]);
        sc.close();
    }
}
