import java.util.Scanner;

public class MergedandSort {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the first array: ");
        int l1=sc.nextInt();
        int[] a1=new int[l1];
        System.out.print("Enter the size of the second array: ");
        int l2=sc.nextInt();
        int[] a2=new int[l2];
        System.out.println("Enter the elements of the first array:");
        for(int i=0;i<l1;i++){
            a1[i]=sc.nextInt();
        }
        for(int i=0;i<l1-1;i++){
            for(int j=0;j<l1-i-1;j++){
                if(a1[j]<a1[j+1]){
                    int t=a1[j];
                    a1[j]=a1[j+1];
                    a1[j+1]=t;
                }
            }
        }
        System.out.println("Enter the elements of the second array:");
        for(int i=0;i<l2;i++){
            a2[i]=sc.nextInt();
        }
        for(int i=0;i<l2-1;i++){
            for(int j=0;j<l2-i-1;j++){
                if(a2[j]<a2[j+1]){
                    int t=a2[j];
                    a2[j]=a2[j+1];
                    a2[j+1]=t;
                }
            }
        }
        System.out.print("\nThe first sorted array: ");
        for(int i=0;i<l1;i++){
            System.out.print(a1[i]+" ");
        }
        System.out.print("\nThe second sorted array: ");
        for(int i=0;i<l2;i++){
            System.out.print(a2[i]+" ");
        }
        int[] m=new int[l1+l2];
        for(int i=0;i<l1;i++){
            m[i]=a1[i];
        }
        for(int i=0;i<l2;i++){
            m[l1+i]=a2[i];
        }
        for(int i=0;i<l1+l2-1;i++){
            for(int j=0;j<l1+l2-i-1;j++){
                if(m[j]<m[j+1]){
                    int t=m[j];
                    m[j]=m[j+1];
                    m[j+1]=t;
                }
            }
        }
        System.out.print("\nThe merged sorted array: ");
        for(int i=0;i<l1+l2;i++){
            System.out.print(m[i]+" ");
        }
        sc.close();
    }
}

