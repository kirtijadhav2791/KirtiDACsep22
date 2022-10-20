import mypack.First;
import mypack.Second;

class AccessSpecifierDemo1
{
			public static void main(String args[])
			{
				First f=new First();
				System.out.println(f.a);
				//System.out.println(f.b); //c.T error becoz its define as private
			Second s=new Second();
			s.display();
			
			//Fourth f=new Fourth();
		f.display();
			
			}
}			
			