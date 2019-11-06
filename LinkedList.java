
public class LinkedList {

	Node head;
	
	static class Node{
		int data;
		Node next;

		Node(int d){
			data = d;
			next = null;
		}
		
	}
	
	public static LinkedList deleteElement(LinkedList list, int element){
		Node node = list.head;
		Node prev = null;
		
		if(node != null && node.data == element){
			list.head = node.next;
			System.out.println("");
			System.out.println("found and deleted element : " + element);
			return list;
		}
		
		while(node != null && node.data != element){
			prev = node;
			node = node.next;
		}
		
		if(node != null){
			prev.next = node.next;
			System.out.println(" ");
			System.out.println("found + deleted " + element);
		}else{
			System.out.println("not foudn");
		}
		return list;
		
		
	}
	
	
	public static LinkedList insert(LinkedList list, int data){
		Node node = new Node(data);
		node.next = null;
		
		if(list.head == null){
			list.head = node;
		}else{
			Node last = list.head;
			while(last.next != null){
				last = last.next;
			}
			last.next = node;
		}
		
		return list;
	}
	
	//print the linkedlist
	
	public static void printlist(LinkedList list){
		Node node = list.head;
		System.out.print("linkedlist : ");
		while(node != null){
			System.out.print(node.data + " ");
			node = node.next;
		}
		
	}
	
	public static void main(String[] args){
		LinkedList list = new LinkedList();
		list = insert(list, 5);
		list = insert(list, 1);
		list = insert(list, 2);
		list = insert(list, 3);
		list = insert(list, 4);
		list = insert(list, 6);
		list = insert(list, 7);
		
		printlist(list);
		deleteElement(list, 7);
		printlist(list);
		
	}
	
	
	
}
