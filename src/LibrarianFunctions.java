import java.io.*;
import java.util.*;
public class LibrarianFunctions {
    public String title;
    public void issuebook(Student a)
    { 
    	Scanner input= new Scanner(System.in);
    	Dates b=new Dates();
    	if(a.getIndex()<3)
    	{    
    		System.out.printf("\nenter the todays date");
    		int d=input.nextInt();
    		int m=input.nextInt();
    		int y=input.nextInt();
    		b.setInt(d+7);
    		b.setMonth(m);
    		b.setYear(y);
    		a.setDueDate(b);
    		System.out.printf("\nenter the book title");
    		title=input.next();
    			try {
    			ObjectInputStream input2= new ObjectInputStream(new FileInputStream("book.ser"));
    		library book;
    		while((book = (library) input2.readObject())!=null)
    		{
    			
    			if(book.getBookName()==title)
    			{
    				System.out.printf("\nBook Details ");
    				System.out.printf("\nISBN NUMBER : %d \tBOOK NAME :%s\tAUTHOUR NAME: %s\tPUBLISHER: %s\tSUBJECT %s\tNUMBER OF BOOKS AVAILABLE : %d",book.getIsbn(),book.getBookName(),book.getAuthourName(),book.getPublisher(),book.getSubject(),book.getQuantity());
    				a.setBook(book);
    				break;
    			}
    		}
  
    			
    		}
    		catch(ClassNotFoundException e)
    		{
    			e.printStackTrace();
    		}

    		catch (FileNotFoundException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
    		catch (IOException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
    		System.out.printf("\nbooks has been issued");
    		
    		
    	}
    }
}
