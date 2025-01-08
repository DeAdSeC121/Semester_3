/*Write a JAVA program to perform the following operations on a QUEUE using an array:
Push (): Inserts a new element at the top of the stack.
Pop (): Removes an element from the top of the stack.
Top(): Returns the value of the element present at the top of the stack.
isEmpty(): Checks if the stack is empty.
Size (): Returns the number of elements in a stack.
Print the stack elements after each operation.*/

package Lab_9;

public class Q1 {

	 private int [] arr;
	    private int front;
	    private int rear;
	    private int capacity;
	    private int count;
	     Q1(int size){
	         arr=new int[size];
	         capacity=size;
	         front =0;
	         rear=-1;
	         count=0;
	     }
	     public void Enqueue(int data){
	         if(isFull()){
	             System.out.println("overflow");
	             return;
	         }
	         else{
	             rear=(rear+1)%capacity;
	             arr[rear]=data;
	             count++;
	             print();
	         }
	     }
	    public void dequeue() {
	        if (isEmpty()) {
	            System.out.println("Underflow");
	            return;
	        }
	        System.out.println("Dequeued: " + arr[front]);
	        front = (front + 1) % capacity;
	        count--;
	        print();
	    }
	     public int peek(){
	         if(isEmpty()) {
	             System.out.println("empty");
	         }

	             return arr[front];

	     }
	     public boolean isEmpty(){
	         if(count==0)
	             return true;
	         return false;
	     }
	     public boolean isFull(){
	         return (capacity==count);
	     }
	     public int size(){
	         return count;
	     }
	     public void print(){
	         for(int i=0;i<count;i++){
	             System.out.print(arr[(front + i) % capacity]+" , ");
	         }
	         System.out.println();
	     }

	    public static void main(String[] args) {
	        Q1 ob=new Q1(5);
	        ob.Enqueue(20);
	        ob.Enqueue(40);
	        ob.Enqueue(50);
	        ob.Enqueue(10);
	        ob.Enqueue(30);
	        ob.Enqueue(70);
	        ob.dequeue();
	        ob.dequeue();
	        ob.peek();
	        ob.isEmpty();
	        ob.isFull();


	}

}
