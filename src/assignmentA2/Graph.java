package assignmentA2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Graph {
	
	public BST profileTree;
	
	/**
	 * @param fileName
	 * @param tree
	 */
	public Graph(String fileName, BST tree) {
		
		
		
		File file = new File(fileName);
		try {
			Scanner sc = new Scanner(file);
			while(sc.hasNext()) {
				String[] names = sc.next().split(",");
				tree.setFollower(names[0], names[1]);
				//sc.close();
			}
			sc.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File name not valid");
		}
		this.profileTree = tree;
	}
	
//	void addEdge(ArrayList<ArrayList<String> > adj, String u, String v) {
//		adj.g
//	}
	
	
	
	/**
	 * @param researchers
	 * @return
	 */
	public BST[] followerRecommendations(List<Profile> researchers) {
		BST[] bstList = new BST[researchers.size()];
		int count = 0;
		Set<Profile> followerset = new HashSet<>();
		for(Profile p: researchers) {
			
			List<Profile> followerList = p.getFollowers();
			for(Profile k: followerList) {
				List<Profile> followerList2 = k.getFollowers();
				followerset.addAll(followerList2);
			}
			BST bst = new BST();
			for(Profile j: followerset) {
				if(!followerList.contains(j))
					bst.insertResearcher(j);
			}
			bstList[count] = bst;
			count++;
		}
		return bstList;
	}

}
