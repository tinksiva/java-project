import java.util.concurrent.*;
import java.util.*;
public class Student {
public Dates duedate;
public library[] book;
int index;
public Student()
{    index=-1;
	book = new library[3];
	duedate.setInt(0);
	duedate.setMonth(0);
	duedate.setYear(0);
}
public void setDueDate(Dates r)
{
	duedate.setInt(r.getDay());
	duedate.setMonth(r.getMonth());
	duedate.setYear(r.getYear());
}
public void search()
{
	ExecutorService application=Executors.newCachedThreadPool();
	Scanner input = new Scanner(System.in);
	System.out.printf("\nenter the title to search for ");
	String t=input.next();
	System.out.printf("\nenter the subject based on whivh the books should be searched ");
	String a=input.next();
	application.execute(new SearchByTitle(t));
	application.execute(new SearchBysubject(a));
	application.shutdown();
}
public void setIndex()
{
	++index;
}
public int getIndex()
{
	return index;
}
public void setBook(library b)
{
	setIndex();
	book[index]=b;
}
public library getBook()
{
	return book[index];
}
public void display()
{
   for(int i=0;i<index;i++)
   {
	   System.out.printf("\n BOOK %d - %s",book[i].getBookName());
   }
}

}
