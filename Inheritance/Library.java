class Book
{
		  String title;
		  string author;
		  int noOfPages;
		  double price;
		  string publisher;
		  Book()
		  {
		  }
		  Book(String title,string author,int noOfPages,double price,string publisher)
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
		Library()
		{
		}
		Book arrBook[]=new Book[5];
		int count=0;
		void addBook(String title,string author,int noOfPages,double price,string publisher)
		{
			Book bk=new Book();
			//Book bk=new Book("CoreJava","Herbert Schildt",1057,710.0,"McGraw Hill Education");
			arrBook[count]=bk;
			System.out.Println("Book added in Liabrary: "+arrBook[count]);
			count++;
		}	
		void removeBook()
		{
			arrBook[--count]=null;
		}

class BookLibrary
{
		public static void main(String args[])
		{
			Library l=new Library();
			l.add("CoreJava","Herbert Schildt",1057,710.0,"McGraw Hill Education");
		}
}		
	