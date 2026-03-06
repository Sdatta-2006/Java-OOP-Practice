import java.util.Scanner;

public class PrimeInArray {
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
            if(a[i]<=1){
                continue;
            }
            else if(a[i]==2){
                c++;
            }
            else{
                for(int j=2;j<(a[i]/2);j++){
                    if(a[i]%j==0){
                        continue;
                    }
                    else{
                        c++;
                    }
                }
            }
        }
        System.out.println("Total number of prime numbers present: "+c);
    }
}
