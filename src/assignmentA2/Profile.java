package assignmentA2;

import java.util.ArrayList;
import java.util.List;

public class Profile {

	private String firstName;
	
	private String lastName;
	
	private Integer day;
	
	private Integer month;
	
	private Integer year;
	
	private String email;
	
	private List<String> pastWorks;
	
	private List<String> researchIntrest;
	
	private List<String> researchConference;
	
	private List<Profile> followers;

	/**
	 * @return
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return
	 */
	public Integer getDay() {
		return day;
	}

	/**
	 * @param day
	 */
	public void setDay(Integer day) {
		this.day = day;
	}

	/**
	 * @return
	 */
	public Integer getMonth() {
		return month;
	}

	/**
	 * @param month
	 */
	public void setMonth(Integer month) {
		this.month = month;
	}

	/**
	 * @return
	 */
	public Integer getYear() {
		return year;
	}

	/**
	 * @param year
	 */
	public void setYear(Integer year) {
		this.year = year;
	}

	/**
	 * @return
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return
	 */
	public List<String> getPastWorks() {
		return pastWorks;
	}

	/**
	 * @param pastWorks
	 */
	public void setPastWorks(List<String> pastWorks) {
		this.pastWorks = pastWorks;
	}

	/**
	 * @return
	 */
	public List<String> getResearchIntrest() {
		return researchIntrest;
	}

	/**
	 * @param researches
	 */
	public void getResearchIntrest(List<String> researchIntrest) {
		this.researchIntrest = researchIntrest;
	}
	

	/**
	 * @return
	 */
	public List<String> getResearchConference() {
		return researchConference;
	}

	/**
	 * @param researchConference
	 */
	public void setResearchConference(List<String> researchConference) {
		this.researchConference = researchConference;
	}

	/**
	 * @return
	 */
	public List<Profile> getFollowers() {
		return followers;
	}

	public void setFollowers(List<Profile> followers) {
		this.followers = followers;
	}
	
	/**
	 * Function to add followers to the profile
	 * 
	 * @param p
	 */
	public void followResearcher(Profile p) {
		this.followers.add(p);
	}
	
	/**
	 * @param i
	 * @return
	 */
	public Profile getFollowers(int i) {
		return this.followers.get(i);
	}
	
	/**
	 * @return
	 */
	public Integer numOfFollowers() {
		return this.followers.size();
	}

	/**
	 * @param firstName
	 * @param lastName
	 * @param day
	 * @param month
	 * @param year
	 * @param email
	 * @param pastWorks
	 * @param researches
	 * @param followers
	 */
	public Profile(String lastName, String firstName, Integer day, Integer month, Integer year, String email,
			List<String> pastWorks, List<String> researchIntrests, List<String> researchConferences,  List<Profile> followers) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.day = day;
		this.month = month;
		this.year = year;
		this.email = email;
		this.pastWorks = pastWorks;
		this.researchIntrest = researchIntrests;
		this.researchConference = researchConferences;
		this.followers = followers;
	}
	
	/**
	 * @param lastName
	 * @param firstName
	 * @param day
	 * @param month
	 * @param year
	 * @param email
	 * @param pastWorks
	 * @param researches
	 */
	public Profile(String lastName, String firstName, Integer day, Integer month, Integer year, String email,
			List<String> pastWorks, List<String> researchIntrests, List<String> researchConferences) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.day = day;
		this.month = month;
		this.year = year;
		this.email = email;
		this.pastWorks = pastWorks;
		this.researchIntrest = researchIntrests;
		this.researchConference = researchConferences;
		this.followers = new ArrayList<>();
	}

	/**
	 *
	 */
	@Override
	public String toString() {
		return "Profile [firstName=" + firstName + ", lastName=" + lastName + ", day=" + day + ", month=" + month
				+ ", year=" + year + ", email=" + email + ", pastWorks=" + pastWorks + ", researchIntrest="
				+ researchIntrest + ", researchConference=" + researchConference + ", followers=" + followers + "]";
	}
	
	
}
