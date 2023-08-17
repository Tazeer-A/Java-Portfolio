import java.io.*;
import java.util.Scanner;



public class CompetitorList {
    
	

		// Main driver method
	    public static void main(String[] args) throws Exception
	    {
	 
	        try (
			FileReader fr = new FileReader(
	            "C:\\Users\\tazee\\Documents\\Assignment\\input.txt")) {
				int i;
			
			
				while ((i = fr.read()) != -1)
 
				
				    System.out.print((char)i);
		
		 
				
			FileReader Fread =new FileReader("input.txt"); 
	        PrintWriter Fwrite=new PrintWriter("output.txt") ; 
	        Fwrite.println("Competitor No          Level      Age       Scores     Overall");
	        
	        System.out.println("File is Copied"); 
	    
	        int c; 
	        while((c=Fread.read())!=-1) 
	           Fwrite.write((char)c); 
	        int a, b, highest_in;
	        double sum, highest_score;
	        double[] total_score = new double[10];
	        String[] contestant = {"Cristiano Ronaldo", "Jadon Sancho ", "Bruno Fernandes", "Paul Pogba ", "Marcus Rashford", "David de Gea", "Raphael Varane", "Alex Telles", "Fred", "Aaron Wan-Bissaka"};
	        double[][] score = { {5,5,5,4},
	        		{3,2,5,4},
	        		{4,5,3,5},
	        		{5,4,3,5},
	        		{2,3,3,5},
	        		{4,4,3,5},
	        		{4,4,4,5},
	        		{3,3,2,5},
	        		{2,3,4,4},
	        		{5,3,2,2}};
	
	        
	        for (a=0; a<10; a++) {
	        	sum = 0;
	        	
	        	Fwrite.println("Scores for " + contestant[a] + " : ");
	        	for (b=0; b<4; b++ ) {
	        		Fwrite.println(score[a][b] + ", ");
	        		sum += score[a][b];
	     
	 	    
	 	            
	        		
	        	}
	        	Fwrite.println("Total = " + sum);
	        	total_score[a] = sum;
	        

	        	
	        }
	        
	        
	        highest_score = total_score[0];
	        highest_in = 0;
	        for (a=1; a<10; a++) {
	        	if(total_score[a]>highest_score) {
	        		highest_in = a;
	        		highest_score = total_score[a];
	        	}
	        }
	        Fwrite.println("There are 10 competitors");
	        Fwrite.println("The person with the highest score is " + contestant[highest_in] + " with a score of "+
	        highest_score + "!");
	        Fread.close(); 
	        
	           
	           
	        File input = new File("input.txt");
	        FileReader f=null;
	        Scanner cd = new Scanner(System.in);
	        String SearchWord,str;
	        System.out.print("Enter Competitor Name:\n");
	        
	        SearchWord = cd.nextLine();
	        try {
	        	f = new FileReader(input);
	        		BufferedReader br = new BufferedReader(f);
	        		
	        		while ((str=br.readLine())!=null) {
	        			if(str.contains(SearchWord))
	        				System.out.print(str + "\n");
	        	          
	        		
	        		}}  
	        
	        	
	        	 
	        		
	        finally {
	        	f.close();
	        	cd.close();
	        	Fwrite.close();
	         	
	        	
	        }
	        
	        
	        }}}

	
        
	    

	    
			
	    
	   
	 
	

	

