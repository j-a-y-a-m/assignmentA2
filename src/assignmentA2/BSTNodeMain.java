package assignmentA2;

public class BSTNodeMain {

	public static void main(String[] args) {
		
		Profile p1 = new Profile("Kumar", "F", null, null, null, null, null, null, null);
		Profile p2 = new Profile("Kumar", "H", null, null, null, null, null, null, null);
		Profile p3 = new Profile("Kumar", "A", null, null, null, null, null, null, null);

		BSTNode node1 = new BSTNode(p1);
		BSTNode node2 = new BSTNode(p2);
		BSTNode node3 = new BSTNode(p3);
		
		node1.setL(node2);
		node1.setR(node3);
		
		System.out.println(node1.getResearcher());
		System.out.println(node1.getL());
		System.out.println(node1.getR());
	}

}
