import java.util.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
public class Writebook {
	private static final ObjectOutputStream NULL = null;
	private ObjectOutputStream output;
	void openFile()
	{ 
	try {
		output = new ObjectOutputStream(new FileOutputStream("book.ser"));
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
}
	void write()
	{
	library book;
	Scanner input= new Scanner(System.in);
	int quantity;
	int no;
	String title;
	String subject;
	String publisher;
	String authour;
	System.out.print("\nenter end of file charachter to terminate");
	System.out.print("\nenter the book title");
	while(input.hasNext())
	{
		title = input.next();
		System.out.printf("\nenter isbn number ");
		no= input.nextInt();
		System.out.printf("\nenter the subject name");
		subject=input.next();
		System.out.printf("\nenter authour name");
		authour=input.next();
		System.out.printf("\nenter publisher name");
		publisher=input.next();
		System.out.printf("\nenter the no of books to be added");
		quantity=input.nextInt();
		book=new library(no,title,authour,subject,publisher,quantity);
		try {
			output.writeObject(book);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	System.out.print("\nenter title");	

	}
	}
	public void closeFile()
	{
		if (output!=NULL)
			try {
				output.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}