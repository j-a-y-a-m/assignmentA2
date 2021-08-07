package assignmentA2;

public class GraphMain {

	public static void main(String[] args) {
		
		BST profileTree = FileReader.readReasearcherProfileSet("data/profile.txt");
		profileTree.printAlphabetical();
		
		System.out.println("======================================================");
		
		Graph graph = new Graph("data/graph.txt", profileTree);
		
//		graph.profileTree.printAlphabetical();
		

	}

}
