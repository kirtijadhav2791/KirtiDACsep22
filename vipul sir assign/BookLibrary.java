import java.util.*;
class Book
{
		  String title;
		  String author;
		  int noOfPages;
		  double price;
		  String publisher;
		  Book()
		  {
		  }
		  Book(String title,String author,int noOfPages,double price,String publisher)
		  {
			this.title=title;
			this.author=author;
			this.noOfPages=noOfPages;
			this.price=price;
		    this.publisher=publisher;
		  }
}
class Library extends Book
{
	Scanner sc=new Scanner(System.in);
	int num;
		Library()
		{
			/*System.out.println("Enter no. of books:");
			 num=sc.nextInt();*/
		}
		Book arrBook[]=new Book[5];
		int count=0;
		
		void addBook(String title,String author,int noOfPages,double price,String publisher)
		{
			//int n;
			Book bk=new Book();
		
			      arrBook[count]=bk;
	
			System.out.println("Book title:- "+title+"\nBook Author:- "+author+ "\nTotal No. of Pages:- "+noOfPages+"\nPrice of Book:- "+price+"\nPublisher of Book:- "+publisher);
			count++;
			Book bk1=new Book();
			System.out.println("Book title:- "+title+"\nBook Author:- "+author+ "\nTotal No. of Pages:- "+noOfPages+"\nPrice of Book:- "+price+"\nPublisher of Book:- "+publisher);
			count++;
			
		}	
		void removeBook()
		{
			
			arrBook[--count]=null;
			System.out.println("Book remove from library succssefully");
			System.out.println("Remaing Books in Library: "+count);
		}
}

class BookLibrary
{
		public static void main(String args[])
		{  
			int ch;
			Library lobj=new Library();
            Scanner sc=new Scanner(System.in);
			System.out.println("Enter Your Choice:");
			System.out.println("\n1.Add Book  \n2.Remove Book \n3.exit");
			ch=sc.nextInt();
		do{
				
			switch(ch)
			{
				case 1:
						lobj.addBook("CoreJava","Herbert Schildt",1057,710.0,"McGraw Hill Education");
									System.out.println("\n1.Add Book  \n2.Remove Book \n3.exit");
									ch=sc.nextInt();
						break;
				case 2:	lobj.removeBook();
									System.out.println("\n1.Add Book  \n2.Remove Book \n3.exit");
									ch=sc.nextInt();
						break;
				case 3: System.exit(0);
						break;
				default: System.out.println("\nYour Enter Wromg Choice");
			}
		}while(ch!=0);
				
		}
}		
	