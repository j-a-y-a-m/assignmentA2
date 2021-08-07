package assignmentA2;

public class BSTMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BST tree = new BST();
		
		tree.insertResearcher(new Profile("Kumar", "F", null, null, null, null, null, null, null));
		tree.insertResearcher(new Profile("Kumar", "H", null, null, null, null, null, null, null));
		tree.insertResearcher(new Profile("Pranav", "A", null, null, null, null, null, null, null));
		tree.insertResearcher(new Profile("Z", "C", null, null, null, null, null, null, null));
		tree.insertResearcher(new Profile("D", "E", null, null, null, null, null, null, null));
		tree.insertResearcher(new Profile("S", "J", null, null, null, null, null, null, null));
		tree.insertResearcher(new Profile("SD", "A", null, null, null, null, null, null, null));
		tree.insertResearcher(new Profile("Jaspreet", "P", null, null, null, null, null, null, null));
		tree.insertResearcher(new Profile("Kumar", "N", null, null, null, null, null, null, null));
		tree.insertResearcher(new Profile("Cumar", "H", null, null, null, null, null, null, null));
		tree.insertResearcher(new Profile("Kumar", "L", null, null, null, null, null, null, null));
		
		tree.printAlphabetical();

	}

}
