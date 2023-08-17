

public class FootballCompetitor {
	
    String name;
    String name2;
    String name3;
    String initials;
    String initials2;
    String initials3;
	String CompetitorNo;
	String CompetitorNo2;
	String CompetitorNo3;
	String CN;
	String CN2;
	String CN3;
	int age;
	int age2;
	int age3;
	int level;
	int level2;
	int level3;
	String score;
	String score2;
	String score3;
	double ScoreArray;
	double ScoreArray2;
	double ScoreArray3;
	int array1;
	int array2;
	int array3;
	double average;
   
	

	public void setName(String name) {
		this.name = name;
	
	}
	
	public void setName2(String name2) {
		this.name2 = name2;
		
	}
	
	public void setName3(String name3) {
		this.name3 = name3;
		
	}
		
		
	
	public String getName() {
		return this.name;
		
		
	}
	
	public String getName2() {
		return this.name2;
		
		
	}
	
	public String getName3() {
		return this.name3;
		
		
	}
	
	public void setInitials(String initials) {
		this.initials = initials;
	}
	
	public String getInitials() {
		return this.initials;
	}
	
	public void setInitials2(String initials2) {
		this.initials2 = initials2;
	}
	
	public String getInitials2() {
		return this.initials2;
	}
	
	public void setInitials3(String initials3) {
		this.initials3 = initials3;
	}
	
	public String getInitials3() {
		return this.initials3;
	}
	
	
	public void setCompetitorNo(String CompetitorNo) {
		this.CompetitorNo = CompetitorNo;
	}
	
	public String getCompetitorNo() {
		return this.CompetitorNo;
	}
	
	public void setCompetitorNo2(String CompetitorNo2) {
		this.CompetitorNo2 = CompetitorNo2;
	}
	
	public String getCompetitorNo2() {
		return this.CompetitorNo2;
	}
	
	public void setCompetitorNo3(String CompetitorNo3) {
		this.CompetitorNo3 = CompetitorNo3;
	}
	
	public String getCompetitorNo3() {
		return this.CompetitorNo3;
	}
	
	public void setCN(String CN) {
		this.CN = CN;
	}
	
	public String getCN() {
		return this.CN;
	}
	
	public void setCN2(String CN2) {
		this.CN2 = CN2;
	}
	
	public String getCN2() {
		return this.CN2;
	}
	
	public void setCN3(String CN3) {
		this.CN3 = CN3;
	}
	
	public String getCN3() {
		return this.CN3;
	}
	
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge2(int age2) {
		this.age2 = age2;
	}
	
	public int getAge2() {
		return this.age2;
	}
	
	public void setAge3(int age3) {
		this.age3 = age3;
	}
	
	public int getAge3() {
		return this.age3;
	}
	
	public void setLevel(int Level) {
		this.level = Level;
	}
	
	public int getLevel() {
		return this.level;
	}
	
	public void setLevel2(int Level2) {
		this.level2 = Level2;
	}
	
	public int getLevel2() {
		return this.level2;
	}
	
	public void setLevel3(int Level3) {
		this.level3 = Level3;
	}
	
	public int getLevel3() {
		return this.level3;
	}
	
	public void setOverallScore(String score) {
		this.score = score;
	}
	
	public String getOverallScore() {
		return this.score;
	}
	
	public void setOverallScore2(String score2) {
		this.score2 = score2;
	}
	
	public String getOverallScore2() {
		return this.score2;
	}
	
	public void setOverallScore3(String score3) {
		this.score3 = score3;
	}
	
	public String getOverallScore3() {
		return this.score3;
	}
	
	public double getScoreArray() {
		int[] array1 = {5, 5, 5, 4};
		int length = 4;
		int sum = 0;
		
		for (int i = 0; i < length; i++) {
			sum += array1[i];
		}
		
		double average = sum / length;
		return average;
	}
	
	public double getScoreArray2() {
		int[] array2 = {3, 2, 5, 4};
		int length = 4;
		int sum = 0;
		
		for (int i = 0; i < length; i++) {
			sum += array2[i];
		}
		
		double average = sum / length;
		return average;
	}
	
	public double getScoreArray3() {
		int[] array3 = {4, 5, 3, 5};
		int length = 4;
		int sum = 0;
		
		for (int i = 0; i < length; i++) {
			sum += array3[i];
		}
		
		double average = sum / length;
		return average;
	}
	
	
	
	
	

	public static void main(String[] args) {
	   
	   FootballCompetitor c = new FootballCompetitor();
	   c.setName("Cristiano Ronaldo");
	   c.setName2("Jadon Sancho");
	   c.setName3("Bruno Fernandes");
	   c.setCompetitorNo("7");
	   c.setCompetitorNo2("25");
	   c.setCompetitorNo3("18");
	   c.setAge(37);
	   c.setAge2(22);
	   c.setAge3(27);
	   c.setOverallScore(" 5,5,5,4 ");
	   c.setOverallScore2(" 3,2,5,4 ");
	   c.setOverallScore3(" 4,5,3,5 ");
	   c.setLevel(5);
	   c.setLevel2(2);
	   c.setLevel3(4);
	   c.setInitials("CR");
	   c.setInitials2("JS");
	   c.setInitials3("BF");
	   c.setCN("7");
	   c.setCN2("25");
	   c.setCN3("18");
	   c.getFullDetails();
	   c.getShortDetails();
	   c.getScoreArray();
	   c.getScoreArray2();
	   c.getScoreArray3();
	   
	   
		    
	}
	
	public void getFullDetails() {
		System.out.println("Competitor number:" + getCompetitorNo());
		System.out.println("Name:" + getName() + "  Age: " + getAge());
		System.out.println("Competitor number " +  getCompetitorNo() +  " , " + getName() + " is a " +  " Level " + getLevel() + " aged " + getAge()
		+ " and recieved these scores" + getOverallScore()  + " and has an average score of " + getScoreArray() + "\n");
		
		System.out.println("Competitor number:" + getCompetitorNo2());
		System.out.println("Name:" + getName2() + "  Age: " + getAge2());
		System.out.println("Competitor number " +  getCompetitorNo2() +  " , " + getName2() + " is a " +  " Level " + getLevel2() + " aged " + getAge2()
		+ " and recieved these scores" + getOverallScore2()  + " and has an average score of " + getScoreArray2() + "\n");
		
		System.out.println("Competitor number:" + getCompetitorNo3());
		System.out.println("Name:" + getName3() + "  Age: " + getAge3());
		System.out.println("Competitor number " +  getCompetitorNo3() +  " , " + getName3() + " is a " +  " Level " + getLevel3() + " aged " + getAge3()
		+ " and recieved these scores" + getOverallScore3()  + " and has an average score of " + getScoreArray3() + "\n");
	}
	
	public void getShortDetails() {
	   System.out.println("CN " + getCN() + " (" + getInitials() + ") "  + " has overall score "
	   + getScoreArray());	 
	   
	   System.out.println("CN " + getCN2() + " (" + getInitials2() + ") "  + " has overall score "
	   + getScoreArray2());	 	
	   
	   System.out.println("CN " + getCN3() + " (" + getInitials3() + ") "  + " has overall score "
	   + getScoreArray3());	 	
	}
}

