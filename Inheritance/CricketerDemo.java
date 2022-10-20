	class Cricketer
	{
		 String name;
		 String country;
		 int totMatches;
		 
		 void setDetails(String name,String country,int totMatches)
		 {
		   this.name=name;
		   this.country=country;
		   this.totMatches=totMatches;
		  }
		  void printDetails()
		  {
		     System.out.println(name);
			 System.out.println(country);
			 System.out.println(totMatches);
		  } 
	 }
	 class Batsman extends Cricketer
	 {
	    int totRuns;
		void setTotRuns(int totRuns)
		{
			this.totRuns=totRuns;
		}
		void printTotRuns()
		{
			System.out.println(totRuns);
		}
		
	  }
	  
	  class Bowler extends Cricketer
	  {
	    int totWickets;
		void setTotWicket(int totWickets)
		{
			this.totWickets = totWickets;
		}
		 void printTotWickets()
		 {
			 System.out.println(totWickets);
		 }
	   }
	    class CricketerDemo
		{
		  public static void main(String args[])
		  {
		    Cricketer c1 = new Cricketer();
			c1.setDetails("Sachin","India",400);
			c1.printDetails();
			
			Batsman bats1 = new Batsman();
			bats1.setDetails("Rohit Sharma","India",300); //will 
			bats1.setTotRuns(3000);
			bats1.printDetails();
			bats1.printTotRuns();
			
			Bowler bow1= new Bowler();
			bow1.setDetails("Bumrah","India",150);
			bow1.setTotWicket(350);
			bow1.printDetails();
			bow1.printTotWickets();
			
			
		  }
		}
			
		
	 
	 