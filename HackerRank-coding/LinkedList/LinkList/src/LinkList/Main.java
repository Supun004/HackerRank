package LinkList;

class LinkedList {
	Node firstNode;
		
	void insertNode(int data){
		if(firstNode ==null) {
			firstNode = new Node();
			firstNode.data = data;
			firstNode.nextNode = null;
		}
		else {
			Node temp = firstNode;
			while(temp.nextNode !=null ) {
				temp = temp.nextNode;
			}
			temp.nextNode = new Node();
			temp.nextNode.data = data;
			temp.nextNode.nextNode = null;
		}
	}
	
	boolean searchNode(int searchData) {
		Node temp = firstNode;
		
		while(temp !=null) {
			if(temp.data == searchData) {
				System.out.println("Data Node found:"+temp.data);
				return true;
			}
			temp = temp.nextNode;
		}
		System.out.println("Data Node found:"+searchData);
		return false;
	}
	
	void deletNode(int val) {
		Node temp = firstNode;
		
		if(firstNode == null) System.out.println("List is empty");
		else if(firstNode.data == val) firstNode = firstNode.nextNode;
		else {
			Node tempNext = temp.nextNode;
			while(tempNext !=null) {
				if(tempNext.data == val) {
					temp.nextNode = tempNext.nextNode;
					System.out.println("Node "+val+" deleted");
					return;
				}
				temp = temp.nextNode;
				tempNext = tempNext.nextNode;
			}
			System.out.println("Node not found");
		}
	}
	void printList() {
		Node temp = firstNode;
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.nextNode;
		}
	}

}



public class Main{
	
	public static void main(String[] args) {	
		
		LinkedList linkList = new LinkedList();
		linkList.insertNode(5);
		linkList.insertNode(4);
		linkList.insertNode(10);
		linkList.insertNode(1);
		linkList.printList();
		
		//System.out.println(linkList.searchNode(4));
		//linkList.searchNode(11);
		linkList.deletNode(4);
		System.out.println();
		linkList.printList();
		linkList.deletNode(1);
		System.out.println();
		linkList.printList();
		linkList.deletNode(5);
		System.out.println();
		linkList.printList();
		linkList.deletNode(10);
		System.out.println();
		linkList.printList();
		linkList.deletNode(5);
//		System.out.println();
//		linkList.printList();
	}
}
