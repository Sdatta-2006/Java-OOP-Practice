import java.util.Scanner;
public class Queue {
    int size=20;
    int queue[]=new int[size];
    int front=-1,rear=-1;
    public void enQ(int e){
        if(rear==size-1){
            System.out.println("Queue is overflowed!");
        }
        else{
            front=0;
            queue[++rear]=e;
        }
    }

    public int deQ(){
        if(front==-1){
            System.out.println("Queue is underflowed!");
            return 0;
        }
        else{
            int p=queue[front];
            front++;
            return p;
        }
    }

    public int peek(){
        if(front==-1){
            System.out.println("Queue is underflowed!");
            return 0;
        }
        else{
            return queue[front];
        }
    }

    public void display(){
        if(front==-1){
            System.out.println("Queue is underflowed!");
        }
        else{
            System.out.print("The queue elements are: ");
            for(int i=front;i<=rear;i++){
                System.out.printf("%d ",queue[i]);
            }
        }
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Queue q=new Queue();
        int ch;
        do{
            System.out.printf("\nQueue Operations:\n 1. EnQ\n 2. DeQ\n 3. Peek\n 4. Display\n");
            System.out.print("Enter your choice: ");
            ch=sc.nextInt();
            switch(ch){
                case 1:{
                    System.out.print("Enter the number of elements you want to enqueue: ");
                    int n=sc.nextInt();
                    for(int i=0;i<n;i++){
                        int m=sc.nextInt();
                        q.enQ(m);
                    }
                    break;
                }
                case 2:{
                    int p=q.deQ();
                    System.out.printf("The dequeued element: %d",p);
                    break;
                }
                case 3:{
                    int n=q.peek();
                    System.out.printf("The front element: %d",n);
                    break;
                }
                case 4:{
                    q.display();
                    break;
                }
            }
        }while(ch!=0);
        sc.close();
    }
}

