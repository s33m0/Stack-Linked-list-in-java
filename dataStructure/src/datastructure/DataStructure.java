
package datastructure;
class StackLinkedlist<T>{
    Node top; 
  
    void push(T value){  // method to add the node
     Node n=new Node(value);
      n.next=top;
      top=n;
    }
    void pop(){
        top=top.next;
    }
    void print(){ 
        Node n=top;
        while (n !=null) {  //print 
            System.out.println(n.value);
           n= n.next;
        }
    }
    
    
    Object get(int i){
         Node n=top;
        int j=0;
          while (n!=null) {  //get location of element
            if(j==(i)){
                return n.value;
            }
           n= n.next;
           j++;
          }
          return -1;
    }
    Object search(T element){
        Node n=top;
        int i=0;
          while (n!=null) {  //search
            if(n.value.equals(element)){
                return i;
            }
            
           n= n.next;
           i++;
          }
          return null;
    }
}

 class Node<T> {
    T value;  // the data type that you wanna add it 
    Node next; // address for next node
    public Node(T value) { // constructor to initions data
        this.value = value;
        this.next = null; // null it means next node it empty (no thing)
    }  
}
public class DataStructure {

    public static void main(String[] args) {
        StackLinkedlist<Integer> l=new StackLinkedlist<>();
     l.push(8);
     l.push(9);
     l.pop();
     l.print();
       System.out.println(l.search(9));
       System.out.println(l.get(0));
     
}}
