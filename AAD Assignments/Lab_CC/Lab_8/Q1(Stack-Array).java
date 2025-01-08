/*Write a JAVA program to perform the following operations on a STACK using an ARRAY:
Push (): Inserts a new element at the top of the stack.
Pop (): Removes an element from the top of the stack.
Top(): Returns the value of the element present at the top of the stack.
isEmpty(): Checks if the stack is empty.
Size (): Returns the number of elements in a stack.
Print the stack elements after each operation.*/

package Lab_8;

public class Q1 {

	 private int[] stack;
	    private int top;
	    private int capacity;
	    Q1(int size){
	        stack=new int[size];
	        top=-1;
	    }
	    public void push(int data){
	        if(top==capacity-1){
	            System.out.println("overflow");
	            return;
	        }
	        stack[++top]=data;
	        print();
	    }
	    public void pop(){
	        if(top==-1) {
	            System.out.println("underflow");
	            return;
	        }
	        System.out.println("element removed= "+stack[top--]);
	        print();
	    }
	    public void top(){
	        if(top==-1) {
	            System.out.println("empty");
	            return;
	        }
	        System.out.println( stack[top]);
	    }
	    public boolean isEmpty(){
	        if(top==-1)
	            return true;
	        return false;
	    }
	    public int size(){
	        return top+1;
	    }
	    public void print(){
	        for(int i:stack ){
	            System.out.print(i+"  ");
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {
	        Q1 ob=new Q1(5);
	        ob.push(20);
	        ob.push(50);
	        ob.push(40);
	        ob.push(30);
	        ob.push(10);
	        ob.push(80);
	        ob.pop();
	        ob.pop();
	      ob.top();
	        System.out.println(ob.isEmpty());
	        System.out.println(ob.size());

	}

}
