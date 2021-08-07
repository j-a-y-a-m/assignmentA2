package assignmentA2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FileReader {
	
	/**
	 * @param fileName
	 * @return
	 */
	public static BST readReasearcherProfileSet(String fileName) {
		File file = new File(fileName);
		BST profileTree = new BST();
		try {
			Scanner sc = new Scanner(file);
			while (sc.hasNextLine()) {
				String[] arr = sc.nextLine().split(",");
				Profile p = new Profile(arr[0], arr[1], Integer.parseInt(arr[2]), Integer.parseInt(arr[3]), 
						Integer.parseInt(arr[4]), arr[5], arrayToList(arr[6]), arrayToList(arr[7]), arrayToList(arr[8]));
				profileTree.insertResearcher(p);
			}
			sc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File name not valid");
		}
		return profileTree;
	}
	
	/**
	 * @param str
	 * @return
	 */
	private static List<String> arrayToList(String str) {
		String[] arr = str.split(";");
		List<String> list = Arrays.asList(arr);
		return list;
	}

}
