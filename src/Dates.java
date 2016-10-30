public class Dates {
	int day;
	int month;
	int year;

	public Dates() {
		// TODO Auto-generated constructor stub
day=0;
month=0;
year=0;
	}
	public void setInt(int a)
	{if(a<30)
		day=a;
	else
		day=a%30;
	
	}
	public void setMonth(int a)
	{if(a<12)
		month=a;
	else
		month=a%12;
	
	}
	public void setYear(int a)
	{year=a;
	
	}
public int getDay()
{return(day);

}
public int getMonth()
{return(month);
}
public int getYear()
{return(year);
}
public void displayDate()
{System.out.printf("the date is %d /%d /%d ",day,month,year);
}
}
