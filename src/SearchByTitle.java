import java.lang.*;
import java.io.*;
public class SearchByTitle implements Runnable 
{ 
private String title;
public SearchByTitle(String t)
{
	title=t;
}
public void setTitle(String t)
{
	title=t;
}
public String getTitle(String t)
{
	return title;
}
public synchronized void run()
{int count=0;
	try {
	ObjectInputStream input= new ObjectInputStream(new FileInputStream("book.ser"));
library book;
while((book = (library) input.readObject())!=null)
{
	
	if(book.getBookName()==title)
	{
		System.out.printf("\nBook Details ");
		System.out.printf("\nISBN NUMBER : %d \tBOOK NAME :%s\tAUTHOUR NAME: %s\tPUBLISHER: %s\tSUBJECT %s\tNUMBER OF BOOKS AVAILABLE : %d",book.getIsbn(),book.getBookName(),book.getAuthourName(),book.getPublisher(),book.getSubject(),book.getQuantity());
	    ++count;
	}
}
if(count==0)
	{
	System.out.printf("\nrequired book not found");
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
}
}