
import java.io.*;
public class library implements Serializable 
{

	/**
	 * @param args
	 */
	
public int isbn;
public static String bookName;
public String authourName;
public String subject;
public String publisher;
public int quantity;
public library(int n,String b,String a,String s,String p,int q)
{
	isbn=n;
	bookName=b;
	authourName=a;
	subject=s;
	publisher=p;
	quantity=q;
}

public synchronized void setIsbn(int i)

{
	isbn=i;
}
public synchronized int getIsbn()
{
	return isbn;
}
public synchronized void setBookName(String a)
{
	bookName=a;
}
public synchronized String getBookName()
{
	return bookName;
}
public synchronized void setAuthourName(String a)
{
	authourName=a;
}
public synchronized String getAuthourName()
{
	return authourName;
}
public synchronized void setSubject(String a)
{
	subject=a;
}
public synchronized String getSubject()
{
	return subject;
}
public synchronized void setPublisher(String a)
{
	publisher=a;
}
public synchronized String getPublisher()
{
	return publisher;
}
public synchronized void setQuantity(int a)
{
	quantity=a;
}
public synchronized int getQuantity()
{
	return quantity;
}
}
