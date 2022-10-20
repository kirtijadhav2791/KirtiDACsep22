import java.time.*;
class DateDemo
{	
		public static void main(String args[])
		{
			
			   void getPreviousDay()
				{
				
					LocalDate preday=LocalDate.minusday(1);
					System.out.println("Previous Day is: "+preday);
				}
		}
}		
				