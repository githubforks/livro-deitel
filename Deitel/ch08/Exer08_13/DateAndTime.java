package ch08.Exer08_13;

public class DateAndTime
{
	   private int year;
	   private int month;
	   private int day;
	   private int hour;
	   private int minute;
	   private int second;

	   public DateAndTime( int second, int minute, int hour, int theMonth, int theDay, int theYear )
	   {
		  setTime(hour,minute,second);
		  year = checkYear(theYear);
	      month = checkMonth( theMonth );
	      day = checkDay( theDay );
	   }
	   
	   // TIME
	   public void setTime( int h, int m, int s )
	   {
	      setHour( h );
	      setMinute( m );
	      setSecond( s );
	   }
	   
	   public void setHour( int h )               
	   {                                          
	      hour = ( ( h >= 0 && h < 24 ) ? h : 0 );
	   }

	   public void setMinute( int m )               
	   {                                            
	      minute = ( ( m >= 0 && m < 60 ) ? m : 0 );
	   }

	   public void setSecond( int s )               
	   {                                            
	      second = ( ( s >= 0 && s < 60 ) ? s : 0 );
	   }
	   
	   public int getHour()   
	   {                      
	      return hour;        
	   }
	   
	   public int getMinute()   
	   {                        
	      return minute;        
	   }
	   
	   public int getSecond()   
	   {                        
	      return second;        
	   }
	   
	   public void tick()
	   {
		   if( second == 59 )
			   incrementMinute();
		   second = (second+1)%60;
	   }
	   public void incrementMinute()
	   {
		   if( minute == 59 )
			   incrementHour();
		   minute = (minute+1)%60;
	   }
	   public void incrementHour()
	   {
		   if( hour == 23 )
			   nextDay();
		   hour = (hour+1)%24;
	   }

	   // DATE
	   private int checkYear( int testYear )
	   {
	      if ( testYear > 1900 )
	         return testYear;
	      else
	         return 1900;
	   }
	   
	   private int checkMonth( int testMonth )
	   {
	      if ( testMonth > 0 && testMonth <= 12 )
	         return testMonth;
	      else
	         return 1;
	   }

	   private int checkDay( int testDay )
	   {
	      int daysPerMonth[] = 
	         { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	   
	      if ( testDay > 0 && testDay <= daysPerMonth[ month ] )
	         return testDay;
	   
	      if ( month == 2 && testDay == 29 && ( year % 400 == 0 || 
	           ( year % 4 == 0 && year % 100 != 0 ) ) )
	         return testDay;
	   
	      return 1;
	   }
	   
	   public int getDay()
	   {
		   return day;
	   }
	   
	   public int getMonth()
	   {
		   return month;
	   }
	   
	   public int getYear()
	   {
		   return year;
	   }
	   
	   public void nextDay()
	   {
		   if(day+1 == checkDay(day+1)){day+=1;}
		   else if(month+1 == checkMonth(month+1)){day=1; month+=1;}
		   else {day=1; month=1; year+=1;}
	   }
	   
	   public String toUniversalString()
	   {
	      return String.format( 
	         "%02d/%02d/%02d, %02d:%02d:%02d",
	         getMonth(), getDay() , getYear(),
	         getHour(), getMinute(), getSecond() );
	   }
	   
	   public String toString()
	   {
		  String date = "";
		  
		  switch (month)
		  {
		  	case 1:
		  		date="January";
		  		break;

		  	case 2:
		  		date="February";
		  		break;
		  		
		  	case 3:
		  		date="March";
		  		break;
		  		
		  	case 4:
		  		date="April";
		  		break;
		  		
		  	case 5:
		  		date="May";
		  		break;
		  		
		  	case 6:
		  		date="June";
		  		break;
		  		
		  	case 7:
		  		date="July";
		  		break;
		  		
		  	case 8:
		  		date="August";
		  		break;
		  		
		  	case 9:
		  		date="September";
		  		break;
		  		
		  	case 10:
		  		date="Octuber";
		  		break;
		  		
		  	case 11:
		  		date="November";
		  		break;
		  		
		  	case 12:
		  		date="December";
		  		break;
		}
		  
		  date += " " + day +", " + year + ".";
		  
	      return String.format( "%s %d:%02d:%02d %s", 
	    	date,( (getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12 ),
	        getMinute(), getSecond(), ( getHour() < 12 ? "AM" : "PM" ) );
	   }
}
