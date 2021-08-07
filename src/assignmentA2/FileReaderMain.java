package assignmentA2;

public class FileReaderMain {

	public static void main(String[] args) {
		
		BST profileTree = FileReader.readReasearcherProfileSet("data/profile.txt");
		
		profileTree.printAlphabetical();

	}

}
