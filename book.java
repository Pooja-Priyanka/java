public class book{
	//attributes
	String title;
	String author;
	int year_of_publication;
	//constructor to initialize book details
	book(String title, String author, int year_of_publication){
	this.title=title;
	this.author=author;
	this.year_of_publication=year_of_publication;
	System.out.println("title of the book:" +title);
	System.out.println("author name:" +author);
	System.out.println("year of publication:" +year_of_publication);
	}
	public void Display(){
	System.out.println("title of the book:" +title);
	System.out.println("author name:" +author);
	System.out.println("year of publication:" +year_of_publication);
	}
 
     public static void main(String[] args) {
         // Creating c1
         book c1= new book("harry potter1","J.K.rowling",2007);

         // Creating c2
         book c2 = new book("harry potter2","J.K.rowling",2008);

     }
}
