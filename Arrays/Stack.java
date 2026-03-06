import java.util.Scanner;

public class Stack {
    int size=20;
    int stack[]=new int[size];
    int top=-1;
    public void push(int e){
        if(top==size-1){
            System.out.println("Stack is overflowed!");
        }
        else{
            stack[++top]=e;
        }
    }

    public int pop(){
        if(top==-1){
            System.out.println("Stack is underflowed!");
            return 0;
        }
        else{
            int p=stack[top];
            top--;
            return p;
        }
    }

    public int peek(){
        if(top==-1){
            System.out.println("Stack is underflowed!");
            return 0;
        }
        else{
            return stack[top];
        }
    }

    public void display(){
        if(top==-1){
            System.out.println("Stack is underflowed!");
        }
        else{
            System.out.print("The stack elements are: ");
            for(int i=top;i>=0;i--){
                System.out.printf("%d ",stack[i]);
            }
        }
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Stack s=new Stack();
        int ch;
        do{
            System.out.printf("\nStack Operations:\n 1. Push\n 2. Pop\n 3. Peek\n 4. Display\n");
            System.out.print("Enter your choice: ");
            ch=sc.nextInt();
            switch(ch){
                case 1:{
                    System.out.print("Enter the number of elements you want to push: ");
                    int n=sc.nextInt();
                    for(int i=0;i<n;i++){
                        int m=sc.nextInt();
                        s.push(m);
                    }
                    break;
                }
                case 2:{
                    int p=s.pop();
                    System.out.printf("The popped element: %d",p);
                    break;
                }
                case 3:{
                    int q=s.peek();
                    System.out.printf("The top element: %d",q);
                    break;
                }
                case 4:{
                    s.display();
                    break;
                }
            }
        }while(ch!=0);
    }
}
