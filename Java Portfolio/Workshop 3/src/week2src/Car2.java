package week2src;

public class Car2 {
	//instance variables
	  private String model;  
	  private int tankSize;
	  private int GPL;
	  private double manfMPG;
	  private String Ownername;
	  private String fulln;
	 
	 
	  //constructor
	  public Car2(String model, int tank, double mpg, String name, int GPL, String fulln)
	  {                          
	    this.model = model;
	    tankSize = tank;
	    manfMPG = mpg;
	    Ownername = name;
	    this.GPL = GPL;
	    this.setFulln(fulln);
	  
	  }
	//set value of model
	  public void setOwner(String name) {
		  Ownername = name;
		  String fulln = "Tazeer Alam";
		  int firstn = fulln.indexOf("");
		  System.out.println(fulln.substring(0,firstn));
	  }
	  
	  public String getOwner() {
		  return Ownername;
	  }
	  
	  
	  public String getFulln() {
		return fulln;
	}
	public void setFulln(String fulln) {
		this.fulln = fulln;
	}
	public void setModel(String model) {
	  this.model = model;
	  }
	    
	  //Return model
	  public String getModel() {
	  return model;
	  }
	  
	  
	//set value of model
	  public void setTankSize(int tank) {
	  tankSize = tank;
	  
	  if (tank <35) {
		  System.out.println("good fuel consumption");
	  }
	  else {
		   if(tank > 35) {
			   System.out.println("Inefficient fuel use");
		   }
		   
		   else {
			   System.out.println("Average consumer");
		   }
		  
	  }
	  }
	    
	  //Return tankSize
	  public int getTankSize() {
	  return tankSize;
	  }
	  
	  public void setGPL(int GPL) {
		  this.GPL = GPL;
	  }
	  
	  public int getGPL() {
		  return GPL;
	  }
	 
	  //estimate distance car can travel
	  public double estimateDistance()
	  {
	  //there are 0.22 gallons per litre
	  return tankSize * manfMPG * GPL;
	  }   
	 
}
