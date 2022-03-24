import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Date;
import java.util.Scanner; 

class TestDate {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Please fill a day (1-31) :");
        int day = sc.nextInt();
        System.out.println("Please fill a month (1-12) :");
        int month = sc.nextInt();
        System.out.println("Please fill a year :");
        int year = sc.nextInt();
        sc.close();
    
    // set format for the date with sdf
    SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
    // set a specific day
    Calendar c = new GregorianCalendar(year, month, day);
    // create a date from object calendar
    Date d = c.getTime();   
        // printit
        {
            System.out.println("The date is : " + sdf.format(d));
            
        }
    //Calendar caldr = Calendar.getInstance();
    int dayoftheweek = c.get(Calendar.DAY_OF_WEEK);
        {
            System.out.println("The day of week is : " + dayoftheweek);
        }

    }  
}

