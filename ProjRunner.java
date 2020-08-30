

public class ProjRunner {
	public static void main(String args[]) {
		
		System.out.println("This is the running demonstration file.");
		
		Node[] list = new Node[3];
		 
        list[0] = new Node(1);
        list[0].next = new Node(4);
        list[0].next.next = new Node(5);
 
        list[1] = new Node(3);
        list[1].next = new Node(4);
        list[1].next.next = new Node(5);
        list[1].next.next.next = new Node(9);
 
        
        
        list[2] = new Node(2);
        list[2].next = new Node(3);
        list[2].next.next = new Node(4);
		
        
		Main.main(list);
		System.out.println();
		
		
		list = new Node[2];
		 
        list[0] = new Node(1);
        list[0].next = new Node(3);
        list[0].next.next = new Node(5);
		
        list[1] = new Node(1);
        list[1].next = new Node(3);
        list[1].next.next = new Node(4);
        list[1].next.next.next = new Node(9);
		
        Main.main(list);
		System.out.println();
		
		
		list = new Node[0];
		 		
		 Main.main(list);
			System.out.println();
		
		list = new Node[1];
		list[0] = new Node(1);
        list[0].next = new Node(3);
        list[0].next.next = new Node(5);
        
		
        Main.main(list);
		System.out.println();
		

		
		list = new Node[2];
		 
        list[0] = new Node(1);
        list[0].next = new Node(3);
        list[0].next.next = new Node(5);
		
        list[1] = new Node(1);
        list[1].next = new Node(3);
        list[1].next.next = new Node(4);
        list[1].next.next.next = new Node(9);
		
		Main.main(list);
		System.out.println();

		
		System.out.print("Complete");
	}
}
