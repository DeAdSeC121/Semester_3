
/*Write a JAVA program to perform the following operations on a Stack using an array:
a) Push()
b) pop()
c) Top()
d) isEmpty()
e) Size()

Print the stack elements after each operations
*/


public class Q1
{
    static int top=-1;
    public static void insert(int []a, int n)
     {
        if(top==a.length-1)
        System.out.println("overflow");
        else{
            a[++top]=n;
        }
        return;

    }
    public static void pop(int a[])
    {
        if(top<0)
        System.out.println("Under-Flow");
        else{
            top=top-1;
        }
    }
    public static void top(int a[])
    {
        System.out.println("Element at top="+a[top]);
    }
    public static void is_Empty(int a[])
    {
        if(top==-1)
        System.out.println("Under-Flow");
    }
    public static void size(int a[])
    {
        System.out.println("size "+top);
    }
    public static void print(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.print("  "+a[i]);
        }
    }

public static void main( String args[]){
    Q1 ob =new Q1();
    int a[]=new int [5];
    int top=5;

    insert(a,1);
    insert(a,2);
    insert(a,3);
    insert(a,4);
    insert(a,5);
    print(a);
  }
}



//outpot
//  1  2  3  4  5
