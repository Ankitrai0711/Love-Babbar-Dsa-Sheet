class CreatingManulLinkedList{
    public static void main(String []args){
        CustomeLinkedList list = new CustomeLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.printList();
    }
}



class Node{
    int data;
    Node next;
    Node(int data){
        this.data =data;
        this.next=null;
    }
}

class CustomeLinkedList{
    Node head;
     void add(int data){
         Node newNode = new Node(data);
         if(head==null){
             head = newNode;
             return;
         }
         Node currentNode = head;
         while(currentNode.next!=null){
             currentNode = currentNode.next;
         }
         currentNode.next = newNode;
     }
     
     
     void printList(){
         
         Node currentNode = head ;
         while(currentNode.next!=null){
             System.out.print(currentNode.data+"->");
             currentNode= currentNode.next;
         }
          System.out.print("Null");
         
     }
}