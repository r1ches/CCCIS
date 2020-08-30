
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
 
// A linked list node
class Node {
    int data;
    Node next;
 
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
 
public class Main
{
    // Utility function to print contents of a linked list
    public static void printList(Node node) {
        while (node != null ){//&& node.next != null ) {
            if (node.next != null){
        	System.out.print(node.data + " -> ");
            }
            else{
            	System.out.print(node.data );
            }
        	node = node.next;
        }
        //System.out.println(" complete");
    }
 
    // The main function to merge given k sorted linked lists
    // It takes an array of lists list[0..k) and generates the sorted output
    public static Node mergeKLists(Node[] list, int k)
    {
        // create an empty min-heap using a comparison object for ordering the min-heap
        PriorityQueue<Node> pq;
        pq = new PriorityQueue(Comparator.comparingInt(a -> ((Node) a).data));
 
        // push first node of each list into the min-heap
	try{
	        pq.addAll(Arrays.asList(list).subList(0, k));
        }catch (NullPointerException e) {
			System.out.println("Something about that list did not work.");
		}
        
 
        // take two pointers head and tail where head points to the first node
        // of the output list and tail points to its last node
        Node head = null, last = null;
 
        // run till min-heap is empty
        while (!pq.isEmpty())
        {
            // extract minimum node from the min-heap
            Node min = pq.poll();
 
            // add the minimum node to the output list
            if (head == null) {
                head = last = min;
            } else {
                last.next = min;
                last = min;
            }
 
            // take next node from "same" list and insert it into the min-heap
            if (min.next != null) {
                pq.add(min.next);
            }
        }
 
        // return head node of the merged list
        return head;
    }
 
    public static Node main(Node[] s) {
        int k = s.length; // Number of linked lists
        //System.out.println(k);
        
        if(k==1){
        	return s[0];
        }
        Node head = null;
    	head = mergeKLists(s, k);
       
        
        printList(head);
        
        return head;
    }
}