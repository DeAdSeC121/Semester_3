/*Write a JAVA program to perform the operations 
 * listed above in Qu no. 1 on a STACT using a LINKED LIST. 
 * Print the stack elements after each operation.
 * */

package Lab_8;

public class Q2 {
	
	
	class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
private Node top;

public void push(int data){
    Node node=new Node(data);
    node.next=top;
    top= node;
    print();

}
public void pop() {
    if (isEmpty()) {
        System.out.println("underflow");
        return;
    } else {
        System.out.println("removed data " + top.data);
        top = top.next;
    }
    print();
}
public void top(){
    if(isEmpty()) {
        System.out.println("empty");
        return ;
    }
    else {
        System.out.println(top.data);
        return;
    }
}
public void size(){
    if(top==null){
        System.out.println("empty");
        return;
    }

    int c=0;
    Node temp=top;
    while(temp!=null){
        c++;
        temp=temp.next;
    }


}
public boolean isEmpty(){
    if(top==null)
        return true;
    return false;
}
public void print(){
    if(top==null) {
        System.out.println("empty");
        return;
    }
    int c=0;
    Node temp=top;
    while(temp!=null){
        System.out.print(temp.data+",");
        temp=temp.next;
    }
    System.out.println();

}

public static void main(String[] args) {
    Q2 ob=new Q2();
    ob.push(20);
    ob.push(10);
    ob.push(30);
    ob.push(50);
    ob.pop();
    ob.pop();
    ob.pop();
    ob.top();
    ob.isEmpty();
    ob.size();


	}

}
