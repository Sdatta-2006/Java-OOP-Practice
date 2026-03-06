import java.util.Scanner;

public class MergeFloat {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the first array: ");
        int l1=sc.nextInt();
        float[] a1=new float[l1];
        System.out.print("Enter the size of the second array: ");
        int l2=sc.nextInt();
        float[] a2=new float[l2];
        System.out.println("Enter the elements of the first array:");
        for(int i=0;i<l1;i++){
            a1[i]=sc.nextFloat();
        }
        System.out.println("Enter the elements of the second array:");
        for(int i=0;i<l2;i++){
            a2[i]=sc.nextFloat();
        }
        System.out.print("\nThe first array: ");
        for(int i=0;i<l1;i++){
            System.out.print(a1[i]+" ");
        }
        System.out.print("\nThe second array: ");
        for(int i=0;i<l2;i++){
            System.out.print(a2[i]+" ");
        }
        float[] m=new float[l1+l2];
        for(int i=0;i<l1;i++){
            m[i]=a1[i];
        }
        for(int i=0;i<l2;i++){
            m[l1+i]=a2[i];
        }
        System.out.print("\nThe merged array: ");
        for(int i=0;i<l1+l2;i++){
            System.out.print(m[i]+" ");
        }
        sc.close();
    }
}

