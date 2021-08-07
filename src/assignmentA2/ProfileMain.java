package assignmentA2;

public class ProfileMain {

	public static void main(String[] args) {
		
		Profile p1 = new Profile("Kumar", "F", null, null, null, null, null, null, null);
		Profile p2 = new Profile("Kumar", "H", null, null, null, null, null, null, null);
		Profile p3 = new Profile("Kumar", "A", null, null, null, null, null, null, null);
		
		p2.followResearcher(p1);
		p2.followResearcher(p3);
		
		System.out.println(p2.getFollowers());
		
		System.out.println(p2.getFollowers(1));
		
		System.out.println(p2.toString());
		
		System.out.println(p2.numOfFollowers());

	}

}
