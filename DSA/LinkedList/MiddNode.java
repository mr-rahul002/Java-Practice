

/****************************************************************

    Following is the class structure of the Node class:

       class Node 
        { 
        public:
            int data;
            Node next;
            Node(int data) 
            {
              this.data = data;
              this.next = null;
            }
        };

*****************************************************************/

public class MiddNode {
    public static Node findMiddle(Node head) 
    {
        // Write your code here
       //slow Pointer
        Node n1=head;
        //fast pointer
        
        Node n2=head;
        while(n2!=null){
            if(n2.next==null){
                break;
            }else{
                n1=n1.next;
                n2=n2.next.next;
            }
        }
        return n1;
    }
}
