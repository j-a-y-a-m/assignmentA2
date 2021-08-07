package assignmentA2;

public class BST {
	
	private BSTNode root;

	/**
	 * 
	 */
	public BST() {
		this.root = null;
	}
	
	
	public void insertResearcher(Profile p) {
		root = insertResearcherNode(root, p);
	}
	
	private BSTNode insertResearcherNode(BSTNode root, Profile p) {
		if(root == null) {
			return new BSTNode(p);
		}
		if (root.getResearcher().getLastName().compareTo(p.getLastName()) > 0) {
			root.setL(insertResearcherNode(root.getL(), p));
		} else {
			root.setR(insertResearcherNode(root.getR(), p));
		}
		
		return root;
	}
	
	public void printAlphabetical() {
         inorderRec(root);
    }
 
    // A utility function to
    // do inorder traversal of BST
    private void inorderRec(BSTNode root)
    {
        if (root != null) {
            inorderRec(root.getL());
            System.out.println(root.getResearcher().toString());
            inorderRec(root.getR());
        }
    }
    
    public void setFollower(String lastName, String lastName2) {    	
    	serchResearcherNode(root, lastName2).getResearcher()
    	.followResearcher(serchResearcherNode(root, lastName).getResearcher());
    }
    
    
    
    
    private BSTNode serchResearcherNode(BSTNode root, String lastName) {
    	
    	if(root == null) {
    		throw new IllegalArgumentException("Profile with lastname: " + lastName + " not found" );
    	} else if(root.getResearcher().getLastName().equals(lastName)) {
    		return root;
    	}else if (root.getResearcher().getLastName().compareTo(lastName) > 0) {
    		return root.getL();
    	} else {
    		return root.getR();
    	}
    }

}
